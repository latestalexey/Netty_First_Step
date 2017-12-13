/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.cse.proxysorter;

import org.apache.camel.builder.RouteBuilder;

import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.component.cache.CacheConstants;
import org.apache.camel.processor.aggregate.AggregationStrategy;
import ru.cse.proxysorter.Message.Request11;
import ru.cse.proxysorter.Message.Request13;
import ru.cse.proxysorter.Message.Response12;
import ru.cse.proxysorter.Processors.*;



/**
 *
 * @author Oleynik
 */
public class ProxySorterBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        //********************************************************
        // Секция команды 11
        //INFO SERVER NAME te1; 185.65.22.28; 10.0.0.137

        from("netty4:tcp://localhost:4991?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg&sync=true")
                .to(ExchangePattern.InOnly,"seda:Request11")
                .pollEnrich("activemq:queue:Sorter.GetAnswerToRes11",-1, new Protetype_EnrichRequest11())
                .to("log:-----> Send response 12")
                ;

        from("seda:CreateMQ")
                .pollEnrich("activemq:queue:Sorter.enrichMsg",-1, new Protetype_EnrichRequest11());
        //********************************************************
        // Секция команды 13

        from("netty4:tcp://localhost:4992?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg&sync=true")
                .to("direct:Request13");

        // Секция открытия\закрытия\снятия выхода\мешка (Принцип ActiveMQ)
        //***********************************************************


        from("netty4:tcp://localhost:4993?decoders=#length-DecoderSorterTlg&encoders=#length-EncoderSorterTlg&sync=true")
                .pollEnrich("activemq:queue:Sorter.enrichMsg",-1,new UpdateOpenGate());

        //Сообщения от ТСД
        from("netty4:tcp://localhost:4999?decoders=#length-DecoderSorterTlg&sync=false")
                .choice()
                .when(simple("${body} is 'ru.cse.proxysorter.Message.Request111'")).to("direct:Request111").otherwise().to("activemq:queue:Sorter.enrichMsg"); //?timeToLive=500000


        //***********************************************************
        //Получили исходные данные, надо отправить запрос в 1с и сохранить соспоставление PLU - Штрихкод
        from("seda:Request11")
                .enrich("direct:RequestFrom1c",new Req11And1CAgregate())
                .to(ExchangePattern.InOnly,"direct:SaveToRepoSorter")
                .choice()
                .when(header("ReceivedCSP").isEqualTo("0")).to(ExchangePattern.InOnly,"activemq:queue:Sorter.Meashure").end()
                .process(new Req11toResp12())
                .to(ExchangePattern.InOnly,"activemq:queue:Sorter.GetAnswerToRes11")
                .to("log:-----> Finish request 11")
                 ;

//Получили исходные данные, надо отправить запрос в 1с, предварительно сконвертировав PLU в Штрихкод
        from("direct:Request13")
                .process(new ProcessorRequestSorter())
                .to("seda:ReadToRepoSorter")
                .to("cxf:bean:reportIncident")
                .process(new ProcessorRequest1C())
                ;


//111 код снятия мешка с ТСД отправляемый в 1C
        from("direct:Request111")
           .process(new Req111To1C())
           .to("cxf:bean:reportIncident");

//Все остальные операции, смена мешка и т.д.
        from("direct:RequestANY")
                .process(new ProcessorRequestSorter())
                .to("cxf:bean:reportIncident")
                .process(new ProcessorRequest1C())
                ;
        
//Прочитаем сопоставление PLU Штрих код
        from("seda:ReadToRepoSorter")
                    .setHeader(CacheConstants.CACHE_OPERATION, constant(CacheConstants.CACHE_OPERATION_GET))
                    .setHeader(CacheConstants.CACHE_KEY, exchangeProperty(ConstantsSorter.PROPERTY_PLK))
                    .enrich ( "cache://SorterPluBarcodeCache" , new Req13Agregate());


//Сохраним значение сопоставления PLU - штрих код        
        from("direct:SaveToRepoSorter")
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchng) throws Exception {

                        Message in = exchng.getIn();
                        Request11 resourceResponse =  in.getBody(Request11.class);

                        exchng.setProperty(String.valueOf(resourceResponse.getCodePLK()),resourceResponse.getBarcode1С());

                        in.setHeader("ReceivedCSP",resourceResponse.getStateSize());
                        in.setHeader(CacheConstants.CACHE_OPERATION, CacheConstants.CACHE_OPERATION_ADD);
                        in.setHeader(CacheConstants.CACHE_KEY, constant(resourceResponse.getCodePLK()));

                        //Если передали габариты то запишим данные в 1С

                    };})
                .to("cache://SorterPluBarcodeCache"
                        + "?maxElementsInMemory=1000"
                        +"&memoryStoreEvictionPolicy=MemoryStoreEvictionPolicy.FIFO" 
                        +"&overflowToDisk=true" 
                        +"&eternal=true" 
                        +"&timeToLiveSeconds=300"
//                        +"&timeToIdleSeconds=true" 
                        +"&diskPersistent=true" 
                        +"&diskExpiryThreadIntervalSeconds=300"
                );
        
// своего рода подзапрос в 1с для получения правильного штрих кода и номера выхода
       from("direct:RequestFrom1c")
                .process(new ProcessorRequestSorter())               
                .to("cxf:bean:reportIncident")
               .process(new Processor(){
            @Override
            public void process(Exchange exchng) throws Exception {
                Message in = exchng.getIn();
            }
        })
              ;
        
 //Отправим весогабариты в 1с
        from("activemq:queue:Sorter.Meashure")
                .process(new Processor13ToMeashure())
                .to("cxf:bean:MeashurementIncident");
    }
}


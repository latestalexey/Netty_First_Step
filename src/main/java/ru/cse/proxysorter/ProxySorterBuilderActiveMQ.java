package ru.cse.proxysorter;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;

public class ProxySorterBuilderActiveMQ  extends RouteBuilder{
    @Override
    public void configure() throws Exception {

        errorHandler(defaultErrorHandler()
                .maximumRedeliveries(-1)
                //.backOffMultiplier(5)
                .delayPattern("5:10000;10:60000")
                //.useExponentialBackOff()
                .retryAttemptedLogLevel(LoggingLevel.WARN));


        from("activemq:queue:Sorter.1CReplacingTheBag").to("cxf:bean:reportIncident");

        from ("activemq:queue:Sorter.CreateDocumentIn1C").to("cxf:bean:reportIncident");



    }
}

package ru.cse.APILk.Service1c;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-09-29T17:00:55.482+03:00
 * Generated source version: 3.1.7
 * 
 */
@WebService(targetNamespace = "http://www.cse-cargo.ru/client", name = "SorterExchangePortType")
@XmlSeeAlso({ObjectFactory.class})
public interface SorterExchangePortType {

    @WebMethod(operationName = "ProductDelivery", action = "http://www.cse-cargo.ru/client#SorterExchange:ProductDelivery")
    @RequestWrapper(localName = "ProductDelivery", targetNamespace = "http://www.cse-cargo.ru/client", className = "ru.cse.APILk.Service1c.ProductDelivery")
    @ResponseWrapper(localName = "ProductDeliveryResponse", targetNamespace = "http://www.cse-cargo.ru/client", className = "ru.cse.APILk.Service1c.ProductDeliveryResponse")
    @WebResult(name = "return", targetNamespace = "http://www.cse-cargo.ru/client")
    public java.lang.String productDelivery(
        @WebParam(name = "InParametrs", targetNamespace = "http://www.cse-cargo.ru/client")
        java.lang.String inParametrs
    );

    @WebMethod(operationName = "GetDataPushExit", action = "http://www.cse-cargo.ru/client#SorterExchange:GetDataPushExit")
    @RequestWrapper(localName = "GetDataPushExit", targetNamespace = "http://www.cse-cargo.ru/client", className = "ru.cse.APILk.Service1c.GetDataPushExit")
    @ResponseWrapper(localName = "GetDataPushExitResponse", targetNamespace = "http://www.cse-cargo.ru/client", className = "ru.cse.APILk.Service1c.GetDataPushExitResponse")
    @WebResult(name = "return", targetNamespace = "http://www.cse-cargo.ru/client")
    public java.lang.String getDataPushExit(
        @WebParam(name = "InParametrs", targetNamespace = "http://www.cse-cargo.ru/client")
        java.lang.String inParametrs,
        @WebParam(mode = WebParam.Mode.OUT, name = "SendExitNumber", targetNamespace = "http://www.cse-cargo.ru/client")
        javax.xml.ws.Holder<java.lang.String> sendExitNumber,
        @WebParam(mode = WebParam.Mode.OUT, name = "SendBarcode", targetNamespace = "http://www.cse-cargo.ru/client")
        javax.xml.ws.Holder<java.lang.String> sendBarcode
    );

    @WebMethod(operationName = "ProductPurposeManualLoading", action = "http://www.cse-cargo.ru/client#SorterExchange:ProductPurposeManualLoading")
    @RequestWrapper(localName = "ProductPurposeManualLoading", targetNamespace = "http://www.cse-cargo.ru/client", className = "ru.cse.APILk.Service1c.ProductPurposeManualLoading")
    @ResponseWrapper(localName = "ProductPurposeManualLoadingResponse", targetNamespace = "http://www.cse-cargo.ru/client", className = "ru.cse.APILk.Service1c.ProductPurposeManualLoadingResponse")
    @WebResult(name = "return", targetNamespace = "http://www.cse-cargo.ru/client")
    public java.lang.String productPurposeManualLoading(
        @WebParam(name = "InParametrs", targetNamespace = "http://www.cse-cargo.ru/client")
        java.lang.String inParametrs
    );

    @WebMethod(operationName = "ReplacingTheBag", action = "http://www.cse-cargo.ru/client#SorterExchange:ReplacingTheBag")
    @RequestWrapper(localName = "ReplacingTheBag", targetNamespace = "http://www.cse-cargo.ru/client", className = "ru.cse.APILk.Service1c.ReplacingTheBag")
    @ResponseWrapper(localName = "ReplacingTheBagResponse", targetNamespace = "http://www.cse-cargo.ru/client", className = "ru.cse.APILk.Service1c.ReplacingTheBagResponse")
    @WebResult(name = "return", targetNamespace = "http://www.cse-cargo.ru/client")
    public java.lang.String replacingTheBag(
        @WebParam(name = "InParametrs", targetNamespace = "http://www.cse-cargo.ru/client")
        java.lang.String inParametrs
    );
}

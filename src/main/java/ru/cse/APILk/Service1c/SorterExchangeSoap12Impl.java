
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ru.cse.APILk.Service1c;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.7
 * 2017-10-03T10:41:14.695+03:00
 * Generated source version: 3.1.7
 * 
 */

@javax.jws.WebService(
                      serviceName = "SorterExchange",
                      portName = "SorterExchangeSoap12",
                      targetNamespace = "http://www.cse-cargo.ru/client",
                      wsdlLocation = "http://web.cse.ru/cse82_AlexSt/ws/SorterExchange?wsdl",
                      endpointInterface = "ru.cse.APILk.Service1c.SorterExchangePortType")
                      
public class SorterExchangeSoap12Impl implements SorterExchangePortType {

    private static final Logger LOG = Logger.getLogger(SorterExchangeSoap12Impl.class.getName());

    /* (non-Javadoc)
     * @see ru.cse.APILk.Service1c.SorterExchangePortType#productDelivery(java.lang.String inParametrs)*
     */
    public java.lang.String productDelivery(java.lang.String inParametrs) { 
        LOG.info("Executing operation productDelivery");
        System.out.println(inParametrs);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ru.cse.APILk.Service1c.SorterExchangePortType#getDataPushExit(java.lang.String inParametrs, java.lang.String sendExitNumber, java.lang.String sendBarcode)*
     */
    public java.lang.String getDataPushExit(java.lang.String inParametrs, javax.xml.ws.Holder<java.lang.String> sendExitNumber, javax.xml.ws.Holder<java.lang.String> sendBarcode) { 
        LOG.info("Executing operation getDataPushExit");
        System.out.println(inParametrs);
        try {
            java.lang.String sendExitNumberValue = "";
            sendExitNumber.value = sendExitNumberValue;
            java.lang.String sendBarcodeValue = "";
            sendBarcode.value = sendBarcodeValue;
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ru.cse.APILk.Service1c.SorterExchangePortType#productPurposeManualLoading(java.lang.String inParametrs)*
     */
    public java.lang.String productPurposeManualLoading(java.lang.String inParametrs) { 
        LOG.info("Executing operation productPurposeManualLoading");
        System.out.println(inParametrs);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ru.cse.APILk.Service1c.SorterExchangePortType#replacingTheBag(java.lang.String inParametrs)*
     */
    public java.lang.String replacingTheBag(java.lang.String inParametrs) { 
        LOG.info("Executing operation replacingTheBag");
        System.out.println(inParametrs);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}

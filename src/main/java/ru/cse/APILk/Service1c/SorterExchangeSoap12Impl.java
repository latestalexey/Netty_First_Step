
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
 * 2017-12-27T14:14:00.459+03:00
 * Generated source version: 3.1.7
 * 
 */

@javax.jws.WebService(
                      serviceName = "SorterExchange",
                      portName = "SorterExchangeSoap12",
                      targetNamespace = "http://www.cse-cargo.ru/client",
                      wsdlLocation = "http://web.cse.ru/cse82_reg/ws/SorterExchange?wsdl",
                      endpointInterface = "ru.cse.APILk.Service1c.SorterExchangePortType")
                      
public class SorterExchangeSoap12Impl implements SorterExchangePortType {

    private static final Logger LOG = Logger.getLogger(SorterExchangeSoap12Impl.class.getName());

    /* (non-Javadoc)
     * @see ru.cse.APILk.Service1c.SorterExchangePortType#productDelivery(java.lang.String inParametrs, java.lang.String productCode)*
     */
    public java.lang.String productDelivery(java.lang.String inParametrs, java.lang.String productCode) { 
        LOG.info("Executing operation productDelivery");
        System.out.println(inParametrs);
        System.out.println(productCode);
        try {
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ru.cse.APILk.Service1c.SorterExchangePortType#getDataPushExit(java.lang.String inParametrs, java.lang.String sendExitNumber, java.lang.String sendBarcode, java.lang.String sendProductCode)*
     */
    public java.lang.String getDataPushExit(java.lang.String inParametrs, javax.xml.ws.Holder<java.lang.String> sendExitNumber, javax.xml.ws.Holder<java.lang.String> sendBarcode, javax.xml.ws.Holder<java.lang.String> sendProductCode) { 
        LOG.info("Executing operation getDataPushExit");
        System.out.println(inParametrs);
        try {
            java.lang.String sendExitNumberValue = "";
            sendExitNumber.value = sendExitNumberValue;
            java.lang.String sendBarcodeValue = "";
            sendBarcode.value = sendBarcodeValue;
            java.lang.String sendProductCodeValue = "";
            sendProductCode.value = sendProductCodeValue;
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
     * @see ru.cse.APILk.Service1c.SorterExchangePortType#replacingTheBag(java.lang.String inParametrs, java.lang.String bagCode, java.lang.String exitNumber, java.lang.String result)*
     */
    public java.lang.String replacingTheBag(java.lang.String inParametrs, java.lang.String bagCode, java.lang.String exitNumber, javax.xml.ws.Holder<java.lang.String> result) { 
        LOG.info("Executing operation replacingTheBag");
        System.out.println(inParametrs);
        System.out.println(bagCode);
        System.out.println(exitNumber);
        try {
            java.lang.String resultValue = "";
            result.value = resultValue;
            java.lang.String _return = "";
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}

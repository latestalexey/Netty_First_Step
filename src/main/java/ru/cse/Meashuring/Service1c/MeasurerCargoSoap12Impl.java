
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package ru.cse.Meashuring.Service1c;

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
 * 2018-06-14T10:05:52.817+03:00
 * Generated source version: 3.1.7
 * 
 */

@javax.jws.WebService(
                      serviceName = "MeasurerCargo",
                      portName = "MeasurerCargoSoap12",
                      targetNamespace = "http://www.cse-cargo.ru/MeasurerCargo",
                      wsdlLocation = "http://sp1/cse82_reg/ws/MeasurerCargo?wsdl",
                      endpointInterface = "ru.cse.Meashuring.Service1c.MeasurerCargoPortType")
                      
public class MeasurerCargoSoap12Impl implements MeasurerCargoPortType {

    private static final Logger LOG = Logger.getLogger(MeasurerCargoSoap12Impl.class.getName());

    /* (non-Javadoc)
     * @see ru.cse.Meashuring.Service1c.MeasurerCargoPortType#measurement(java.lang.String number, java.lang.Float length, java.lang.Float height, java.lang.Float width, java.lang.Float weight)*
     */
    public ru.cse.Meashuring.Service1c.ResultString measurement(java.lang.String number, java.lang.Float length, java.lang.Float height, java.lang.Float width, java.lang.Float weight) { 
        LOG.info("Executing operation measurement");
        System.out.println(number);
        System.out.println(length);
        System.out.println(height);
        System.out.println(width);
        System.out.println(weight);
        try {
            ru.cse.Meashuring.Service1c.ResultString _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see ru.cse.Meashuring.Service1c.MeasurerCargoPortType#fotoCargo(java.lang.String number, java.lang.String foto)*
     */
    public ru.cse.Meashuring.Service1c.ResultString fotoCargo(java.lang.String number, java.lang.String foto) { 
        LOG.info("Executing operation fotoCargo");
        System.out.println(number);
        System.out.println(foto);
        try {
            ru.cse.Meashuring.Service1c.ResultString _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}

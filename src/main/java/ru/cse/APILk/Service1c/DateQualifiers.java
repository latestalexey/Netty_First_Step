
package ru.cse.APILk.Service1c;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateQualifiers complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateQualifiers"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateFractions" type="{http://v8.1c.ru/8.1/data/core}DateFractions"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateQualifiers", propOrder = {
    "dateFractions"
})
public class DateQualifiers {

    @XmlElement(name = "DateFractions", required = true)
    @XmlSchemaType(name = "string")
    protected DateFractions dateFractions;

    /**
     * Gets the value of the dateFractions property.
     * 
     * @return
     *     possible object is
     *     {@link DateFractions }
     *     
     */
    public DateFractions getDateFractions() {
        return dateFractions;
    }

    /**
     * Sets the value of the dateFractions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFractions }
     *     
     */
    public void setDateFractions(DateFractions value) {
        this.dateFractions = value;
    }

}

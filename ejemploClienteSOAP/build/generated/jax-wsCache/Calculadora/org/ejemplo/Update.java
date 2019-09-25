
package org.ejemplo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for update complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="update">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="per" type="{http://ejemplo.org/}persona" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "update", propOrder = {
    "per"
})
public class Update {

    protected Persona per;

    /**
     * Gets the value of the per property.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getPer() {
        return per;
    }

    /**
     * Sets the value of the per property.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setPer(Persona value) {
        this.per = value;
    }

}

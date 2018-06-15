
package de.vitero.schema.booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="bookingid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bookingcollision" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="modulecollision" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "createBookingResponse")
public class CreateBookingResponse {

    protected int bookingid;
    protected Boolean bookingcollision;
    protected Boolean modulecollision;

    /**
     * Obtient la valeur de la propriété bookingid.
     * 
     */
    public int getBookingid() {
        return bookingid;
    }

    /**
     * Définit la valeur de la propriété bookingid.
     * 
     */
    public void setBookingid(int value) {
        this.bookingid = value;
    }

    /**
     * Obtient la valeur de la propriété bookingcollision.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBookingcollision() {
        return bookingcollision;
    }

    /**
     * Définit la valeur de la propriété bookingcollision.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBookingcollision(Boolean value) {
        this.bookingcollision = value;
    }

    /**
     * Obtient la valeur de la propriété modulecollision.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModulecollision() {
        return modulecollision;
    }

    /**
     * Définit la valeur de la propriété modulecollision.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModulecollision(Boolean value) {
        this.modulecollision = value;
    }

}

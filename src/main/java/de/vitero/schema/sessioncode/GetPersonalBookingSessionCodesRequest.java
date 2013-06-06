
package de.vitero.schema.sessioncode;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bookingid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "getPersonalBookingSessionCodesRequest")
public class GetPersonalBookingSessionCodesRequest {

    protected int userid;
    protected int bookingid;
    protected String timezone;

    /**
     * Obtient la valeur de la propriété userid.
     * 
     */
    public int getUserid() {
        return userid;
    }

    /**
     * Définit la valeur de la propriété userid.
     * 
     */
    public void setUserid(int value) {
        this.userid = value;
    }

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
     * Obtient la valeur de la propriété timezone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Définit la valeur de la propriété timezone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
    }

}

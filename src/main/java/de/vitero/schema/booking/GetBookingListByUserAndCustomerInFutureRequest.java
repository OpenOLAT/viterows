
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
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="customerid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlRootElement(name = "getBookingListByUserAndCustomerInFutureRequest")
public class GetBookingListByUserAndCustomerInFutureRequest {

    protected int userid;
    protected int customerid;
    protected String timezone;
    protected String eventname;

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
     * Obtient la valeur de la propriété customerid.
     * 
     */
    public int getCustomerid() {
        return customerid;
    }

    /**
     * Définit la valeur de la propriété customerid.
     * 
     */
    public void setCustomerid(int value) {
        this.customerid = value;
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

    /**
     * Obtient la valeur de la propriété eventname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventname() {
        return eventname;
    }

    /**
     * Définit la valeur de la propriété eventname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventname(String value) {
        this.eventname = value;
    }

}

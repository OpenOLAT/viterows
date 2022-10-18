
package de.vitero.schema.booking;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startbuffer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="endbuffer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventcomment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventcompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventreferent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventsubtitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strictwsdl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="html5client" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="inspire" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlRootElement(name = "updateBookingRequest")
public class UpdateBookingRequest {

    protected int bookingid;
    protected String start;
    protected String end;
    protected Integer startbuffer;
    protected Integer endbuffer;
    protected String timezone;
    protected String eventname;
    protected String eventcomment;
    protected String eventcompany;
    protected String eventreferent;
    protected String eventsubtitle;
    protected Boolean strictwsdl;
    @XmlElement(name = "html5client")
    protected Boolean html5Client;
    protected Boolean inspire;

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
     * Obtient la valeur de la propriété start.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * Définit la valeur de la propriété start.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * Obtient la valeur de la propriété end.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * Définit la valeur de la propriété end.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * Obtient la valeur de la propriété startbuffer.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStartbuffer() {
        return startbuffer;
    }

    /**
     * Définit la valeur de la propriété startbuffer.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartbuffer(Integer value) {
        this.startbuffer = value;
    }

    /**
     * Obtient la valeur de la propriété endbuffer.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndbuffer() {
        return endbuffer;
    }

    /**
     * Définit la valeur de la propriété endbuffer.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndbuffer(Integer value) {
        this.endbuffer = value;
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

    /**
     * Obtient la valeur de la propriété eventcomment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventcomment() {
        return eventcomment;
    }

    /**
     * Définit la valeur de la propriété eventcomment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventcomment(String value) {
        this.eventcomment = value;
    }

    /**
     * Obtient la valeur de la propriété eventcompany.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventcompany() {
        return eventcompany;
    }

    /**
     * Définit la valeur de la propriété eventcompany.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventcompany(String value) {
        this.eventcompany = value;
    }

    /**
     * Obtient la valeur de la propriété eventreferent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventreferent() {
        return eventreferent;
    }

    /**
     * Définit la valeur de la propriété eventreferent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventreferent(String value) {
        this.eventreferent = value;
    }

    /**
     * Obtient la valeur de la propriété eventsubtitle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventsubtitle() {
        return eventsubtitle;
    }

    /**
     * Définit la valeur de la propriété eventsubtitle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventsubtitle(String value) {
        this.eventsubtitle = value;
    }

    /**
     * Obtient la valeur de la propriété strictwsdl.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStrictwsdl() {
        return strictwsdl;
    }

    /**
     * Définit la valeur de la propriété strictwsdl.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrictwsdl(Boolean value) {
        this.strictwsdl = value;
    }

    /**
     * Obtient la valeur de la propriété html5Client.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHtml5Client() {
        return html5Client;
    }

    /**
     * Définit la valeur de la propriété html5Client.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHtml5Client(Boolean value) {
        this.html5Client = value;
    }

    /**
     * Obtient la valeur de la propriété inspire.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInspire() {
        return inspire;
    }

    /**
     * Définit la valeur de la propriété inspire.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInspire(Boolean value) {
        this.inspire = value;
    }

}

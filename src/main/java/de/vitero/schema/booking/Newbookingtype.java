
package de.vitero.schema.booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour newbookingtype complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="newbookingtype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="startbuffer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="endbuffer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="groupid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="roomsize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ignorefaults" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="cafe" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="capture" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.vitero.de/schema/booking}phonetype" minOccurs="0"/&gt;
 *         &lt;element name="pcstateokrequired" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="repetitionpattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="repetitionenddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventcomment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventcompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventreferent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventsubtitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="audience" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "newbookingtype", propOrder = {

})
public class Newbookingtype {

    @XmlElement(required = true)
    protected String start;
    @XmlElement(required = true)
    protected String end;
    protected int startbuffer;
    protected int endbuffer;
    protected int groupid;
    protected int roomsize;
    protected Boolean ignorefaults;
    protected Boolean cafe;
    protected Boolean capture;
    protected Phonetype phone;
    protected Boolean pcstateokrequired;
    protected String repetitionpattern;
    protected String repetitionenddate;
    protected String timezone;
    protected String eventname;
    protected String eventcomment;
    protected String eventcompany;
    protected String eventreferent;
    protected String eventsubtitle;
    protected Boolean audience;
    @XmlElement(name = "html5client")
    protected Boolean html5Client;
    protected Boolean inspire;

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
     */
    public int getStartbuffer() {
        return startbuffer;
    }

    /**
     * Définit la valeur de la propriété startbuffer.
     * 
     */
    public void setStartbuffer(int value) {
        this.startbuffer = value;
    }

    /**
     * Obtient la valeur de la propriété endbuffer.
     * 
     */
    public int getEndbuffer() {
        return endbuffer;
    }

    /**
     * Définit la valeur de la propriété endbuffer.
     * 
     */
    public void setEndbuffer(int value) {
        this.endbuffer = value;
    }

    /**
     * Obtient la valeur de la propriété groupid.
     * 
     */
    public int getGroupid() {
        return groupid;
    }

    /**
     * Définit la valeur de la propriété groupid.
     * 
     */
    public void setGroupid(int value) {
        this.groupid = value;
    }

    /**
     * Obtient la valeur de la propriété roomsize.
     * 
     */
    public int getRoomsize() {
        return roomsize;
    }

    /**
     * Définit la valeur de la propriété roomsize.
     * 
     */
    public void setRoomsize(int value) {
        this.roomsize = value;
    }

    /**
     * Obtient la valeur de la propriété ignorefaults.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnorefaults() {
        return ignorefaults;
    }

    /**
     * Définit la valeur de la propriété ignorefaults.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnorefaults(Boolean value) {
        this.ignorefaults = value;
    }

    /**
     * Obtient la valeur de la propriété cafe.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCafe() {
        return cafe;
    }

    /**
     * Définit la valeur de la propriété cafe.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCafe(Boolean value) {
        this.cafe = value;
    }

    /**
     * Obtient la valeur de la propriété capture.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCapture() {
        return capture;
    }

    /**
     * Définit la valeur de la propriété capture.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCapture(Boolean value) {
        this.capture = value;
    }

    /**
     * Obtient la valeur de la propriété phone.
     * 
     * @return
     *     possible object is
     *     {@link Phonetype }
     *     
     */
    public Phonetype getPhone() {
        return phone;
    }

    /**
     * Définit la valeur de la propriété phone.
     * 
     * @param value
     *     allowed object is
     *     {@link Phonetype }
     *     
     */
    public void setPhone(Phonetype value) {
        this.phone = value;
    }

    /**
     * Obtient la valeur de la propriété pcstateokrequired.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPcstateokrequired() {
        return pcstateokrequired;
    }

    /**
     * Définit la valeur de la propriété pcstateokrequired.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPcstateokrequired(Boolean value) {
        this.pcstateokrequired = value;
    }

    /**
     * Obtient la valeur de la propriété repetitionpattern.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepetitionpattern() {
        return repetitionpattern;
    }

    /**
     * Définit la valeur de la propriété repetitionpattern.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepetitionpattern(String value) {
        this.repetitionpattern = value;
    }

    /**
     * Obtient la valeur de la propriété repetitionenddate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepetitionenddate() {
        return repetitionenddate;
    }

    /**
     * Définit la valeur de la propriété repetitionenddate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepetitionenddate(String value) {
        this.repetitionenddate = value;
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
     * Obtient la valeur de la propriété audience.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAudience() {
        return audience;
    }

    /**
     * Définit la valeur de la propriété audience.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAudience(Boolean value) {
        this.audience = value;
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

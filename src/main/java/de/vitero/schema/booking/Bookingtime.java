
package de.vitero.schema.booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour bookingtime complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="bookingtime"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="bookingtimeid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bookingid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="groupid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="roomsize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cafe" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="capture" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="phone" type="{http://www.vitero.de/schema/booking}phonetype"/&gt;
 *         &lt;element name="pcstateokrequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="startbuffer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="endbuffer" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookingtime", propOrder = {

})
public class Bookingtime {

    protected int bookingtimeid;
    protected int bookingid;
    protected int groupid;
    protected int roomsize;
    protected boolean cafe;
    protected boolean capture;
    @XmlElement(required = true)
    protected Phonetype phone;
    protected boolean pcstateokrequired;
    @XmlElement(required = true)
    protected String start;
    @XmlElement(required = true)
    protected String end;
    protected int startbuffer;
    protected int endbuffer;

    /**
     * Obtient la valeur de la propriété bookingtimeid.
     * 
     */
    public int getBookingtimeid() {
        return bookingtimeid;
    }

    /**
     * Définit la valeur de la propriété bookingtimeid.
     * 
     */
    public void setBookingtimeid(int value) {
        this.bookingtimeid = value;
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
     * Obtient la valeur de la propriété cafe.
     * 
     */
    public boolean isCafe() {
        return cafe;
    }

    /**
     * Définit la valeur de la propriété cafe.
     * 
     */
    public void setCafe(boolean value) {
        this.cafe = value;
    }

    /**
     * Obtient la valeur de la propriété capture.
     * 
     */
    public boolean isCapture() {
        return capture;
    }

    /**
     * Définit la valeur de la propriété capture.
     * 
     */
    public void setCapture(boolean value) {
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
     */
    public boolean isPcstateokrequired() {
        return pcstateokrequired;
    }

    /**
     * Définit la valeur de la propriété pcstateokrequired.
     * 
     */
    public void setPcstateokrequired(boolean value) {
        this.pcstateokrequired = value;
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

}

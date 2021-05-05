
package de.vitero.schema.booking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java pour booking complex type.
 * 
 * &lt;p&gt;Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="booking"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="bookingid" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="groupid" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="roomsize" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="cafe" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="capture" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="phone" type="{http://www.vitero.de/schema/booking}phonetype"/&amp;gt;
 *         &amp;lt;element name="pcstateokrequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="startbuffer" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="endbuffer" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="eventname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="eventcomment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="eventcompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="eventreferent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="eventsubtitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="repetitionpattern" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="repetitionenddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="html5client" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="inspire" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="addexceptions" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="bookingtime" maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *                     &amp;lt;complexType&amp;gt;
 *                       &amp;lt;complexContent&amp;gt;
 *                         &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                           &amp;lt;all&amp;gt;
 *                             &amp;lt;element name="bookingtimeid" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *                             &amp;lt;element name="roomsize" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *                             &amp;lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                             &amp;lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                             &amp;lt;element name="startbuffer" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *                             &amp;lt;element name="endbuffer" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *                           &amp;lt;/all&amp;gt;
 *                         &amp;lt;/restriction&amp;gt;
 *                       &amp;lt;/complexContent&amp;gt;
 *                     &amp;lt;/complexType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="subtractexceptions" minOccurs="0"&amp;gt;
 *           &amp;lt;complexType&amp;gt;
 *             &amp;lt;complexContent&amp;gt;
 *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                 &amp;lt;sequence&amp;gt;
 *                   &amp;lt;element name="bookingtime" maxOccurs="unbounded" minOccurs="0"&amp;gt;
 *                     &amp;lt;complexType&amp;gt;
 *                       &amp;lt;complexContent&amp;gt;
 *                         &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *                           &amp;lt;all&amp;gt;
 *                             &amp;lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                             &amp;lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *                           &amp;lt;/all&amp;gt;
 *                         &amp;lt;/restriction&amp;gt;
 *                       &amp;lt;/complexContent&amp;gt;
 *                     &amp;lt;/complexType&amp;gt;
 *                   &amp;lt;/element&amp;gt;
 *                 &amp;lt;/sequence&amp;gt;
 *               &amp;lt;/restriction&amp;gt;
 *             &amp;lt;/complexContent&amp;gt;
 *           &amp;lt;/complexType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "booking", propOrder = {

})
public class Booking_Type {

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
    protected String eventname;
    protected String eventcomment;
    protected String eventcompany;
    protected String eventreferent;
    protected String eventsubtitle;
    @XmlElement(required = true)
    protected String repetitionpattern;
    protected String repetitionenddate;
    @XmlElement(name = "html5client")
    protected Boolean html5Client;
    protected boolean inspire;
    protected Booking_Type.Addexceptions addexceptions;
    protected Booking_Type.Subtractexceptions subtractexceptions;

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
     */
    public boolean isInspire() {
        return inspire;
    }

    /**
     * Définit la valeur de la propriété inspire.
     * 
     */
    public void setInspire(boolean value) {
        this.inspire = value;
    }

    /**
     * Obtient la valeur de la propriété addexceptions.
     * 
     * @return
     *     possible object is
     *     {@link Booking_Type.Addexceptions }
     *     
     */
    public Booking_Type.Addexceptions getAddexceptions() {
        return addexceptions;
    }

    /**
     * Définit la valeur de la propriété addexceptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Booking_Type.Addexceptions }
     *     
     */
    public void setAddexceptions(Booking_Type.Addexceptions value) {
        this.addexceptions = value;
    }

    /**
     * Obtient la valeur de la propriété subtractexceptions.
     * 
     * @return
     *     possible object is
     *     {@link Booking_Type.Subtractexceptions }
     *     
     */
    public Booking_Type.Subtractexceptions getSubtractexceptions() {
        return subtractexceptions;
    }

    /**
     * Définit la valeur de la propriété subtractexceptions.
     * 
     * @param value
     *     allowed object is
     *     {@link Booking_Type.Subtractexceptions }
     *     
     */
    public void setSubtractexceptions(Booking_Type.Subtractexceptions value) {
        this.subtractexceptions = value;
    }


    /**
     * &lt;p&gt;Classe Java pour anonymous complex type.
     * 
     * &lt;p&gt;Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="bookingtime" maxOccurs="unbounded" minOccurs="0"&amp;gt;
     *           &amp;lt;complexType&amp;gt;
     *             &amp;lt;complexContent&amp;gt;
     *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *                 &amp;lt;all&amp;gt;
     *                   &amp;lt;element name="bookingtimeid" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
     *                   &amp;lt;element name="roomsize" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
     *                   &amp;lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
     *                   &amp;lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
     *                   &amp;lt;element name="startbuffer" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
     *                   &amp;lt;element name="endbuffer" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
     *                 &amp;lt;/all&amp;gt;
     *               &amp;lt;/restriction&amp;gt;
     *             &amp;lt;/complexContent&amp;gt;
     *           &amp;lt;/complexType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bookingtime"
    })
    public static class Addexceptions {

        protected List<Booking_Type.Addexceptions.Bookingtime> bookingtime;

        /**
         * Gets the value of the bookingtime property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the bookingtime property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getBookingtime().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link Booking_Type.Addexceptions.Bookingtime }
         * 
         * 
         */
        public List<Booking_Type.Addexceptions.Bookingtime> getBookingtime() {
            if (bookingtime == null) {
                bookingtime = new ArrayList<Booking_Type.Addexceptions.Bookingtime>();
            }
            return this.bookingtime;
        }


        /**
         * &lt;p&gt;Classe Java pour anonymous complex type.
         * 
         * &lt;p&gt;Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * &lt;pre&gt;
         * &amp;lt;complexType&amp;gt;
         *   &amp;lt;complexContent&amp;gt;
         *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
         *       &amp;lt;all&amp;gt;
         *         &amp;lt;element name="bookingtimeid" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
         *         &amp;lt;element name="roomsize" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
         *         &amp;lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
         *         &amp;lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
         *         &amp;lt;element name="startbuffer" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
         *         &amp;lt;element name="endbuffer" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
         *       &amp;lt;/all&amp;gt;
         *     &amp;lt;/restriction&amp;gt;
         *   &amp;lt;/complexContent&amp;gt;
         * &amp;lt;/complexType&amp;gt;
         * &lt;/pre&gt;
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Bookingtime {

            protected int bookingtimeid;
            protected int roomsize;
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

    }


    /**
     * &lt;p&gt;Classe Java pour anonymous complex type.
     * 
     * &lt;p&gt;Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * &lt;pre&gt;
     * &amp;lt;complexType&amp;gt;
     *   &amp;lt;complexContent&amp;gt;
     *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *       &amp;lt;sequence&amp;gt;
     *         &amp;lt;element name="bookingtime" maxOccurs="unbounded" minOccurs="0"&amp;gt;
     *           &amp;lt;complexType&amp;gt;
     *             &amp;lt;complexContent&amp;gt;
     *               &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
     *                 &amp;lt;all&amp;gt;
     *                   &amp;lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
     *                   &amp;lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
     *                 &amp;lt;/all&amp;gt;
     *               &amp;lt;/restriction&amp;gt;
     *             &amp;lt;/complexContent&amp;gt;
     *           &amp;lt;/complexType&amp;gt;
     *         &amp;lt;/element&amp;gt;
     *       &amp;lt;/sequence&amp;gt;
     *     &amp;lt;/restriction&amp;gt;
     *   &amp;lt;/complexContent&amp;gt;
     * &amp;lt;/complexType&amp;gt;
     * &lt;/pre&gt;
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bookingtime"
    })
    public static class Subtractexceptions {

        protected List<Booking_Type.Subtractexceptions.Bookingtime> bookingtime;

        /**
         * Gets the value of the bookingtime property.
         * 
         * &lt;p&gt;
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a &lt;CODE&gt;set&lt;/CODE&gt; method for the bookingtime property.
         * 
         * &lt;p&gt;
         * For example, to add a new item, do as follows:
         * &lt;pre&gt;
         *    getBookingtime().add(newItem);
         * &lt;/pre&gt;
         * 
         * 
         * &lt;p&gt;
         * Objects of the following type(s) are allowed in the list
         * {@link Booking_Type.Subtractexceptions.Bookingtime }
         * 
         * 
         */
        public List<Booking_Type.Subtractexceptions.Bookingtime> getBookingtime() {
            if (bookingtime == null) {
                bookingtime = new ArrayList<Booking_Type.Subtractexceptions.Bookingtime>();
            }
            return this.bookingtime;
        }


        /**
         * &lt;p&gt;Classe Java pour anonymous complex type.
         * 
         * &lt;p&gt;Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * &lt;pre&gt;
         * &amp;lt;complexType&amp;gt;
         *   &amp;lt;complexContent&amp;gt;
         *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
         *       &amp;lt;all&amp;gt;
         *         &amp;lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
         *         &amp;lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
         *       &amp;lt;/all&amp;gt;
         *     &amp;lt;/restriction&amp;gt;
         *   &amp;lt;/complexContent&amp;gt;
         * &amp;lt;/complexType&amp;gt;
         * &lt;/pre&gt;
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Bookingtime {

            @XmlElement(required = true)
            protected String start;
            @XmlElement(required = true)
            protected String end;

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

        }

    }

}

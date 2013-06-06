
package de.vitero.schema.booking;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour booking complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="booking">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bookingid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="groupid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="roomsize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cafe" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="capture" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="phone" type="{http://www.vitero.de/schema/booking}phonetype"/>
 *         &lt;element name="pcstateokrequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="startbuffer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="endbuffer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="repetitionpattern" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="repetitionenddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addexceptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bookingtime" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="bookingtimeid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="roomsize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="startbuffer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                             &lt;element name="endbuffer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="subtractexceptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bookingtime" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/all>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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
    @XmlElement(required = true)
    protected String repetitionpattern;
    protected String repetitionenddate;
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
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="bookingtime" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="bookingtimeid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="roomsize" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="startbuffer" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                   &lt;element name="endbuffer" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingtime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingtime().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="bookingtimeid" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="roomsize" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="startbuffer" type="{http://www.w3.org/2001/XMLSchema}int"/>
         *         &lt;element name="endbuffer" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="bookingtime" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/all>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bookingtime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBookingtime().add(newItem);
         * </pre>
         * 
         * 
         * <p>
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
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="start" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="end" type="{http://www.w3.org/2001/XMLSchema}string"/>
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

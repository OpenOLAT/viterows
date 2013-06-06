
package de.vitero.schema.sessioncode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="sessioncode">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="bookingid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="expirationdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="codelength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                 &lt;/all>
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
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "createPersonalBookingSessionCodeRequest")
public class CreatePersonalBookingSessionCodeRequest {

    @XmlElement(required = true)
    protected CreatePersonalBookingSessionCodeRequest.Sessioncode sessioncode;

    /**
     * Obtient la valeur de la propriété sessioncode.
     * 
     * @return
     *     possible object is
     *     {@link CreatePersonalBookingSessionCodeRequest.Sessioncode }
     *     
     */
    public CreatePersonalBookingSessionCodeRequest.Sessioncode getSessioncode() {
        return sessioncode;
    }

    /**
     * Définit la valeur de la propriété sessioncode.
     * 
     * @param value
     *     allowed object is
     *     {@link CreatePersonalBookingSessionCodeRequest.Sessioncode }
     *     
     */
    public void setSessioncode(CreatePersonalBookingSessionCodeRequest.Sessioncode value) {
        this.sessioncode = value;
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
     *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="bookingid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="expirationdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="codelength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    public static class Sessioncode {

        protected int userid;
        protected int bookingid;
        protected String expirationdate;
        protected String timezone;
        protected Integer codelength;

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
         * Obtient la valeur de la propriété expirationdate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExpirationdate() {
            return expirationdate;
        }

        /**
         * Définit la valeur de la propriété expirationdate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExpirationdate(String value) {
            this.expirationdate = value;
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
         * Obtient la valeur de la propriété codelength.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCodelength() {
            return codelength;
        }

        /**
         * Définit la valeur de la propriété codelength.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCodelength(Integer value) {
            this.codelength = value;
        }

    }

}

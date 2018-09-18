
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="sessioncode"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="bookingid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="registrationdeadline" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="codelength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="registrationlimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
@XmlRootElement(name = "createAppointmentConfirmationSessionCodeRequest")
public class CreateAppointmentConfirmationSessionCodeRequest {

    @XmlElement(required = true)
    protected CreateAppointmentConfirmationSessionCodeRequest.Sessioncode sessioncode;

    /**
     * Obtient la valeur de la propriété sessioncode.
     * 
     * @return
     *     possible object is
     *     {@link CreateAppointmentConfirmationSessionCodeRequest.Sessioncode }
     *     
     */
    public CreateAppointmentConfirmationSessionCodeRequest.Sessioncode getSessioncode() {
        return sessioncode;
    }

    /**
     * Définit la valeur de la propriété sessioncode.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateAppointmentConfirmationSessionCodeRequest.Sessioncode }
     *     
     */
    public void setSessioncode(CreateAppointmentConfirmationSessionCodeRequest.Sessioncode value) {
        this.sessioncode = value;
    }


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
     *         &lt;element name="registrationdeadline" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="codelength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="registrationlimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
    public static class Sessioncode {

        protected int bookingid;
        protected int registrationdeadline;
        protected Integer role;
        protected Integer codelength;
        protected Integer registrationlimit;

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
         * Obtient la valeur de la propriété registrationdeadline.
         * 
         */
        public int getRegistrationdeadline() {
            return registrationdeadline;
        }

        /**
         * Définit la valeur de la propriété registrationdeadline.
         * 
         */
        public void setRegistrationdeadline(int value) {
            this.registrationdeadline = value;
        }

        /**
         * Obtient la valeur de la propriété role.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRole() {
            return role;
        }

        /**
         * Définit la valeur de la propriété role.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRole(Integer value) {
            this.role = value;
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

        /**
         * Obtient la valeur de la propriété registrationlimit.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRegistrationlimit() {
            return registrationlimit;
        }

        /**
         * Définit la valeur de la propriété registrationlimit.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRegistrationlimit(Integer value) {
            this.registrationlimit = value;
        }

    }

}

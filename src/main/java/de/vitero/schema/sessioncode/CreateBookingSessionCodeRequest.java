
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
 *                   &lt;element name="codelength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="allownotexistingusers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="allownotassignedusers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlRootElement(name = "createBookingSessionCodeRequest")
public class CreateBookingSessionCodeRequest {

    @XmlElement(required = true)
    protected CreateBookingSessionCodeRequest.Sessioncode sessioncode;

    /**
     * Obtient la valeur de la propriété sessioncode.
     * 
     * @return
     *     possible object is
     *     {@link CreateBookingSessionCodeRequest.Sessioncode }
     *     
     */
    public CreateBookingSessionCodeRequest.Sessioncode getSessioncode() {
        return sessioncode;
    }

    /**
     * Définit la valeur de la propriété sessioncode.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateBookingSessionCodeRequest.Sessioncode }
     *     
     */
    public void setSessioncode(CreateBookingSessionCodeRequest.Sessioncode value) {
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
     *         &lt;element name="codelength" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="allownotexistingusers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="allownotassignedusers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
        protected Integer codelength;
        protected Integer role;
        protected Boolean allownotexistingusers;
        protected Boolean allownotassignedusers;

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
         * Obtient la valeur de la propriété allownotexistingusers.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllownotexistingusers() {
            return allownotexistingusers;
        }

        /**
         * Définit la valeur de la propriété allownotexistingusers.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllownotexistingusers(Boolean value) {
            this.allownotexistingusers = value;
        }

        /**
         * Obtient la valeur de la propriété allownotassignedusers.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAllownotassignedusers() {
            return allownotassignedusers;
        }

        /**
         * Définit la valeur de la propriété allownotassignedusers.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAllownotassignedusers(Boolean value) {
            this.allownotassignedusers = value;
        }

    }

}

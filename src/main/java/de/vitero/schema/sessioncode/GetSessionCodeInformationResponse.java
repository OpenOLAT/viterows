
package de.vitero.schema.sessioncode;

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
 *         &lt;element name="sessioncode"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="bookingid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="groupid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="expirationdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="allownotexistingusers" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="allownotassignedusers" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlRootElement(name = "getSessionCodeInformationResponse")
public class GetSessionCodeInformationResponse {

    @XmlElement(required = true)
    protected GetSessionCodeInformationResponse.Sessioncode sessioncode;

    /**
     * Obtient la valeur de la propriété sessioncode.
     * 
     * @return
     *     possible object is
     *     {@link GetSessionCodeInformationResponse.Sessioncode }
     *     
     */
    public GetSessionCodeInformationResponse.Sessioncode getSessioncode() {
        return sessioncode;
    }

    /**
     * Définit la valeur de la propriété sessioncode.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSessionCodeInformationResponse.Sessioncode }
     *     
     */
    public void setSessioncode(GetSessionCodeInformationResponse.Sessioncode value) {
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
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="bookingid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="groupid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="expirationdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="allownotexistingusers" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="allownotassignedusers" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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

        @XmlElement(required = true)
        protected String type;
        protected int userid;
        protected Integer bookingid;
        protected Integer groupid;
        protected String expirationdate;
        protected boolean allownotexistingusers;
        protected boolean allownotassignedusers;

        /**
         * Obtient la valeur de la propriété type.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Définit la valeur de la propriété type.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

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
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getBookingid() {
            return bookingid;
        }

        /**
         * Définit la valeur de la propriété bookingid.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setBookingid(Integer value) {
            this.bookingid = value;
        }

        /**
         * Obtient la valeur de la propriété groupid.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getGroupid() {
            return groupid;
        }

        /**
         * Définit la valeur de la propriété groupid.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setGroupid(Integer value) {
            this.groupid = value;
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
         * Obtient la valeur de la propriété allownotexistingusers.
         * 
         */
        public boolean isAllownotexistingusers() {
            return allownotexistingusers;
        }

        /**
         * Définit la valeur de la propriété allownotexistingusers.
         * 
         */
        public void setAllownotexistingusers(boolean value) {
            this.allownotexistingusers = value;
        }

        /**
         * Obtient la valeur de la propriété allownotassignedusers.
         * 
         */
        public boolean isAllownotassignedusers() {
            return allownotassignedusers;
        }

        /**
         * Définit la valeur de la propriété allownotassignedusers.
         * 
         */
        public void setAllownotassignedusers(boolean value) {
            this.allownotassignedusers = value;
        }

    }

}

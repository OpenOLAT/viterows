
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
 *                   &lt;element name="groupid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="expirationdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlRootElement(name = "createGroupSessionCodeRequest")
public class CreateGroupSessionCodeRequest {

    @XmlElement(required = true)
    protected CreateGroupSessionCodeRequest.Sessioncode sessioncode;

    /**
     * Obtient la valeur de la propriété sessioncode.
     * 
     * @return
     *     possible object is
     *     {@link CreateGroupSessionCodeRequest.Sessioncode }
     *     
     */
    public CreateGroupSessionCodeRequest.Sessioncode getSessioncode() {
        return sessioncode;
    }

    /**
     * Définit la valeur de la propriété sessioncode.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateGroupSessionCodeRequest.Sessioncode }
     *     
     */
    public void setSessioncode(CreateGroupSessionCodeRequest.Sessioncode value) {
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
     *         &lt;element name="groupid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="expirationdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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

        protected int groupid;
        protected String expirationdate;
        protected String timezone;
        protected Integer codelength;
        protected Integer role;
        protected Boolean allownotexistingusers;
        protected Boolean allownotassignedusers;

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

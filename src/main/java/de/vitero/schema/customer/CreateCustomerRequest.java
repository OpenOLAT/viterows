
package de.vitero.schema.customer;

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
 *         &lt;element name="customer">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="shortname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="displayname" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlRootElement(name = "createCustomerRequest")
public class CreateCustomerRequest {

    @XmlElement(required = true)
    protected CreateCustomerRequest.Customer customer;

    /**
     * Obtient la valeur de la propriété customer.
     * 
     * @return
     *     possible object is
     *     {@link CreateCustomerRequest.Customer }
     *     
     */
    public CreateCustomerRequest.Customer getCustomer() {
        return customer;
    }

    /**
     * Définit la valeur de la propriété customer.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateCustomerRequest.Customer }
     *     
     */
    public void setCustomer(CreateCustomerRequest.Customer value) {
        this.customer = value;
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
     *         &lt;element name="shortname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="displayname" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    public static class Customer {

        @XmlElement(required = true)
        protected String shortname;
        @XmlElement(required = true)
        protected String displayname;

        /**
         * Obtient la valeur de la propriété shortname.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShortname() {
            return shortname;
        }

        /**
         * Définit la valeur de la propriété shortname.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShortname(String value) {
            this.shortname = value;
        }

        /**
         * Obtient la valeur de la propriété displayname.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisplayname() {
            return displayname;
        }

        /**
         * Définit la valeur de la propriété displayname.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisplayname(String value) {
            this.displayname = value;
        }

    }

}

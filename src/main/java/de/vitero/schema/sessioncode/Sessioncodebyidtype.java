
package de.vitero.schema.sessioncode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java pour sessioncodebyidtype complex type.
 * 
 * &lt;p&gt;Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="sessioncodebyidtype"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="expirationdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="allownotassignedusers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="allownotexistingusers" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sessioncodebyidtype", propOrder = {

})
public class Sessioncodebyidtype {

    @XmlElement(required = true)
    protected String code;
    protected String expirationdate;
    protected Boolean allownotassignedusers;
    protected Boolean allownotexistingusers;

    /**
     * Obtient la valeur de la propriété code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Définit la valeur de la propriété code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
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

}

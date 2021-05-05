
package de.vitero.schema.sessioncode;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &amp;lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="browserurl" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
 *         &amp;lt;element name="appurl" type="{http://www.w3.org/2001/XMLSchema}string"/&amp;gt;
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
@XmlRootElement(name = "createWebaccessSessionCodeResponse")
public class CreateWebaccessSessionCodeResponse {

    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String browserurl;
    @XmlElement(required = true)
    protected String appurl;

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
     * Obtient la valeur de la propriété browserurl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrowserurl() {
        return browserurl;
    }

    /**
     * Définit la valeur de la propriété browserurl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrowserurl(String value) {
        this.browserurl = value;
    }

    /**
     * Obtient la valeur de la propriété appurl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppurl() {
        return appurl;
    }

    /**
     * Définit la valeur de la propriété appurl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppurl(String value) {
        this.appurl = value;
    }

}

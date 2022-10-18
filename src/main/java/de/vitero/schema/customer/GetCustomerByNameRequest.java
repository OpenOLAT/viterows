
package de.vitero.schema.customer;

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
 *         &lt;element name="customername" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlRootElement(name = "getCustomerByNameRequest")
public class GetCustomerByNameRequest {

    @XmlElement(required = true)
    protected String customername;

    /**
     * Obtient la valeur de la propriété customername.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomername() {
        return customername;
    }

    /**
     * Définit la valeur de la propriété customername.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomername(String value) {
        this.customername = value;
    }

}

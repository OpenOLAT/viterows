
package de.vitero.schema.user;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="passwordLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "generatePasswordLinkResponse")
public class GeneratePasswordLinkResponse {

    @XmlElement(required = true)
    protected String passwordLink;

    /**
     * Obtient la valeur de la propriété passwordLink.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPasswordLink() {
        return passwordLink;
    }

    /**
     * Définit la valeur de la propriété passwordLink.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPasswordLink(String value) {
        this.passwordLink = value;
    }

}

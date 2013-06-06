
package de.vitero.schema.licence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="hasmodule" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlRootElement(name = "groupHasBookableModuleResponse")
public class GroupHasBookableModuleResponse {

    protected boolean hasmodule;

    /**
     * Obtient la valeur de la propriété hasmodule.
     * 
     */
    public boolean isHasmodule() {
        return hasmodule;
    }

    /**
     * Définit la valeur de la propriété hasmodule.
     * 
     */
    public void setHasmodule(boolean value) {
        this.hasmodule = value;
    }

}

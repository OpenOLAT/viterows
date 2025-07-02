
package de.vitero.schema.licence;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         <element name="hasmodule" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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

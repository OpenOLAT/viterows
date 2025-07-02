
package de.vitero.schema.group;

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
 *         <element name="role" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlRootElement(name = "getParticipantResponse")
public class GetParticipantResponse {

    protected int role;
    protected boolean enabled;

    /**
     * Obtient la valeur de la propriété role.
     * 
     */
    public int getRole() {
        return role;
    }

    /**
     * Définit la valeur de la propriété role.
     * 
     */
    public void setRole(int value) {
        this.role = value;
    }

    /**
     * Obtient la valeur de la propriété enabled.
     * 
     */
    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Définit la valeur de la propriété enabled.
     * 
     */
    public void setEnabled(boolean value) {
        this.enabled = value;
    }

}

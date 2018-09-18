
package de.vitero.schema.group;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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

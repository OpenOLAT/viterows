
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
 *         <element name="groupmember" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlRootElement(name = "isUserInGroupResponse")
public class IsUserInGroupResponse {

    protected boolean groupmember;

    /**
     * Obtient la valeur de la propriété groupmember.
     * 
     */
    public boolean isGroupmember() {
        return groupmember;
    }

    /**
     * Définit la valeur de la propriété groupmember.
     * 
     */
    public void setGroupmember(boolean value) {
        this.groupmember = value;
    }

}


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
 *         <element name="phoneavailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="hybrid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="dialout" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlRootElement(name = "isPhoneAvailableResponse")
public class IsPhoneAvailableResponse {

    protected boolean phoneavailable;
    protected boolean hybrid;
    protected boolean dialout;

    /**
     * Obtient la valeur de la propriété phoneavailable.
     * 
     */
    public boolean isPhoneavailable() {
        return phoneavailable;
    }

    /**
     * Définit la valeur de la propriété phoneavailable.
     * 
     */
    public void setPhoneavailable(boolean value) {
        this.phoneavailable = value;
    }

    /**
     * Obtient la valeur de la propriété hybrid.
     * 
     */
    public boolean isHybrid() {
        return hybrid;
    }

    /**
     * Définit la valeur de la propriété hybrid.
     * 
     */
    public void setHybrid(boolean value) {
        this.hybrid = value;
    }

    /**
     * Obtient la valeur de la propriété dialout.
     * 
     */
    public boolean isDialout() {
        return dialout;
    }

    /**
     * Définit la valeur de la propriété dialout.
     * 
     */
    public void setDialout(boolean value) {
        this.dialout = value;
    }

}

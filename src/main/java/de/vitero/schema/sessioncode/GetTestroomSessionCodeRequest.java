
package de.vitero.schema.sessioncode;

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
 *         <element name="userid" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlRootElement(name = "getTestroomSessionCodeRequest")
public class GetTestroomSessionCodeRequest {

    protected int userid;

    /**
     * Obtient la valeur de la propriété userid.
     * 
     */
    public int getUserid() {
        return userid;
    }

    /**
     * Définit la valeur de la propriété userid.
     * 
     */
    public void setUserid(int value) {
        this.userid = value;
    }

}

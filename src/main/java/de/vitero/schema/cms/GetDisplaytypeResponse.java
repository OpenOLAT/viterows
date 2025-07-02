
package de.vitero.schema.cms;

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
 *       <sequence>
 *         <element name="displaytype" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "displaytype"
})
@XmlRootElement(name = "getDisplaytypeResponse")
public class GetDisplaytypeResponse {

    protected int displaytype;

    /**
     * Obtient la valeur de la propriété displaytype.
     * 
     */
    public int getDisplaytype() {
        return displaytype;
    }

    /**
     * Définit la valeur de la propriété displaytype.
     * 
     */
    public void setDisplaytype(int value) {
        this.displaytype = value;
    }

}

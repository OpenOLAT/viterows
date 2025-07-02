
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
 *         <element name="nodeid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="visible" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="strictwsdl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
    "nodeid",
    "visible",
    "strictwsdl"
})
@XmlRootElement(name = "changeVisibilityRequest")
public class ChangeVisibilityRequest {

    protected long nodeid;
    protected boolean visible;
    protected Boolean strictwsdl;

    /**
     * Obtient la valeur de la propriété nodeid.
     * 
     */
    public long getNodeid() {
        return nodeid;
    }

    /**
     * Définit la valeur de la propriété nodeid.
     * 
     */
    public void setNodeid(long value) {
        this.nodeid = value;
    }

    /**
     * Obtient la valeur de la propriété visible.
     * 
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * Définit la valeur de la propriété visible.
     * 
     */
    public void setVisible(boolean value) {
        this.visible = value;
    }

    /**
     * Obtient la valeur de la propriété strictwsdl.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStrictwsdl() {
        return strictwsdl;
    }

    /**
     * Définit la valeur de la propriété strictwsdl.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStrictwsdl(Boolean value) {
        this.strictwsdl = value;
    }

}


package de.vitero.schema.cms;

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
 *         <element name="nodeid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="authorid" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="displaytype" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="visible" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
@XmlRootElement(name = "createFolderRequest")
public class CreateFolderRequest {

    protected long nodeid;
    @XmlElement(required = true)
    protected String name;
    protected Integer authorid;
    protected Integer displaytype;
    protected Integer visible;

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
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtient la valeur de la propriété authorid.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuthorid() {
        return authorid;
    }

    /**
     * Définit la valeur de la propriété authorid.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuthorid(Integer value) {
        this.authorid = value;
    }

    /**
     * Obtient la valeur de la propriété displaytype.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDisplaytype() {
        return displaytype;
    }

    /**
     * Définit la valeur de la propriété displaytype.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDisplaytype(Integer value) {
        this.displaytype = value;
    }

    /**
     * Obtient la valeur de la propriété visible.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVisible() {
        return visible;
    }

    /**
     * Définit la valeur de la propriété visible.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVisible(Integer value) {
        this.visible = value;
    }

}

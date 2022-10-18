
package de.vitero.schema.cms;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour folder complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="folder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nodeid" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="displaytype" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="children" type="{http://www.vitero.de/schema/cms}nodeList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "folder", propOrder = {
    "nodeid",
    "name",
    "displaytype",
    "children"
})
public class Folder {

    protected long nodeid;
    @XmlElement(required = true)
    protected String name;
    protected int displaytype;
    protected NodeList children;

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

    /**
     * Obtient la valeur de la propriété children.
     * 
     * @return
     *     possible object is
     *     {@link NodeList }
     *     
     */
    public NodeList getChildren() {
        return children;
    }

    /**
     * Définit la valeur de la propriété children.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeList }
     *     
     */
    public void setChildren(NodeList value) {
        this.children = value;
    }

}

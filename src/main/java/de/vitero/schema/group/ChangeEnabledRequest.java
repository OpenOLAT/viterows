
package de.vitero.schema.group;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="groupid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="strictwsdl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlRootElement(name = "changeEnabledRequest")
public class ChangeEnabledRequest {

    protected int groupid;
    protected int userid;
    protected boolean enabled;
    protected Boolean strictwsdl;

    /**
     * Obtient la valeur de la propriété groupid.
     * 
     */
    public int getGroupid() {
        return groupid;
    }

    /**
     * Définit la valeur de la propriété groupid.
     * 
     */
    public void setGroupid(int value) {
        this.groupid = value;
    }

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

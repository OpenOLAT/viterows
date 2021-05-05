
package de.vitero.schema.licence;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java pour anonymous complex type.
 * 
 * &lt;p&gt;Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="phoneavailable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="hybrid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *         &amp;lt;element name="dialout" type="{http://www.w3.org/2001/XMLSchema}boolean"/&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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

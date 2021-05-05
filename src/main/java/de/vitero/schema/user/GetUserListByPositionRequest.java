
package de.vitero.schema.user;

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
 *         &amp;lt;element name="firstposition" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="lastposition" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
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
@XmlRootElement(name = "getUserListByPositionRequest")
public class GetUserListByPositionRequest {

    protected int firstposition;
    protected int lastposition;

    /**
     * Obtient la valeur de la propriété firstposition.
     * 
     */
    public int getFirstposition() {
        return firstposition;
    }

    /**
     * Définit la valeur de la propriété firstposition.
     * 
     */
    public void setFirstposition(int value) {
        this.firstposition = value;
    }

    /**
     * Obtient la valeur de la propriété lastposition.
     * 
     */
    public int getLastposition() {
        return lastposition;
    }

    /**
     * Définit la valeur de la propriété lastposition.
     * 
     */
    public void setLastposition(int value) {
        this.lastposition = value;
    }

}

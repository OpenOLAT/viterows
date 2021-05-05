
package de.vitero.schema.customer;

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
 *         &amp;lt;element name="sourcecustomerid" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="destcustomerid" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="strictwsdl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
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
@XmlRootElement(name = "moveAllUsersToCustomerRequest")
public class MoveAllUsersToCustomerRequest {

    protected int sourcecustomerid;
    protected int destcustomerid;
    protected Boolean strictwsdl;

    /**
     * Obtient la valeur de la propriété sourcecustomerid.
     * 
     */
    public int getSourcecustomerid() {
        return sourcecustomerid;
    }

    /**
     * Définit la valeur de la propriété sourcecustomerid.
     * 
     */
    public void setSourcecustomerid(int value) {
        this.sourcecustomerid = value;
    }

    /**
     * Obtient la valeur de la propriété destcustomerid.
     * 
     */
    public int getDestcustomerid() {
        return destcustomerid;
    }

    /**
     * Définit la valeur de la propriété destcustomerid.
     * 
     */
    public void setDestcustomerid(int value) {
        this.destcustomerid = value;
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

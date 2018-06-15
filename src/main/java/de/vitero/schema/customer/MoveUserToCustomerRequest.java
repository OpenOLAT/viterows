
package de.vitero.schema.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="sourcecustomerid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="destcustomerid" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlRootElement(name = "moveUserToCustomerRequest")
public class MoveUserToCustomerRequest {

    protected int userid;
    protected int sourcecustomerid;
    protected int destcustomerid;

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

}


package de.vitero.schema.booking;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="deletestate" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="eventlocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eventsinpast" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "deleteBookingResponse")
public class DeleteBookingResponse {

    @XmlElement(required = true)
    protected BigInteger deletestate;
    protected Boolean eventlocked;
    protected BigInteger eventsinpast;

    /**
     * Obtient la valeur de la propriété deletestate.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeletestate() {
        return deletestate;
    }

    /**
     * Définit la valeur de la propriété deletestate.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeletestate(BigInteger value) {
        this.deletestate = value;
    }

    /**
     * Obtient la valeur de la propriété eventlocked.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEventlocked() {
        return eventlocked;
    }

    /**
     * Définit la valeur de la propriété eventlocked.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEventlocked(Boolean value) {
        this.eventlocked = value;
    }

    /**
     * Obtient la valeur de la propriété eventsinpast.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEventsinpast() {
        return eventsinpast;
    }

    /**
     * Définit la valeur de la propriété eventsinpast.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEventsinpast(BigInteger value) {
        this.eventsinpast = value;
    }

}

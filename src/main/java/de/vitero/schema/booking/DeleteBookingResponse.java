
package de.vitero.schema.booking;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="deletestate" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="eventlocked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="eventsinpast" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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

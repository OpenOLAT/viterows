
package de.vitero.schema.booking;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="booking" type="{http://www.vitero.de/schema/booking}newbookingtype"/&gt;
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
@XmlRootElement(name = "createBookingRequest")
public class CreateBookingRequest {

    @XmlElement(required = true)
    protected Newbookingtype booking;

    /**
     * Obtient la valeur de la propriété booking.
     * 
     * @return
     *     possible object is
     *     {@link Newbookingtype }
     *     
     */
    public Newbookingtype getBooking() {
        return booking;
    }

    /**
     * Définit la valeur de la propriété booking.
     * 
     * @param value
     *     allowed object is
     *     {@link Newbookingtype }
     *     
     */
    public void setBooking(Newbookingtype value) {
        this.booking = value;
    }

}

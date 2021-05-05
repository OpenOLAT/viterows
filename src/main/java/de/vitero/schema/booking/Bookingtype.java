
package de.vitero.schema.booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java pour bookingtype complex type.
 * 
 * &lt;p&gt;Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="bookingtype"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="booking" type="{http://www.vitero.de/schema/booking}booking"/&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookingtype", propOrder = {

})
public class Bookingtype {

    @XmlElement(required = true)
    protected Booking_Type booking;

    /**
     * Obtient la valeur de la propriété booking.
     * 
     * @return
     *     possible object is
     *     {@link Booking_Type }
     *     
     */
    public Booking_Type getBooking() {
        return booking;
    }

    /**
     * Définit la valeur de la propriété booking.
     * 
     * @param value
     *     allowed object is
     *     {@link Booking_Type }
     *     
     */
    public void setBooking(Booking_Type value) {
        this.booking = value;
    }

}


package de.vitero.schema.booking;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour bookingtimetype complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType name="bookingtimetype">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="bookingtime" type="{http://www.vitero.de/schema/booking}bookingtime"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookingtimetype", propOrder = {

})
public class Bookingtimetype {

    @XmlElement(required = true)
    protected Bookingtime bookingtime;

    /**
     * Obtient la valeur de la propriété bookingtime.
     * 
     * @return
     *     possible object is
     *     {@link Bookingtime }
     *     
     */
    public Bookingtime getBookingtime() {
        return bookingtime;
    }

    /**
     * Définit la valeur de la propriété bookingtime.
     * 
     * @param value
     *     allowed object is
     *     {@link Bookingtime }
     *     
     */
    public void setBookingtime(Bookingtime value) {
        this.bookingtime = value;
    }

}

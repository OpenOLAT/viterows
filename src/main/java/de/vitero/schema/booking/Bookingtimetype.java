
package de.vitero.schema.booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour bookingtimetype complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="bookingtimetype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="bookingtime" type="{http://www.vitero.de/schema/booking}bookingtime"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
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

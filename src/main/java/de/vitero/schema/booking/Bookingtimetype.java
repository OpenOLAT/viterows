
package de.vitero.schema.booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java pour bookingtimetype complex type.
 * 
 * &lt;p&gt;Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="bookingtimetype"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="bookingtime" type="{http://www.vitero.de/schema/booking}bookingtime"/&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
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

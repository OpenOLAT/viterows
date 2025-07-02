
package de.vitero.schema.sessioncode;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="sessioncode" type="{http://www.vitero.de/schema/sessioncode}sessioncodebyidtype" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessioncode"
})
@XmlRootElement(name = "getPersonalBookingSessionCodesResponse")
public class GetPersonalBookingSessionCodesResponse {

    protected List<Sessioncodebyidtype> sessioncode;

    /**
     * Gets the value of the sessioncode property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sessioncode property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getSessioncode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sessioncodebyidtype }
     * </p>
     * 
     * 
     * @return
     *     The value of the sessioncode property.
     */
    public List<Sessioncodebyidtype> getSessioncode() {
        if (sessioncode == null) {
            sessioncode = new ArrayList<>();
        }
        return this.sessioncode;
    }

}

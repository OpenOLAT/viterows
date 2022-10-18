
package de.vitero.schema.sessioncode;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *       &lt;sequence&gt;
 *         &lt;element name="sessioncode" type="{http://www.vitero.de/schema/sessioncode}sessioncodebyidtype" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sessioncode"
})
@XmlRootElement(name = "getPersonalGroupSessionCodesResponse")
public class GetPersonalGroupSessionCodesResponse {

    protected List<Sessioncodebyidtype> sessioncode;

    /**
     * Gets the value of the sessioncode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the sessioncode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSessioncode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sessioncodebyidtype }
     * 
     * 
     */
    public List<Sessioncodebyidtype> getSessioncode() {
        if (sessioncode == null) {
            sessioncode = new ArrayList<Sessioncodebyidtype>();
        }
        return this.sessioncode;
    }

}

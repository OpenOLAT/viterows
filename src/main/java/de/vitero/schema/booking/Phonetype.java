
package de.vitero.schema.booking;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour phonetype complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="phonetype"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="phoneconference" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="showdialogue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dialout" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="dialoutphoneparticipant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "phonetype", propOrder = {

})
public class Phonetype {

    protected boolean phoneconference;
    protected Boolean showdialogue;
    protected Boolean dialout;
    protected Boolean dialoutphoneparticipant;

    /**
     * Obtient la valeur de la propriété phoneconference.
     * 
     */
    public boolean isPhoneconference() {
        return phoneconference;
    }

    /**
     * Définit la valeur de la propriété phoneconference.
     * 
     */
    public void setPhoneconference(boolean value) {
        this.phoneconference = value;
    }

    /**
     * Obtient la valeur de la propriété showdialogue.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowdialogue() {
        return showdialogue;
    }

    /**
     * Définit la valeur de la propriété showdialogue.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowdialogue(Boolean value) {
        this.showdialogue = value;
    }

    /**
     * Obtient la valeur de la propriété dialout.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDialout() {
        return dialout;
    }

    /**
     * Définit la valeur de la propriété dialout.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDialout(Boolean value) {
        this.dialout = value;
    }

    /**
     * Obtient la valeur de la propriété dialoutphoneparticipant.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDialoutphoneparticipant() {
        return dialoutphoneparticipant;
    }

    /**
     * Définit la valeur de la propriété dialoutphoneparticipant.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDialoutphoneparticipant(Boolean value) {
        this.dialoutphoneparticipant = value;
    }

}

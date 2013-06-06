
package de.vitero.schema.booking;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour phonetype complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="phonetype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="phoneconference" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="showdialogue" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="dialout" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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

}

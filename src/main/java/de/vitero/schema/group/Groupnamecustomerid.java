
package de.vitero.schema.group;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour groupnamecustomerid complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="groupnamecustomerid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="groupname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "groupnamecustomerid", propOrder = {

})
public class Groupnamecustomerid {

    @XmlElement(required = true)
    protected String groupname;
    protected int customerid;

    /**
     * Obtient la valeur de la propriété groupname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupname() {
        return groupname;
    }

    /**
     * Définit la valeur de la propriété groupname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupname(String value) {
        this.groupname = value;
    }

    /**
     * Obtient la valeur de la propriété customerid.
     * 
     */
    public int getCustomerid() {
        return customerid;
    }

    /**
     * Définit la valeur de la propriété customerid.
     * 
     */
    public void setCustomerid(int value) {
        this.customerid = value;
    }

}

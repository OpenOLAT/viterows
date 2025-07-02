
package de.vitero.schema.group;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour groupnamecustomerid complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType name="groupnamecustomerid">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="groupname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="customerid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
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

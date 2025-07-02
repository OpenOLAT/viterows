
package de.vitero.schema.customer;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour customertype complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType name="customertype">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         <element name="shortname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="displayname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         <element name="customernumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="groupidlist" type="{http://www.vitero.de/schema/customer}idlist" minOccurs="0"/>
 *         <element name="user" maxOccurs="unbounded" minOccurs="0">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <all>
 *                   <element name="userid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="admin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 </all>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customertype", propOrder = {
    "id",
    "shortname",
    "displayname",
    "customernumber",
    "groupidlist",
    "user"
})
public class Customertype {

    protected int id;
    @XmlElement(required = true)
    protected String shortname;
    @XmlElement(required = true)
    protected String displayname;
    protected String customernumber;
    @XmlList
    @XmlElement(type = Integer.class)
    protected List<Integer> groupidlist;
    protected List<Customertype.User> user;

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété shortname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * Définit la valeur de la propriété shortname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortname(String value) {
        this.shortname = value;
    }

    /**
     * Obtient la valeur de la propriété displayname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayname() {
        return displayname;
    }

    /**
     * Définit la valeur de la propriété displayname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayname(String value) {
        this.displayname = value;
    }

    /**
     * Obtient la valeur de la propriété customernumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomernumber() {
        return customernumber;
    }

    /**
     * Définit la valeur de la propriété customernumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomernumber(String value) {
        this.customernumber = value;
    }

    /**
     * Gets the value of the groupidlist property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupidlist property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getGroupidlist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * </p>
     * 
     * 
     * @return
     *     The value of the groupidlist property.
     */
    public List<Integer> getGroupidlist() {
        if (groupidlist == null) {
            groupidlist = new ArrayList<>();
        }
        return this.groupidlist;
    }

    /**
     * Gets the value of the user property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the user property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Customertype.User }
     * </p>
     * 
     * 
     * @return
     *     The value of the user property.
     */
    public List<Customertype.User> getUser() {
        if (user == null) {
            user = new ArrayList<>();
        }
        return this.user;
    }


    /**
     * <p>Classe Java pour anonymous complex type.</p>
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <all>
     *         <element name="userid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="admin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       </all>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class User {

        protected int userid;
        protected boolean admin;

        /**
         * Obtient la valeur de la propriété userid.
         * 
         */
        public int getUserid() {
            return userid;
        }

        /**
         * Définit la valeur de la propriété userid.
         * 
         */
        public void setUserid(int value) {
            this.userid = value;
        }

        /**
         * Obtient la valeur de la propriété admin.
         * 
         */
        public boolean isAdmin() {
            return admin;
        }

        /**
         * Définit la valeur de la propriété admin.
         * 
         */
        public void setAdmin(boolean value) {
            this.admin = value;
        }

    }

}

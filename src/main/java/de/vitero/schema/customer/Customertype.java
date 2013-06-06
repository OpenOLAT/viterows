
package de.vitero.schema.customer;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour customertype complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="customertype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="shortname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="displayname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="groupidlist" type="{http://www.vitero.de/schema/customer}idlist"/>
 *         &lt;element name="user" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="admin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customertype", propOrder = {
    "id",
    "shortname",
    "displayname",
    "groupidlist",
    "user"
})
public class Customertype {

    protected int id;
    @XmlElement(required = true)
    protected String shortname;
    @XmlElement(required = true)
    protected String displayname;
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
     * Gets the value of the groupidlist property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupidlist property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupidlist().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getGroupidlist() {
        if (groupidlist == null) {
            groupidlist = new ArrayList<Integer>();
        }
        return this.groupidlist;
    }

    /**
     * Gets the value of the user property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the user property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Customertype.User }
     * 
     * 
     */
    public List<Customertype.User> getUser() {
        if (user == null) {
            user = new ArrayList<Customertype.User>();
        }
        return this.user;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;all>
     *         &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="admin" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
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

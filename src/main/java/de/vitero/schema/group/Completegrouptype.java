
package de.vitero.schema.group;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour completegrouptype complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="completegrouptype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="participant" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="userid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "completegrouptype", propOrder = {
    "id",
    "name",
    "customerid",
    "participant"
})
public class Completegrouptype {

    protected int id;
    @XmlElement(required = true)
    protected String name;
    protected int customerid;
    protected List<Completegrouptype.Participant> participant;

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
     * Obtient la valeur de la propriété name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Définit la valeur de la propriété name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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

    /**
     * Gets the value of the participant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Completegrouptype.Participant }
     * 
     * 
     */
    public List<Completegrouptype.Participant> getParticipant() {
        if (participant == null) {
            participant = new ArrayList<Completegrouptype.Participant>();
        }
        return this.participant;
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
     *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    public static class Participant {

        protected int userid;
        protected int role;
        protected boolean enabled;

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
         * Obtient la valeur de la propriété role.
         * 
         */
        public int getRole() {
            return role;
        }

        /**
         * Définit la valeur de la propriété role.
         * 
         */
        public void setRole(int value) {
            this.role = value;
        }

        /**
         * Obtient la valeur de la propriété enabled.
         * 
         */
        public boolean isEnabled() {
            return enabled;
        }

        /**
         * Définit la valeur de la propriété enabled.
         * 
         */
        public void setEnabled(boolean value) {
            this.enabled = value;
        }

    }

}

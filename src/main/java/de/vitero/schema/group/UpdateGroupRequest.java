
package de.vitero.schema.group;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="group"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="strictwsdl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "updateGroupRequest")
public class UpdateGroupRequest {

    @XmlElement(required = true)
    protected UpdateGroupRequest.Group group;

    /**
     * Obtient la valeur de la propriété group.
     * 
     * @return
     *     possible object is
     *     {@link UpdateGroupRequest.Group }
     *     
     */
    public UpdateGroupRequest.Group getGroup() {
        return group;
    }

    /**
     * Définit la valeur de la propriété group.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateGroupRequest.Group }
     *     
     */
    public void setGroup(UpdateGroupRequest.Group value) {
        this.group = value;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="strictwsdl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Group {

        protected int id;
        @XmlElement(required = true)
        protected String name;
        protected Boolean strictwsdl;

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
         * Obtient la valeur de la propriété strictwsdl.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isStrictwsdl() {
            return strictwsdl;
        }

        /**
         * Définit la valeur de la propriété strictwsdl.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setStrictwsdl(Boolean value) {
            this.strictwsdl = value;
        }

    }

}


package de.vitero.schema.licence;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour modulestype complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType name="modulestype">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <all>
 *         <element name="modules">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="module" maxOccurs="unbounded" minOccurs="0">
 *                     <complexType>
 *                       <complexContent>
 *                         <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           <all>
 *                             <element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             <element name="enddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             <element name="roomsize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                           </all>
 *                         </restriction>
 *                       </complexContent>
 *                     </complexType>
 *                   </element>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </all>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modulestype", propOrder = {

})
public class Modulestype {

    @XmlElement(required = true)
    protected Modulestype.Modules modules;

    /**
     * Obtient la valeur de la propriété modules.
     * 
     * @return
     *     possible object is
     *     {@link Modulestype.Modules }
     *     
     */
    public Modulestype.Modules getModules() {
        return modules;
    }

    /**
     * Définit la valeur de la propriété modules.
     * 
     * @param value
     *     allowed object is
     *     {@link Modulestype.Modules }
     *     
     */
    public void setModules(Modulestype.Modules value) {
        this.modules = value;
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
     *       <sequence>
     *         <element name="module" maxOccurs="unbounded" minOccurs="0">
     *           <complexType>
     *             <complexContent>
     *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 <all>
     *                   <element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   <element name="enddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   <element name="roomsize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "module"
    })
    public static class Modules {

        protected List<Modulestype.Modules.Module> module;

        /**
         * Gets the value of the module property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the module property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getModule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Modulestype.Modules.Module }
         * </p>
         * 
         * 
         * @return
         *     The value of the module property.
         */
        public List<Modulestype.Modules.Module> getModule() {
            if (module == null) {
                module = new ArrayList<>();
            }
            return this.module;
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
         *         <element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         <element name="enddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         <element name="roomsize" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
        public static class Module {

            @XmlElement(required = true)
            protected String type;
            protected String enddate;
            protected Integer roomsize;

            /**
             * Obtient la valeur de la propriété type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Définit la valeur de la propriété type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Obtient la valeur de la propriété enddate.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnddate() {
                return enddate;
            }

            /**
             * Définit la valeur de la propriété enddate.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnddate(String value) {
                this.enddate = value;
            }

            /**
             * Obtient la valeur de la propriété roomsize.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getRoomsize() {
                return roomsize;
            }

            /**
             * Définit la valeur de la propriété roomsize.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setRoomsize(Integer value) {
                this.roomsize = value;
            }

        }

    }

}

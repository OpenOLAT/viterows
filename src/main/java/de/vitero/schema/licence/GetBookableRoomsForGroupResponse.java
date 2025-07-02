
package de.vitero.schema.licence;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         <element name="rooms">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="roomsize" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "getBookableRoomsForGroupResponse")
public class GetBookableRoomsForGroupResponse {

    @XmlElement(required = true)
    protected GetBookableRoomsForGroupResponse.Rooms rooms;

    /**
     * Obtient la valeur de la propriété rooms.
     * 
     * @return
     *     possible object is
     *     {@link GetBookableRoomsForGroupResponse.Rooms }
     *     
     */
    public GetBookableRoomsForGroupResponse.Rooms getRooms() {
        return rooms;
    }

    /**
     * Définit la valeur de la propriété rooms.
     * 
     * @param value
     *     allowed object is
     *     {@link GetBookableRoomsForGroupResponse.Rooms }
     *     
     */
    public void setRooms(GetBookableRoomsForGroupResponse.Rooms value) {
        this.rooms = value;
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
     *         <element name="roomsize" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/>
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
        "roomsize"
    })
    public static class Rooms {

        @XmlElement(type = Integer.class)
        protected List<Integer> roomsize;

        /**
         * Gets the value of the roomsize property.
         * 
         * <p>This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomsize property.</p>
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * </p>
         * <pre>
         * getRoomsize().add(newItem);
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
         *     The value of the roomsize property.
         */
        public List<Integer> getRoomsize() {
            if (roomsize == null) {
                roomsize = new ArrayList<>();
            }
            return this.roomsize;
        }

    }

}

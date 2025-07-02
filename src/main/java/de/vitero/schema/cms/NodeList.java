
package de.vitero.schema.cms;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour nodeList complex type.</p>
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.</p>
 * 
 * <pre>{@code
 * <complexType name="nodeList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="folder" type="{http://www.vitero.de/schema/cms}folder" maxOccurs="unbounded" minOccurs="0"/>
 *         <element name="file" type="{http://www.vitero.de/schema/cms}file" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nodeList", propOrder = {
    "folder",
    "file"
})
public class NodeList {

    protected List<Folder> folder;
    protected List<File> file;

    /**
     * Gets the value of the folder property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folder property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFolder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Folder }
     * </p>
     * 
     * 
     * @return
     *     The value of the folder property.
     */
    public List<Folder> getFolder() {
        if (folder == null) {
            folder = new ArrayList<>();
        }
        return this.folder;
    }

    /**
     * Gets the value of the file property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the file property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link File }
     * </p>
     * 
     * 
     * @return
     *     The value of the file property.
     */
    public List<File> getFile() {
        if (file == null) {
            file = new ArrayList<>();
        }
        return this.file;
    }

}

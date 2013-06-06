
package de.vitero.schema.mtom;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour FileWrapper complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="FileWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="foldernodeid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="file" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileWrapper", propOrder = {

})
public class FileWrapper {

    @XmlElement(required = true)
    protected String filename;
    protected Long foldernodeid;
    @XmlElement(required = true)
    @XmlMimeType("application/octet-stream")
    protected DataHandler file;

    /**
     * Obtient la valeur de la propriété filename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Définit la valeur de la propriété filename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilename(String value) {
        this.filename = value;
    }

    /**
     * Obtient la valeur de la propriété foldernodeid.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFoldernodeid() {
        return foldernodeid;
    }

    /**
     * Définit la valeur de la propriété foldernodeid.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFoldernodeid(Long value) {
        this.foldernodeid = value;
    }

    /**
     * Obtient la valeur de la propriété file.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getFile() {
        return file;
    }

    /**
     * Définit la valeur de la propriété file.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setFile(DataHandler value) {
        this.file = value;
    }

}

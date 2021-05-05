
package de.vitero.schema.cms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Classe Java pour sourceAndDestNodeId complex type.
 * 
 * &lt;p&gt;Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="sourceAndDestNodeId"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;all&amp;gt;
 *         &amp;lt;element name="sourcenodeid" type="{http://www.w3.org/2001/XMLSchema}long"/&amp;gt;
 *         &amp;lt;element name="destnodeid" type="{http://www.w3.org/2001/XMLSchema}long"/&amp;gt;
 *         &amp;lt;element name="strictwsdl" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *       &amp;lt;/all&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sourceAndDestNodeId", propOrder = {

})
public class SourceAndDestNodeId {

    protected long sourcenodeid;
    protected long destnodeid;
    protected Boolean strictwsdl;

    /**
     * Obtient la valeur de la propriété sourcenodeid.
     * 
     */
    public long getSourcenodeid() {
        return sourcenodeid;
    }

    /**
     * Définit la valeur de la propriété sourcenodeid.
     * 
     */
    public void setSourcenodeid(long value) {
        this.sourcenodeid = value;
    }

    /**
     * Obtient la valeur de la propriété destnodeid.
     * 
     */
    public long getDestnodeid() {
        return destnodeid;
    }

    /**
     * Définit la valeur de la propriété destnodeid.
     * 
     */
    public void setDestnodeid(long value) {
        this.destnodeid = value;
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


package de.vitero.schema.cms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour sourceAndDestNodeId complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="sourceAndDestNodeId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="sourcenodeid" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="destnodeid" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sourceAndDestNodeId", propOrder = {

})
public class SourceAndDestNodeId {

    protected long sourcenodeid;
    protected long destnodeid;

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

}

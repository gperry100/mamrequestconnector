
package common.bss.com.bskyb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfEntityError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEntityError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntityError" type="{http://BSkyB.com.BSS.Common}EntityError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEntityError", propOrder = {
    "entityError"
})
public class ArrayOfEntityError {

    @XmlElement(name = "EntityError", nillable = true)
    protected List<EntityError> entityError;

    /**
     * Gets the value of the entityError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityError }
     * 
     * 
     */
    public List<EntityError> getEntityError() {
        if (entityError == null) {
            entityError = new ArrayList<EntityError>();
        }
        return this.entityError;
    }

}

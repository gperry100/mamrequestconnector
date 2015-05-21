
package common.bss.com.bskyb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfParameterError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfParameterError">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParameterError" type="{http://BSkyB.com.BSS.Common}ParameterError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfParameterError", propOrder = {
    "parameterError"
})
public class ArrayOfParameterError {

    @XmlElement(name = "ParameterError", nillable = true)
    protected List<ParameterError> parameterError;

    /**
     * Gets the value of the parameterError property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameterError property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameterError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParameterError }
     * 
     * 
     */
    public List<ParameterError> getParameterError() {
        if (parameterError == null) {
            parameterError = new ArrayList<ParameterError>();
        }
        return this.parameterError;
    }

}

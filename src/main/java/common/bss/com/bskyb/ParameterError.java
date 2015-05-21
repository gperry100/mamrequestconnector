
package common.bss.com.bskyb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParameterError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParameterError">
 *   &lt;complexContent>
 *     &lt;extension base="{http://BSkyB.com.BSS.Common}BusinessError">
 *       &lt;sequence>
 *         &lt;element name="Parameters" type="{http://BSkyB.com.BSS.Common}ArrayOfNameValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParameterError", propOrder = {
    "parameters"
})
public class ParameterError
    extends BusinessError
{

    @XmlElementRef(name = "Parameters", namespace = "http://BSkyB.com.BSS.Common", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNameValue> parameters;

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNameValue }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNameValue> getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNameValue }{@code >}
     *     
     */
    public void setParameters(JAXBElement<ArrayOfNameValue> value) {
        this.parameters = value;
    }

}

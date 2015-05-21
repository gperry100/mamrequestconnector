
package common.bss.com.bskyb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EntityErrors" type="{http://BSkyB.com.BSS.Common}ArrayOfEntityError" minOccurs="0"/>
 *         &lt;element name="ParameterErrors" type="{http://BSkyB.com.BSS.Common}ArrayOfParameterError" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessException", propOrder = {
    "entityErrors",
    "parameterErrors"
})
public class BusinessException {

    @XmlElementRef(name = "EntityErrors", namespace = "http://BSkyB.com.BSS.Common", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEntityError> entityErrors;
    @XmlElementRef(name = "ParameterErrors", namespace = "http://BSkyB.com.BSS.Common", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfParameterError> parameterErrors;

    /**
     * Gets the value of the entityErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEntityError }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEntityError> getEntityErrors() {
        return entityErrors;
    }

    /**
     * Sets the value of the entityErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEntityError }{@code >}
     *     
     */
    public void setEntityErrors(JAXBElement<ArrayOfEntityError> value) {
        this.entityErrors = value;
    }

    /**
     * Gets the value of the parameterErrors property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfParameterError }{@code >}
     *     
     */
    public JAXBElement<ArrayOfParameterError> getParameterErrors() {
        return parameterErrors;
    }

    /**
     * Sets the value of the parameterErrors property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfParameterError }{@code >}
     *     
     */
    public void setParameterErrors(JAXBElement<ArrayOfParameterError> value) {
        this.parameterErrors = value;
    }

}

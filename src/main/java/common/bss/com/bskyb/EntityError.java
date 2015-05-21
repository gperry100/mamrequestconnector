
package common.bss.com.bskyb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityError complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityError">
 *   &lt;complexContent>
 *     &lt;extension base="{http://BSkyB.com.BSS.Common}BusinessError">
 *       &lt;sequence>
 *         &lt;element name="Attributes" type="{http://BSkyB.com.BSS.Common}ArrayOfNameValue" minOccurs="0"/>
 *         &lt;element name="ObjectID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityError", propOrder = {
    "attributes",
    "objectID",
    "objectType"
})
public class EntityError
    extends BusinessError
{

    @XmlElementRef(name = "Attributes", namespace = "http://BSkyB.com.BSS.Common", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNameValue> attributes;
    @XmlElementRef(name = "ObjectID", namespace = "http://BSkyB.com.BSS.Common", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> objectID;
    @XmlElementRef(name = "ObjectType", namespace = "http://BSkyB.com.BSS.Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> objectType;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNameValue }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNameValue> getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNameValue }{@code >}
     *     
     */
    public void setAttributes(JAXBElement<ArrayOfNameValue> value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the objectID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getObjectID() {
        return objectID;
    }

    /**
     * Sets the value of the objectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setObjectID(JAXBElement<Integer> value) {
        this.objectID = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObjectType(JAXBElement<String> value) {
        this.objectType = value;
    }

}

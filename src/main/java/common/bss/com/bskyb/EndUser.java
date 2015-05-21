
package common.bss.com.bskyb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndUser complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EndUser">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EndUserDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndUserID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EndUserIPAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndUser", propOrder = {
    "endUserDomain",
    "endUserID",
    "endUserIPAddress"
})
public class EndUser {

    @XmlElementRef(name = "EndUserDomain", namespace = "http://BSkyB.com.BSS.Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endUserDomain;
    @XmlElementRef(name = "EndUserID", namespace = "http://BSkyB.com.BSS.Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endUserID;
    @XmlElementRef(name = "EndUserIPAddress", namespace = "http://BSkyB.com.BSS.Common", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endUserIPAddress;

    /**
     * Gets the value of the endUserDomain property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndUserDomain() {
        return endUserDomain;
    }

    /**
     * Sets the value of the endUserDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndUserDomain(JAXBElement<String> value) {
        this.endUserDomain = value;
    }

    /**
     * Gets the value of the endUserID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndUserID() {
        return endUserID;
    }

    /**
     * Sets the value of the endUserID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndUserID(JAXBElement<String> value) {
        this.endUserID = value;
    }

    /**
     * Gets the value of the endUserIPAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEndUserIPAddress() {
        return endUserIPAddress;
    }

    /**
     * Sets the value of the endUserIPAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEndUserIPAddress(JAXBElement<String> value) {
        this.endUserIPAddress = value;
    }

}

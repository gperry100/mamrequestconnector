
package traffic.contract.bss.com.bskyb.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import traffic.contract.bss.com.bskyb.ArrayOfMAMRequest;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdateResult" type="{http://BSkyB.com.BSS.Contract.Traffic}ArrayOfMAMRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateResult"
})
@XmlRootElement(name = "UpdateResponse")
public class UpdateResponse {

    @XmlElement(name = "UpdateResult")
    protected ArrayOfMAMRequest updateResult;

    /**
     * Gets the value of the updateResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMAMRequest }
     *     
     */
    public ArrayOfMAMRequest getUpdateResult() {
        return updateResult;
    }

    /**
     * Sets the value of the updateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMAMRequest }
     *     
     */
    public void setUpdateResult(ArrayOfMAMRequest value) {
        this.updateResult = value;
    }

}

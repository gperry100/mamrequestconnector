
package traffic.contract.bss.com.bskyb.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import common.bss.com.bskyb.EndUser;
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
 *         &lt;element name="MAMRequest" type="{http://BSkyB.com.BSS.Contract.Traffic}ArrayOfMAMRequest" minOccurs="0"/>
 *         &lt;element name="endUser" type="{http://BSkyB.com.BSS.Common}EndUser" minOccurs="0"/>
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
    "mamRequest",
    "endUser"
})
@XmlRootElement(name = "Update")
public class Update {

    @XmlElement(name = "MAMRequest")
    protected ArrayOfMAMRequest mamRequest;
    protected EndUser endUser;

    /**
     * Gets the value of the mamRequest property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMAMRequest }
     *     
     */
    public ArrayOfMAMRequest getMAMRequest() {
        return mamRequest;
    }

    /**
     * Sets the value of the mamRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMAMRequest }
     *     
     */
    public void setMAMRequest(ArrayOfMAMRequest value) {
        this.mamRequest = value;
    }

    /**
     * Gets the value of the endUser property.
     * 
     * @return
     *     possible object is
     *     {@link EndUser }
     *     
     */
    public EndUser getEndUser() {
        return endUser;
    }

    /**
     * Sets the value of the endUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link EndUser }
     *     
     */
    public void setEndUser(EndUser value) {
        this.endUser = value;
    }

}

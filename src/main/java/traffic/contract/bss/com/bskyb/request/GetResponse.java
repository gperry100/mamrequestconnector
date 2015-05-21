
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
 *         &lt;element name="GetResult" type="{http://BSkyB.com.BSS.Contract.Traffic}ArrayOfMAMRequest" minOccurs="0"/>
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
    "getResult"
})
@XmlRootElement(name = "GetResponse")
public class GetResponse {

    @XmlElement(name = "GetResult")
    protected ArrayOfMAMRequest getResult;

    /**
     * Gets the value of the getResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMAMRequest }
     *     
     */
    public ArrayOfMAMRequest getGetResult() {
        return getResult;
    }

    /**
     * Sets the value of the getResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMAMRequest }
     *     
     */
    public void setGetResult(ArrayOfMAMRequest value) {
        this.getResult = value;
    }

}

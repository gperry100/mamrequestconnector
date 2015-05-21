
package traffic.contract.bss.com.bskyb.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfint;
import common.bss.com.bskyb.EndUser;


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
 *         &lt;element name="MAMRequestID" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="sourceObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceObjectID" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
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
    "mamRequestID",
    "sourceObjectType",
    "sourceObjectID",
    "endUser"
})
@XmlRootElement(name = "Get")
public class Get {

    @XmlElement(name = "MAMRequestID")
    protected ArrayOfint mamRequestID;
    protected String sourceObjectType;
    protected ArrayOfint sourceObjectID;
    protected EndUser endUser;

    /**
     * Gets the value of the mamRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getMAMRequestID() {
        return mamRequestID;
    }

    /**
     * Sets the value of the mamRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setMAMRequestID(ArrayOfint value) {
        this.mamRequestID = value;
    }

    /**
     * Gets the value of the sourceObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceObjectType() {
        return sourceObjectType;
    }

    /**
     * Sets the value of the sourceObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceObjectType(String value) {
        this.sourceObjectType = value;
    }

    /**
     * Gets the value of the sourceObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfint }
     *     
     */
    public ArrayOfint getSourceObjectID() {
        return sourceObjectID;
    }

    /**
     * Sets the value of the sourceObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfint }
     *     
     */
    public void setSourceObjectID(ArrayOfint value) {
        this.sourceObjectID = value;
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

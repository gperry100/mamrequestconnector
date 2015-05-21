
package traffic.contract.bss.com.bskyb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * <p>Java class for MAMRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MAMRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreatedByUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateCompleted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DateRequired" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DateTimeAcceptedByMAM" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DateTimeCreated" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Deleted" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GenericID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Level" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MAMRequestID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NoOfOutgestItems" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OutgestDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestedForUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceObjectDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceObjectID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SourceObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TargetObjectDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MAMRequest", propOrder = {
    "createdByUser",
    "dateCompleted",
    "dateRequired",
    "dateTimeAcceptedByMAM",
    "dateTimeCreated",
    "deleted",
    "format",
    "genericID",
    "level",
    "mamRequestID",
    "noOfOutgestItems",
    "outgestDestination",
    "requestedForUser",
    "sourceObjectDetail",
    "sourceObjectID",
    "sourceObjectType",
    "status",
    "targetObjectDetail",
    "type"
})
@JsonIgnoreProperties({ "createdByUser", "dateCompleted" })
public class MAMRequest {

    @XmlElementRef(name = "CreatedByUser", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdByUser;
    @XmlElementRef(name = "DateCompleted", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateCompleted;
    @XmlElementRef(name = "DateRequired", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateRequired;
    @XmlElementRef(name = "DateTimeAcceptedByMAM", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateTimeAcceptedByMAM;
    @XmlElementRef(name = "DateTimeCreated", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateTimeCreated;
    @XmlElementRef(name = "Deleted", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> deleted;
    @XmlElementRef(name = "Format", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> format;
    @JsonProperty("purchaseId")
    @XmlElementRef(name = "GenericID", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> genericID;
    @XmlElementRef(name = "Level", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> level;
    @XmlElementRef(name = "MAMRequestID", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> mamRequestID;
    @XmlElementRef(name = "NoOfOutgestItems", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> noOfOutgestItems;
    @XmlElementRef(name = "OutgestDestination", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> outgestDestination;
    @XmlElementRef(name = "RequestedForUser", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestedForUser;
    @XmlElementRef(name = "SourceObjectDetail", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceObjectDetail;
    @XmlElementRef(name = "SourceObjectID", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> sourceObjectID;
    @XmlElementRef(name = "SourceObjectType", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceObjectType;
    @XmlElementRef(name = "Status", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "TargetObjectDetail", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> targetObjectDetail;
    @XmlElementRef(name = "Type", namespace = "http://BSkyB.com.BSS.Contract.Traffic", type = JAXBElement.class, required = false)
    protected JAXBElement<String> type;

    /**
     * Gets the value of the createdByUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedByUser() {
        return createdByUser;
    }

    /**
     * Sets the value of the createdByUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedByUser(JAXBElement<String> value) {
        this.createdByUser = value;
    }

    /**
     * Gets the value of the dateCompleted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateCompleted() {
        return dateCompleted;
    }

    /**
     * Sets the value of the dateCompleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateCompleted(JAXBElement<XMLGregorianCalendar> value) {
        this.dateCompleted = value;
    }

    /**
     * Gets the value of the dateRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateRequired() {
        return dateRequired;
    }

    /**
     * Sets the value of the dateRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateRequired(JAXBElement<XMLGregorianCalendar> value) {
        this.dateRequired = value;
    }

    /**
     * Gets the value of the dateTimeAcceptedByMAM property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateTimeAcceptedByMAM() {
        return dateTimeAcceptedByMAM;
    }

    /**
     * Sets the value of the dateTimeAcceptedByMAM property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateTimeAcceptedByMAM(JAXBElement<XMLGregorianCalendar> value) {
        this.dateTimeAcceptedByMAM = value;
    }

    /**
     * Gets the value of the dateTimeCreated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateTimeCreated() {
        return dateTimeCreated;
    }

    /**
     * Sets the value of the dateTimeCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateTimeCreated(JAXBElement<XMLGregorianCalendar> value) {
        this.dateTimeCreated = value;
    }

    /**
     * Gets the value of the deleted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDeleted() {
        return deleted;
    }

    /**
     * Sets the value of the deleted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDeleted(JAXBElement<Boolean> value) {
        this.deleted = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormat(JAXBElement<String> value) {
        this.format = value;
    }

    /**
     * Gets the value of the genericID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGenericID() {
        return genericID;
    }

    /**
     * Sets the value of the genericID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGenericID(JAXBElement<Integer> value) {
        this.genericID = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLevel(JAXBElement<String> value) {
        this.level = value;
    }

    /**
     * Gets the value of the mamRequestID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMAMRequestID() {
        return mamRequestID;
    }

    /**
     * Sets the value of the mamRequestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMAMRequestID(JAXBElement<Integer> value) {
        this.mamRequestID = value;
    }

    /**
     * Gets the value of the noOfOutgestItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNoOfOutgestItems() {
        return noOfOutgestItems;
    }

    /**
     * Sets the value of the noOfOutgestItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNoOfOutgestItems(JAXBElement<Integer> value) {
        this.noOfOutgestItems = value;
    }

    /**
     * Gets the value of the outgestDestination property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOutgestDestination() {
        return outgestDestination;
    }

    /**
     * Sets the value of the outgestDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOutgestDestination(JAXBElement<String> value) {
        this.outgestDestination = value;
    }

    /**
     * Gets the value of the requestedForUser property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestedForUser() {
        return requestedForUser;
    }

    /**
     * Sets the value of the requestedForUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestedForUser(JAXBElement<String> value) {
        this.requestedForUser = value;
    }

    /**
     * Gets the value of the sourceObjectDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceObjectDetail() {
        return sourceObjectDetail;
    }

    /**
     * Sets the value of the sourceObjectDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceObjectDetail(JAXBElement<String> value) {
        this.sourceObjectDetail = value;
    }

    /**
     * Gets the value of the sourceObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getSourceObjectID() {
        return sourceObjectID;
    }

    /**
     * Sets the value of the sourceObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setSourceObjectID(JAXBElement<Integer> value) {
        this.sourceObjectID = value;
    }

    /**
     * Gets the value of the sourceObjectType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceObjectType() {
        return sourceObjectType;
    }

    /**
     * Sets the value of the sourceObjectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceObjectType(JAXBElement<String> value) {
        this.sourceObjectType = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the targetObjectDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTargetObjectDetail() {
        return targetObjectDetail;
    }

    /**
     * Sets the value of the targetObjectDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTargetObjectDetail(JAXBElement<String> value) {
        this.targetObjectDetail = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setType(JAXBElement<String> value) {
        this.type = value;
    }

}

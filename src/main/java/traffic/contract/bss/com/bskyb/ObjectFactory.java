
package traffic.contract.bss.com.bskyb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the traffic.contract.bss.com.bskyb package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MAMRequest_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "MAMRequest");
    private final static QName _ArrayOfMAMRequest_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "ArrayOfMAMRequest");
    private final static QName _MAMRequestCreatedByUser_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "CreatedByUser");
    private final static QName _MAMRequestDateTimeCreated_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "DateTimeCreated");
    private final static QName _MAMRequestType_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "Type");
    private final static QName _MAMRequestTargetObjectDetail_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "TargetObjectDetail");
    private final static QName _MAMRequestDeleted_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "Deleted");
    private final static QName _MAMRequestSourceObjectType_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "SourceObjectType");
    private final static QName _MAMRequestFormat_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "Format");
    private final static QName _MAMRequestGenericID_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "GenericID");
    private final static QName _MAMRequestSourceObjectDetail_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "SourceObjectDetail");
    private final static QName _MAMRequestDateRequired_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "DateRequired");
    private final static QName _MAMRequestDateTimeAcceptedByMAM_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "DateTimeAcceptedByMAM");
    private final static QName _MAMRequestOutgestDestination_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "OutgestDestination");
    private final static QName _MAMRequestStatus_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "Status");
    private final static QName _MAMRequestDateCompleted_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "DateCompleted");
    private final static QName _MAMRequestMAMRequestID_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "MAMRequestID");
    private final static QName _MAMRequestSourceObjectID_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "SourceObjectID");
    private final static QName _MAMRequestRequestedForUser_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "RequestedForUser");
    private final static QName _MAMRequestLevel_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "Level");
    private final static QName _MAMRequestNoOfOutgestItems_QNAME = new QName("http://BSkyB.com.BSS.Contract.Traffic", "NoOfOutgestItems");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: traffic.contract.bss.com.bskyb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfMAMRequest }
     * 
     */
    public ArrayOfMAMRequest createArrayOfMAMRequest() {
        return new ArrayOfMAMRequest();
    }

    /**
     * Create an instance of {@link MAMRequest }
     * 
     */
    public MAMRequest createMAMRequest() {
        return new MAMRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MAMRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "MAMRequest")
    public JAXBElement<MAMRequest> createMAMRequest(MAMRequest value) {
        return new JAXBElement<MAMRequest>(_MAMRequest_QNAME, MAMRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfMAMRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "ArrayOfMAMRequest")
    public JAXBElement<ArrayOfMAMRequest> createArrayOfMAMRequest(ArrayOfMAMRequest value) {
        return new JAXBElement<ArrayOfMAMRequest>(_ArrayOfMAMRequest_QNAME, ArrayOfMAMRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "CreatedByUser", scope = MAMRequest.class)
    public JAXBElement<String> createMAMRequestCreatedByUser(String value) {
        return new JAXBElement<String>(_MAMRequestCreatedByUser_QNAME, String.class, MAMRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "DateTimeCreated", scope = MAMRequest.class)
    public JAXBElement<XMLGregorianCalendar> createMAMRequestDateTimeCreated(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MAMRequestDateTimeCreated_QNAME, XMLGregorianCalendar.class, MAMRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "Type", scope = MAMRequest.class)
    public JAXBElement<String> createMAMRequestType(String value) {
        return new JAXBElement<String>(_MAMRequestType_QNAME, String.class, MAMRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "TargetObjectDetail", scope = MAMRequest.class)
    public JAXBElement<String> createMAMRequestTargetObjectDetail(String value) {
        return new JAXBElement<String>(_MAMRequestTargetObjectDetail_QNAME, String.class, MAMRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "Deleted", scope = MAMRequest.class)
    public JAXBElement<Boolean> createMAMRequestDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_MAMRequestDeleted_QNAME, Boolean.class, MAMRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "SourceObjectType", scope = MAMRequest.class)
    public JAXBElement<String> createMAMRequestSourceObjectType(String value) {
        return new JAXBElement<String>(_MAMRequestSourceObjectType_QNAME, String.class, MAMRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "Format", scope = MAMRequest.class)
    public JAXBElement<String> createMAMRequestFormat(String value) {
        return new JAXBElement<String>(_MAMRequestFormat_QNAME, String.class, MAMRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "GenericID", scope = MAMRequest.class)
    public JAXBElement<Integer> createMAMRequestGenericID(Integer value) {
        return new JAXBElement<Integer>(_MAMRequestGenericID_QNAME, Integer.class, MAMRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "SourceObjectDetail", scope = MAMRequest.class)
    public JAXBElement<String> createMAMRequestSourceObjectDetail(String value) {
        return new JAXBElement<String>(_MAMRequestSourceObjectDetail_QNAME, String.class, MAMRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "DateRequired", scope = MAMRequest.class)
    public JAXBElement<XMLGregorianCalendar> createMAMRequestDateRequired(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MAMRequestDateRequired_QNAME, XMLGregorianCalendar.class, MAMRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "DateTimeAcceptedByMAM", scope = MAMRequest.class)
    public JAXBElement<XMLGregorianCalendar> createMAMRequestDateTimeAcceptedByMAM(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MAMRequestDateTimeAcceptedByMAM_QNAME, XMLGregorianCalendar.class, MAMRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "OutgestDestination", scope = MAMRequest.class)
    public JAXBElement<String> createMAMRequestOutgestDestination(String value) {
        return new JAXBElement<String>(_MAMRequestOutgestDestination_QNAME, String.class, MAMRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "Status", scope = MAMRequest.class)
    public JAXBElement<String> createMAMRequestStatus(String value) {
        return new JAXBElement<String>(_MAMRequestStatus_QNAME, String.class, MAMRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "DateCompleted", scope = MAMRequest.class)
    public JAXBElement<XMLGregorianCalendar> createMAMRequestDateCompleted(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MAMRequestDateCompleted_QNAME, XMLGregorianCalendar.class, MAMRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "MAMRequestID", scope = MAMRequest.class)
    public JAXBElement<Integer> createMAMRequestMAMRequestID(Integer value) {
        return new JAXBElement<Integer>(_MAMRequestMAMRequestID_QNAME, Integer.class, MAMRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "SourceObjectID", scope = MAMRequest.class)
    public JAXBElement<Integer> createMAMRequestSourceObjectID(Integer value) {
        return new JAXBElement<Integer>(_MAMRequestSourceObjectID_QNAME, Integer.class, MAMRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "RequestedForUser", scope = MAMRequest.class)
    public JAXBElement<String> createMAMRequestRequestedForUser(String value) {
        return new JAXBElement<String>(_MAMRequestRequestedForUser_QNAME, String.class, MAMRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "Level", scope = MAMRequest.class)
    public JAXBElement<String> createMAMRequestLevel(String value) {
        return new JAXBElement<String>(_MAMRequestLevel_QNAME, String.class, MAMRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Contract.Traffic", name = "NoOfOutgestItems", scope = MAMRequest.class)
    public JAXBElement<Integer> createMAMRequestNoOfOutgestItems(Integer value) {
        return new JAXBElement<Integer>(_MAMRequestNoOfOutgestItems_QNAME, Integer.class, MAMRequest.class, value);
    }

}

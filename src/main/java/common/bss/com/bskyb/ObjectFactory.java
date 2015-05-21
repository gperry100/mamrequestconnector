
package common.bss.com.bskyb;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the common.bss.com.bskyb package. 
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

    private final static QName _BusinessErrorError_QNAME = new QName("http://BSkyB.com.BSS.Common", "Error");
    private final static QName _BusinessErrorSource_QNAME = new QName("http://BSkyB.com.BSS.Common", "Source");
    private final static QName _EndUser_QNAME = new QName("http://BSkyB.com.BSS.Common", "EndUser");
    private final static QName _ArrayOfNameValue_QNAME = new QName("http://BSkyB.com.BSS.Common", "ArrayOfNameValue");
    private final static QName _EntityError_QNAME = new QName("http://BSkyB.com.BSS.Common", "EntityError");
    private final static QName _BusinessError_QNAME = new QName("http://BSkyB.com.BSS.Common", "BusinessError");
    private final static QName _ParameterError_QNAME = new QName("http://BSkyB.com.BSS.Common", "ParameterError");
    private final static QName _NameValue_QNAME = new QName("http://BSkyB.com.BSS.Common", "NameValue");
    private final static QName _BusinessException_QNAME = new QName("http://BSkyB.com.BSS.Common", "BusinessException");
    private final static QName _ArrayOfEntityError_QNAME = new QName("http://BSkyB.com.BSS.Common", "ArrayOfEntityError");
    private final static QName _ArrayOfParameterError_QNAME = new QName("http://BSkyB.com.BSS.Common", "ArrayOfParameterError");
    private final static QName _ErrorCode_QNAME = new QName("http://BSkyB.com.BSS.Common", "Code");
    private final static QName _ErrorMessage_QNAME = new QName("http://BSkyB.com.BSS.Common", "Message");
    private final static QName _EntityErrorObjectID_QNAME = new QName("http://BSkyB.com.BSS.Common", "ObjectID");
    private final static QName _EntityErrorAttributes_QNAME = new QName("http://BSkyB.com.BSS.Common", "Attributes");
    private final static QName _EntityErrorObjectType_QNAME = new QName("http://BSkyB.com.BSS.Common", "ObjectType");
    private final static QName _NameValueValue_QNAME = new QName("http://BSkyB.com.BSS.Common", "Value");
    private final static QName _NameValueName_QNAME = new QName("http://BSkyB.com.BSS.Common", "Name");
    private final static QName _ParameterErrorParameters_QNAME = new QName("http://BSkyB.com.BSS.Common", "Parameters");
    private final static QName _EndUserEndUserDomain_QNAME = new QName("http://BSkyB.com.BSS.Common", "EndUserDomain");
    private final static QName _EndUserEndUserIPAddress_QNAME = new QName("http://BSkyB.com.BSS.Common", "EndUserIPAddress");
    private final static QName _EndUserEndUserID_QNAME = new QName("http://BSkyB.com.BSS.Common", "EndUserID");
    private final static QName _BusinessExceptionParameterErrors_QNAME = new QName("http://BSkyB.com.BSS.Common", "ParameterErrors");
    private final static QName _BusinessExceptionEntityErrors_QNAME = new QName("http://BSkyB.com.BSS.Common", "EntityErrors");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: common.bss.com.bskyb
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EndUser }
     * 
     */
    public EndUser createEndUser() {
        return new EndUser();
    }

    /**
     * Create an instance of {@link NameValue }
     * 
     */
    public NameValue createNameValue() {
        return new NameValue();
    }

    /**
     * Create an instance of {@link BusinessException }
     * 
     */
    public BusinessException createBusinessException() {
        return new BusinessException();
    }

    /**
     * Create an instance of {@link ParameterError }
     * 
     */
    public ParameterError createParameterError() {
        return new ParameterError();
    }

    /**
     * Create an instance of {@link ArrayOfParameterError }
     * 
     */
    public ArrayOfParameterError createArrayOfParameterError() {
        return new ArrayOfParameterError();
    }

    /**
     * Create an instance of {@link BusinessError }
     * 
     */
    public BusinessError createBusinessError() {
        return new BusinessError();
    }

    /**
     * Create an instance of {@link ArrayOfEntityError }
     * 
     */
    public ArrayOfEntityError createArrayOfEntityError() {
        return new ArrayOfEntityError();
    }

    /**
     * Create an instance of {@link EntityError }
     * 
     */
    public EntityError createEntityError() {
        return new EntityError();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link ArrayOfNameValue }
     * 
     */
    public ArrayOfNameValue createArrayOfNameValue() {
        return new ArrayOfNameValue();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "Error", scope = BusinessError.class)
    public JAXBElement<Error> createBusinessErrorError(Error value) {
        return new JAXBElement<Error>(_BusinessErrorError_QNAME, Error.class, BusinessError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "Source", scope = BusinessError.class)
    public JAXBElement<String> createBusinessErrorSource(String value) {
        return new JAXBElement<String>(_BusinessErrorSource_QNAME, String.class, BusinessError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EndUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "EndUser")
    public JAXBElement<EndUser> createEndUser(EndUser value) {
        return new JAXBElement<EndUser>(_EndUser_QNAME, EndUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNameValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "ArrayOfNameValue")
    public JAXBElement<ArrayOfNameValue> createArrayOfNameValue(ArrayOfNameValue value) {
        return new JAXBElement<ArrayOfNameValue>(_ArrayOfNameValue_QNAME, ArrayOfNameValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntityError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "EntityError")
    public JAXBElement<EntityError> createEntityError(EntityError value) {
        return new JAXBElement<EntityError>(_EntityError_QNAME, EntityError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "BusinessError")
    public JAXBElement<BusinessError> createBusinessError(BusinessError value) {
        return new JAXBElement<BusinessError>(_BusinessError_QNAME, BusinessError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParameterError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "ParameterError")
    public JAXBElement<ParameterError> createParameterError(ParameterError value) {
        return new JAXBElement<ParameterError>(_ParameterError_QNAME, ParameterError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NameValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "NameValue")
    public JAXBElement<NameValue> createNameValue(NameValue value) {
        return new JAXBElement<NameValue>(_NameValue_QNAME, NameValue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "BusinessException")
    public JAXBElement<BusinessException> createBusinessException(BusinessException value) {
        return new JAXBElement<BusinessException>(_BusinessException_QNAME, BusinessException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "Error")
    public JAXBElement<Error> createError(Error value) {
        return new JAXBElement<Error>(_BusinessErrorError_QNAME, Error.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "ArrayOfEntityError")
    public JAXBElement<ArrayOfEntityError> createArrayOfEntityError(ArrayOfEntityError value) {
        return new JAXBElement<ArrayOfEntityError>(_ArrayOfEntityError_QNAME, ArrayOfEntityError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfParameterError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "ArrayOfParameterError")
    public JAXBElement<ArrayOfParameterError> createArrayOfParameterError(ArrayOfParameterError value) {
        return new JAXBElement<ArrayOfParameterError>(_ArrayOfParameterError_QNAME, ArrayOfParameterError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "Code", scope = Error.class)
    public JAXBElement<Integer> createErrorCode(Integer value) {
        return new JAXBElement<Integer>(_ErrorCode_QNAME, Integer.class, Error.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "Message", scope = Error.class)
    public JAXBElement<String> createErrorMessage(String value) {
        return new JAXBElement<String>(_ErrorMessage_QNAME, String.class, Error.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "ObjectID", scope = EntityError.class)
    public JAXBElement<Integer> createEntityErrorObjectID(Integer value) {
        return new JAXBElement<Integer>(_EntityErrorObjectID_QNAME, Integer.class, EntityError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNameValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "Attributes", scope = EntityError.class)
    public JAXBElement<ArrayOfNameValue> createEntityErrorAttributes(ArrayOfNameValue value) {
        return new JAXBElement<ArrayOfNameValue>(_EntityErrorAttributes_QNAME, ArrayOfNameValue.class, EntityError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "ObjectType", scope = EntityError.class)
    public JAXBElement<String> createEntityErrorObjectType(String value) {
        return new JAXBElement<String>(_EntityErrorObjectType_QNAME, String.class, EntityError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "Value", scope = NameValue.class)
    public JAXBElement<Object> createNameValueValue(Object value) {
        return new JAXBElement<Object>(_NameValueValue_QNAME, Object.class, NameValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "Name", scope = NameValue.class)
    public JAXBElement<String> createNameValueName(String value) {
        return new JAXBElement<String>(_NameValueName_QNAME, String.class, NameValue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNameValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "Parameters", scope = ParameterError.class)
    public JAXBElement<ArrayOfNameValue> createParameterErrorParameters(ArrayOfNameValue value) {
        return new JAXBElement<ArrayOfNameValue>(_ParameterErrorParameters_QNAME, ArrayOfNameValue.class, ParameterError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "EndUserDomain", scope = EndUser.class)
    public JAXBElement<String> createEndUserEndUserDomain(String value) {
        return new JAXBElement<String>(_EndUserEndUserDomain_QNAME, String.class, EndUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "EndUserIPAddress", scope = EndUser.class)
    public JAXBElement<String> createEndUserEndUserIPAddress(String value) {
        return new JAXBElement<String>(_EndUserEndUserIPAddress_QNAME, String.class, EndUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "EndUserID", scope = EndUser.class)
    public JAXBElement<String> createEndUserEndUserID(String value) {
        return new JAXBElement<String>(_EndUserEndUserID_QNAME, String.class, EndUser.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfParameterError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "ParameterErrors", scope = BusinessException.class)
    public JAXBElement<ArrayOfParameterError> createBusinessExceptionParameterErrors(ArrayOfParameterError value) {
        return new JAXBElement<ArrayOfParameterError>(_BusinessExceptionParameterErrors_QNAME, ArrayOfParameterError.class, BusinessException.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEntityError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://BSkyB.com.BSS.Common", name = "EntityErrors", scope = BusinessException.class)
    public JAXBElement<ArrayOfEntityError> createBusinessExceptionEntityErrors(ArrayOfEntityError value) {
        return new JAXBElement<ArrayOfEntityError>(_BusinessExceptionEntityErrors_QNAME, ArrayOfEntityError.class, BusinessException.class, value);
    }

}

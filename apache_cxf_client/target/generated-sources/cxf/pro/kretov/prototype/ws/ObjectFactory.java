
package pro.kretov.prototype.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pro.kretov.prototype.ws package. 
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

    private final static QName _GetHash_QNAME = new QName("http://ws.prototype.kretov.pro/", "getHash");
    private final static QName _GetHashResponse_QNAME = new QName("http://ws.prototype.kretov.pro/", "getHashResponse");
    private final static QName _InputType_QNAME = new QName("http://ws.prototype.kretov.pro/", "inputType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pro.kretov.prototype.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetHash }
     * 
     */
    public GetHash createGetHash() {
        return new GetHash();
    }

    /**
     * Create an instance of {@link GetHashResponse }
     * 
     */
    public GetHashResponse createGetHashResponse() {
        return new GetHashResponse();
    }

    /**
     * Create an instance of {@link InputType }
     * 
     */
    public InputType createInputType() {
        return new InputType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHash }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.prototype.kretov.pro/", name = "getHash")
    public JAXBElement<GetHash> createGetHash(GetHash value) {
        return new JAXBElement<GetHash>(_GetHash_QNAME, GetHash.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHashResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.prototype.kretov.pro/", name = "getHashResponse")
    public JAXBElement<GetHashResponse> createGetHashResponse(GetHashResponse value) {
        return new JAXBElement<GetHashResponse>(_GetHashResponse_QNAME, GetHashResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InputType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.prototype.kretov.pro/", name = "inputType")
    public JAXBElement<InputType> createInputType(InputType value) {
        return new JAXBElement<InputType>(_InputType_QNAME, InputType.class, null, value);
    }

}

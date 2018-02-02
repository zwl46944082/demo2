
package com.pers1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pers1 package. 
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

    private final static QName _GetValueResponse_QNAME = new QName("http://day05/", "getValueResponse");
    private final static QName _GetValue_QNAME = new QName("http://day05/", "getValue");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pers1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetValue }
     * 
     */
    public GetValue createGetValue() {
        return new GetValue();
    }

    /**
     * Create an instance of {@link GetValueResponse }
     * 
     */
    public GetValueResponse createGetValueResponse() {
        return new GetValueResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://day05/", name = "getValueResponse")
    public JAXBElement<GetValueResponse> createGetValueResponse(GetValueResponse value) {
        return new JAXBElement<GetValueResponse>(_GetValueResponse_QNAME, GetValueResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetValue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://day05/", name = "getValue")
    public JAXBElement<GetValue> createGetValue(GetValue value) {
        return new JAXBElement<GetValue>(_GetValue_QNAME, GetValue.class, null, value);
    }

}

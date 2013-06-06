
package de.vitero.schema.customer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.vitero.schema.customer package. 
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

    private final static QName _GetCustomerResponse_QNAME = new QName("http://www.vitero.de/schema/customer", "getCustomerResponse");
    private final static QName _RemoveUserFromCustomerRequest_QNAME = new QName("http://www.vitero.de/schema/customer", "removeUserFromCustomerRequest");
    private final static QName _AddUserToCustomerRequest_QNAME = new QName("http://www.vitero.de/schema/customer", "addUserToCustomerRequest");
    private final static QName _GetCustomerListRequest_QNAME = new QName("http://www.vitero.de/schema/customer", "getCustomerListRequest");
    private final static QName _DeleteCustomerRequest_QNAME = new QName("http://www.vitero.de/schema/customer", "deleteCustomerRequest");
    private final static QName _CreateCustomerResponse_QNAME = new QName("http://www.vitero.de/schema/customer", "createCustomerResponse");
    private final static QName _GetCustomerRequest_QNAME = new QName("http://www.vitero.de/schema/customer", "getCustomerRequest");
    private final static QName _GetCustomerByNameResponse_QNAME = new QName("http://www.vitero.de/schema/customer", "getCustomerByNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.vitero.schema.customer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateCustomerRequest }
     * 
     */
    public UpdateCustomerRequest createUpdateCustomerRequest() {
        return new UpdateCustomerRequest();
    }

    /**
     * Create an instance of {@link CreateCustomerRequest }
     * 
     */
    public CreateCustomerRequest createCreateCustomerRequest() {
        return new CreateCustomerRequest();
    }

    /**
     * Create an instance of {@link Customertype }
     * 
     */
    public Customertype createCustomertype() {
        return new Customertype();
    }

    /**
     * Create an instance of {@link Customer_Type }
     * 
     */
    public Customer_Type createCustomer_Type() {
        return new Customer_Type();
    }

    /**
     * Create an instance of {@link Customeriduserid }
     * 
     */
    public Customeriduserid createCustomeriduserid() {
        return new Customeriduserid();
    }

    /**
     * Create an instance of {@link SuccessResponse }
     * 
     */
    public SuccessResponse createSuccessResponse() {
        return new SuccessResponse();
    }

    /**
     * Create an instance of {@link GetCustomerListResponse }
     * 
     */
    public GetCustomerListResponse createGetCustomerListResponse() {
        return new GetCustomerListResponse();
    }

    /**
     * Create an instance of {@link Customerid }
     * 
     */
    public Customerid createCustomerid() {
        return new Customerid();
    }

    /**
     * Create an instance of {@link GetCustomerByNameRequest }
     * 
     */
    public GetCustomerByNameRequest createGetCustomerByNameRequest() {
        return new GetCustomerByNameRequest();
    }

    /**
     * Create an instance of {@link MoveUserToCustomerRequest }
     * 
     */
    public MoveUserToCustomerRequest createMoveUserToCustomerRequest() {
        return new MoveUserToCustomerRequest();
    }

    /**
     * Create an instance of {@link MoveAllUsersToCustomerRequest }
     * 
     */
    public MoveAllUsersToCustomerRequest createMoveAllUsersToCustomerRequest() {
        return new MoveAllUsersToCustomerRequest();
    }

    /**
     * Create an instance of {@link UpdateCustomerRequest.Customer }
     * 
     */
    public UpdateCustomerRequest.Customer createUpdateCustomerRequestCustomer() {
        return new UpdateCustomerRequest.Customer();
    }

    /**
     * Create an instance of {@link CreateCustomerRequest.Customer }
     * 
     */
    public CreateCustomerRequest.Customer createCreateCustomerRequestCustomer() {
        return new CreateCustomerRequest.Customer();
    }

    /**
     * Create an instance of {@link Customertype.User }
     * 
     */
    public Customertype.User createCustomertypeUser() {
        return new Customertype.User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "getCustomerResponse")
    public JAXBElement<Customer_Type> createGetCustomerResponse(Customer_Type value) {
        return new JAXBElement<Customer_Type>(_GetCustomerResponse_QNAME, Customer_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customeriduserid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "removeUserFromCustomerRequest")
    public JAXBElement<Customeriduserid> createRemoveUserFromCustomerRequest(Customeriduserid value) {
        return new JAXBElement<Customeriduserid>(_RemoveUserFromCustomerRequest_QNAME, Customeriduserid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customeriduserid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "addUserToCustomerRequest")
    public JAXBElement<Customeriduserid> createAddUserToCustomerRequest(Customeriduserid value) {
        return new JAXBElement<Customeriduserid>(_AddUserToCustomerRequest_QNAME, Customeriduserid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "getCustomerListRequest")
    public JAXBElement<Object> createGetCustomerListRequest(Object value) {
        return new JAXBElement<Object>(_GetCustomerListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customerid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "deleteCustomerRequest")
    public JAXBElement<Customerid> createDeleteCustomerRequest(Customerid value) {
        return new JAXBElement<Customerid>(_DeleteCustomerRequest_QNAME, Customerid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customerid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "createCustomerResponse")
    public JAXBElement<Customerid> createCreateCustomerResponse(Customerid value) {
        return new JAXBElement<Customerid>(_CreateCustomerResponse_QNAME, Customerid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customerid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "getCustomerRequest")
    public JAXBElement<Customerid> createGetCustomerRequest(Customerid value) {
        return new JAXBElement<Customerid>(_GetCustomerRequest_QNAME, Customerid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "getCustomerByNameResponse")
    public JAXBElement<Customer_Type> createGetCustomerByNameResponse(Customer_Type value) {
        return new JAXBElement<Customer_Type>(_GetCustomerByNameResponse_QNAME, Customer_Type.class, null, value);
    }

}

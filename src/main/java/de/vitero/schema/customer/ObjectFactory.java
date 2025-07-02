
package de.vitero.schema.customer;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.vitero.schema.customer package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _SuccessRequest_QNAME = new QName("http://www.vitero.de/schema/customer", "successRequest");
    private static final QName _SuccessResponse_QNAME = new QName("http://www.vitero.de/schema/customer", "successResponse");
    private static final QName _GetCustomerRequest_QNAME = new QName("http://www.vitero.de/schema/customer", "getCustomerRequest");
    private static final QName _GetCustomerResponse_QNAME = new QName("http://www.vitero.de/schema/customer", "getCustomerResponse");
    private static final QName _GetCustomerByNameResponse_QNAME = new QName("http://www.vitero.de/schema/customer", "getCustomerByNameResponse");
    private static final QName _CreateCustomerResponse_QNAME = new QName("http://www.vitero.de/schema/customer", "createCustomerResponse");
    private static final QName _UpdateCustomerResponse_QNAME = new QName("http://www.vitero.de/schema/customer", "updateCustomerResponse");
    private static final QName _DeleteCustomerResponse_QNAME = new QName("http://www.vitero.de/schema/customer", "deleteCustomerResponse");
    private static final QName _AddUserToCustomerRequest_QNAME = new QName("http://www.vitero.de/schema/customer", "addUserToCustomerRequest");
    private static final QName _AddUserToCustomerResponse_QNAME = new QName("http://www.vitero.de/schema/customer", "addUserToCustomerResponse");
    private static final QName _RemoveUserFromCustomerRequest_QNAME = new QName("http://www.vitero.de/schema/customer", "removeUserFromCustomerRequest");
    private static final QName _RemoveUserFromCustomerResponse_QNAME = new QName("http://www.vitero.de/schema/customer", "removeUserFromCustomerResponse");
    private static final QName _MoveUserToResponse_QNAME = new QName("http://www.vitero.de/schema/customer", "moveUserToResponse");
    private static final QName _MoveAllUsersToCustomerResponse_QNAME = new QName("http://www.vitero.de/schema/customer", "moveAllUsersToCustomerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.vitero.schema.customer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateCustomerRequest }
     * 
     * @return
     *     the new instance of {@link CreateCustomerRequest }
     */
    public CreateCustomerRequest createCreateCustomerRequest() {
        return new CreateCustomerRequest();
    }

    /**
     * Create an instance of {@link UpdateCustomerRequest }
     * 
     * @return
     *     the new instance of {@link UpdateCustomerRequest }
     */
    public UpdateCustomerRequest createUpdateCustomerRequest() {
        return new UpdateCustomerRequest();
    }

    /**
     * Create an instance of {@link Customertype }
     * 
     * @return
     *     the new instance of {@link Customertype }
     */
    public Customertype createCustomertype() {
        return new Customertype();
    }

    /**
     * Create an instance of {@link SuccessResponse }
     * 
     * @return
     *     the new instance of {@link SuccessResponse }
     */
    public SuccessResponse createSuccessResponse() {
        return new SuccessResponse();
    }

    /**
     * Create an instance of {@link Customerid }
     * 
     * @return
     *     the new instance of {@link Customerid }
     */
    public Customerid createCustomerid() {
        return new Customerid();
    }

    /**
     * Create an instance of {@link Customer_Type }
     * 
     * @return
     *     the new instance of {@link Customer_Type }
     */
    public Customer_Type createCustomer_Type() {
        return new Customer_Type();
    }

    /**
     * Create an instance of {@link GetCustomerByNameRequest }
     * 
     * @return
     *     the new instance of {@link GetCustomerByNameRequest }
     */
    public GetCustomerByNameRequest createGetCustomerByNameRequest() {
        return new GetCustomerByNameRequest();
    }

    /**
     * Create an instance of {@link GetCustomerListRequest }
     * 
     * @return
     *     the new instance of {@link GetCustomerListRequest }
     */
    public GetCustomerListRequest createGetCustomerListRequest() {
        return new GetCustomerListRequest();
    }

    /**
     * Create an instance of {@link GetCustomerListResponse }
     * 
     * @return
     *     the new instance of {@link GetCustomerListResponse }
     */
    public GetCustomerListResponse createGetCustomerListResponse() {
        return new GetCustomerListResponse();
    }

    /**
     * Create an instance of {@link CreateCustomerRequest.Customer }
     * 
     * @return
     *     the new instance of {@link CreateCustomerRequest.Customer }
     */
    public CreateCustomerRequest.Customer createCreateCustomerRequestCustomer() {
        return new CreateCustomerRequest.Customer();
    }

    /**
     * Create an instance of {@link UpdateCustomerRequest.Customer }
     * 
     * @return
     *     the new instance of {@link UpdateCustomerRequest.Customer }
     */
    public UpdateCustomerRequest.Customer createUpdateCustomerRequestCustomer() {
        return new UpdateCustomerRequest.Customer();
    }

    /**
     * Create an instance of {@link DeleteCustomerRequest }
     * 
     * @return
     *     the new instance of {@link DeleteCustomerRequest }
     */
    public DeleteCustomerRequest createDeleteCustomerRequest() {
        return new DeleteCustomerRequest();
    }

    /**
     * Create an instance of {@link Customeriduserid }
     * 
     * @return
     *     the new instance of {@link Customeriduserid }
     */
    public Customeriduserid createCustomeriduserid() {
        return new Customeriduserid();
    }

    /**
     * Create an instance of {@link MoveUserToCustomerRequest }
     * 
     * @return
     *     the new instance of {@link MoveUserToCustomerRequest }
     */
    public MoveUserToCustomerRequest createMoveUserToCustomerRequest() {
        return new MoveUserToCustomerRequest();
    }

    /**
     * Create an instance of {@link MoveAllUsersToCustomerRequest }
     * 
     * @return
     *     the new instance of {@link MoveAllUsersToCustomerRequest }
     */
    public MoveAllUsersToCustomerRequest createMoveAllUsersToCustomerRequest() {
        return new MoveAllUsersToCustomerRequest();
    }

    /**
     * Create an instance of {@link Customertype.User }
     * 
     * @return
     *     the new instance of {@link Customertype.User }
     */
    public Customertype.User createCustomertypeUser() {
        return new Customertype.User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "successRequest")
    public JAXBElement<String> createSuccessRequest(String value) {
        return new JAXBElement<>(_SuccessRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "successResponse")
    public JAXBElement<SuccessResponse> createSuccessResponse(SuccessResponse value) {
        return new JAXBElement<>(_SuccessResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customerid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Customerid }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "getCustomerRequest")
    public JAXBElement<Customerid> createGetCustomerRequest(Customerid value) {
        return new JAXBElement<>(_GetCustomerRequest_QNAME, Customerid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer_Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Customer_Type }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "getCustomerResponse")
    public JAXBElement<Customer_Type> createGetCustomerResponse(Customer_Type value) {
        return new JAXBElement<>(_GetCustomerResponse_QNAME, Customer_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer_Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Customer_Type }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "getCustomerByNameResponse")
    public JAXBElement<Customer_Type> createGetCustomerByNameResponse(Customer_Type value) {
        return new JAXBElement<>(_GetCustomerByNameResponse_QNAME, Customer_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customerid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Customerid }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "createCustomerResponse")
    public JAXBElement<Customerid> createCreateCustomerResponse(Customerid value) {
        return new JAXBElement<>(_CreateCustomerResponse_QNAME, Customerid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "updateCustomerResponse")
    public JAXBElement<SuccessResponse> createUpdateCustomerResponse(SuccessResponse value) {
        return new JAXBElement<>(_UpdateCustomerResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "deleteCustomerResponse")
    public JAXBElement<SuccessResponse> createDeleteCustomerResponse(SuccessResponse value) {
        return new JAXBElement<>(_DeleteCustomerResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customeriduserid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Customeriduserid }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "addUserToCustomerRequest")
    public JAXBElement<Customeriduserid> createAddUserToCustomerRequest(Customeriduserid value) {
        return new JAXBElement<>(_AddUserToCustomerRequest_QNAME, Customeriduserid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "addUserToCustomerResponse")
    public JAXBElement<SuccessResponse> createAddUserToCustomerResponse(SuccessResponse value) {
        return new JAXBElement<>(_AddUserToCustomerResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customeriduserid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Customeriduserid }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "removeUserFromCustomerRequest")
    public JAXBElement<Customeriduserid> createRemoveUserFromCustomerRequest(Customeriduserid value) {
        return new JAXBElement<>(_RemoveUserFromCustomerRequest_QNAME, Customeriduserid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "removeUserFromCustomerResponse")
    public JAXBElement<SuccessResponse> createRemoveUserFromCustomerResponse(SuccessResponse value) {
        return new JAXBElement<>(_RemoveUserFromCustomerResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "moveUserToResponse")
    public JAXBElement<SuccessResponse> createMoveUserToResponse(SuccessResponse value) {
        return new JAXBElement<>(_MoveUserToResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/customer", name = "moveAllUsersToCustomerResponse")
    public JAXBElement<SuccessResponse> createMoveAllUsersToCustomerResponse(SuccessResponse value) {
        return new JAXBElement<>(_MoveAllUsersToCustomerResponse_QNAME, SuccessResponse.class, null, value);
    }

}

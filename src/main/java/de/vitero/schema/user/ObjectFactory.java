
package de.vitero.schema.user;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.vitero.schema.user package. 
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

    private final static QName _SuccessRequest_QNAME = new QName("http://www.vitero.de/schema/user", "successRequest");
    private final static QName _GetUserRequest_QNAME = new QName("http://www.vitero.de/schema/user", "getUserRequest");
    private final static QName _GetUserListRequest_QNAME = new QName("http://www.vitero.de/schema/user", "getUserListRequest");
    private final static QName _GetUserListResponse_QNAME = new QName("http://www.vitero.de/schema/user", "getUserListResponse");
    private final static QName _GetUserListByPositionResponse_QNAME = new QName("http://www.vitero.de/schema/user", "getUserListByPositionResponse");
    private final static QName _GetUserListByCustomerResponse_QNAME = new QName("http://www.vitero.de/schema/user", "getUserListByCustomerResponse");
    private final static QName _GetUserListByGroupResponse_QNAME = new QName("http://www.vitero.de/schema/user", "getUserListByGroupResponse");
    private final static QName _CreateUserResponse_QNAME = new QName("http://www.vitero.de/schema/user", "createUserResponse");
    private final static QName _DeleteUserRequest_QNAME = new QName("http://www.vitero.de/schema/user", "deleteUserRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.vitero.schema.user
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Completeuserwithcustomertype }
     * 
     */
    public Completeuserwithcustomertype createCompleteuserwithcustomertype() {
        return new Completeuserwithcustomertype();
    }

    /**
     * Create an instance of {@link SuccessResponse }
     * 
     */
    public SuccessResponse createSuccessResponse() {
        return new SuccessResponse();
    }

    /**
     * Create an instance of {@link Userid }
     * 
     */
    public Userid createUserid() {
        return new Userid();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link Userlist }
     * 
     */
    public Userlist createUserlist() {
        return new Userlist();
    }

    /**
     * Create an instance of {@link GetUserListByPositionRequest }
     * 
     */
    public GetUserListByPositionRequest createGetUserListByPositionRequest() {
        return new GetUserListByPositionRequest();
    }

    /**
     * Create an instance of {@link GetUserListByCustomerRequest }
     * 
     */
    public GetUserListByCustomerRequest createGetUserListByCustomerRequest() {
        return new GetUserListByCustomerRequest();
    }

    /**
     * Create an instance of {@link GetUserListByGroupRequest }
     * 
     */
    public GetUserListByGroupRequest createGetUserListByGroupRequest() {
        return new GetUserListByGroupRequest();
    }

    /**
     * Create an instance of {@link CreateUserRequest }
     * 
     */
    public CreateUserRequest createCreateUserRequest() {
        return new CreateUserRequest();
    }

    /**
     * Create an instance of {@link Newusertype }
     * 
     */
    public Newusertype createNewusertype() {
        return new Newusertype();
    }

    /**
     * Create an instance of {@link UpdateUserRequest }
     * 
     */
    public UpdateUserRequest createUpdateUserRequest() {
        return new UpdateUserRequest();
    }

    /**
     * Create an instance of {@link Completeusertype }
     * 
     */
    public Completeusertype createCompleteusertype() {
        return new Completeusertype();
    }

    /**
     * Create an instance of {@link GetUserCountRequest }
     * 
     */
    public GetUserCountRequest createGetUserCountRequest() {
        return new GetUserCountRequest();
    }

    /**
     * Create an instance of {@link GetUserCountResponse }
     * 
     */
    public GetUserCountResponse createGetUserCountResponse() {
        return new GetUserCountResponse();
    }

    /**
     * Create an instance of {@link ChangePasswordRequest }
     * 
     */
    public ChangePasswordRequest createChangePasswordRequest() {
        return new ChangePasswordRequest();
    }

    /**
     * Create an instance of {@link StoreAvatarUsingBase64StringRequest }
     * 
     */
    public StoreAvatarUsingBase64StringRequest createStoreAvatarUsingBase64StringRequest() {
        return new StoreAvatarUsingBase64StringRequest();
    }

    /**
     * Create an instance of {@link Usertype }
     * 
     */
    public Usertype createUsertype() {
        return new Usertype();
    }

    /**
     * Create an instance of {@link Completeuserwithcustomertype.Customer }
     * 
     */
    public Completeuserwithcustomertype.Customer createCompleteuserwithcustomertypeCustomer() {
        return new Completeuserwithcustomertype.Customer();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "successRequest")
    public JAXBElement<String> createSuccessRequest(String value) {
        return new JAXBElement<String>(_SuccessRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Userid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "getUserRequest")
    public JAXBElement<Userid> createGetUserRequest(Userid value) {
        return new JAXBElement<Userid>(_GetUserRequest_QNAME, Userid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "getUserListRequest")
    public JAXBElement<Object> createGetUserListRequest(Object value) {
        return new JAXBElement<Object>(_GetUserListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Userlist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "getUserListResponse")
    public JAXBElement<Userlist> createGetUserListResponse(Userlist value) {
        return new JAXBElement<Userlist>(_GetUserListResponse_QNAME, Userlist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Userlist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "getUserListByPositionResponse")
    public JAXBElement<Userlist> createGetUserListByPositionResponse(Userlist value) {
        return new JAXBElement<Userlist>(_GetUserListByPositionResponse_QNAME, Userlist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Userlist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "getUserListByCustomerResponse")
    public JAXBElement<Userlist> createGetUserListByCustomerResponse(Userlist value) {
        return new JAXBElement<Userlist>(_GetUserListByCustomerResponse_QNAME, Userlist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Userlist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "getUserListByGroupResponse")
    public JAXBElement<Userlist> createGetUserListByGroupResponse(Userlist value) {
        return new JAXBElement<Userlist>(_GetUserListByGroupResponse_QNAME, Userlist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Userid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "createUserResponse")
    public JAXBElement<Userid> createCreateUserResponse(Userid value) {
        return new JAXBElement<Userid>(_CreateUserResponse_QNAME, Userid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Userid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "deleteUserRequest")
    public JAXBElement<Userid> createDeleteUserRequest(Userid value) {
        return new JAXBElement<Userid>(_DeleteUserRequest_QNAME, Userid.class, null, value);
    }

}

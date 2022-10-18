
package de.vitero.schema.user;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


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
    private final static QName _SuccessResponse_QNAME = new QName("http://www.vitero.de/schema/user", "successResponse");
    private final static QName _GetUserRequest_QNAME = new QName("http://www.vitero.de/schema/user", "getUserRequest");
    private final static QName _GetUserListRequest_QNAME = new QName("http://www.vitero.de/schema/user", "getUserListRequest");
    private final static QName _GetUserListResponse_QNAME = new QName("http://www.vitero.de/schema/user", "getUserListResponse");
    private final static QName _GetUserListByPositionResponse_QNAME = new QName("http://www.vitero.de/schema/user", "getUserListByPositionResponse");
    private final static QName _GetUserListByCustomerResponse_QNAME = new QName("http://www.vitero.de/schema/user", "getUserListByCustomerResponse");
    private final static QName _GetUserListByGroupResponse_QNAME = new QName("http://www.vitero.de/schema/user", "getUserListByGroupResponse");
    private final static QName _GetUserListByFieldsResponse_QNAME = new QName("http://www.vitero.de/schema/user", "getUserListByFieldsResponse");
    private final static QName _UpdateUserResponse_QNAME = new QName("http://www.vitero.de/schema/user", "updateUserResponse");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://www.vitero.de/schema/user", "deleteUserResponse");
    private final static QName _ChangePasswordResponse_QNAME = new QName("http://www.vitero.de/schema/user", "changePasswordResponse");
    private final static QName _StoreAvatarUsingBase64StringResponse_QNAME = new QName("http://www.vitero.de/schema/user", "storeAvatarUsingBase64StringResponse");
    private final static QName _GeneratePasswordLinkRequest_QNAME = new QName("http://www.vitero.de/schema/user", "generatePasswordLinkRequest");

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
     * Create an instance of {@link GetUserListByFieldsRequest }
     * 
     */
    public GetUserListByFieldsRequest createGetUserListByFieldsRequest() {
        return new GetUserListByFieldsRequest();
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
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
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
     * Create an instance of {@link DeleteUserRequest }
     * 
     */
    public DeleteUserRequest createDeleteUserRequest() {
        return new DeleteUserRequest();
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
     * Create an instance of {@link GeneratePasswordLinkResponse }
     * 
     */
    public GeneratePasswordLinkResponse createGeneratePasswordLinkResponse() {
        return new GeneratePasswordLinkResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "successRequest")
    public JAXBElement<String> createSuccessRequest(String value) {
        return new JAXBElement<String>(_SuccessRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "successResponse")
    public JAXBElement<SuccessResponse> createSuccessResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_SuccessResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Userid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Userid }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "getUserRequest")
    public JAXBElement<Userid> createGetUserRequest(Userid value) {
        return new JAXBElement<Userid>(_GetUserRequest_QNAME, Userid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "getUserListRequest")
    public JAXBElement<Object> createGetUserListRequest(Object value) {
        return new JAXBElement<Object>(_GetUserListRequest_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Userlist }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Userlist }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "getUserListResponse")
    public JAXBElement<Userlist> createGetUserListResponse(Userlist value) {
        return new JAXBElement<Userlist>(_GetUserListResponse_QNAME, Userlist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Userlist }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Userlist }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "getUserListByPositionResponse")
    public JAXBElement<Userlist> createGetUserListByPositionResponse(Userlist value) {
        return new JAXBElement<Userlist>(_GetUserListByPositionResponse_QNAME, Userlist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Userlist }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Userlist }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "getUserListByCustomerResponse")
    public JAXBElement<Userlist> createGetUserListByCustomerResponse(Userlist value) {
        return new JAXBElement<Userlist>(_GetUserListByCustomerResponse_QNAME, Userlist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Userlist }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Userlist }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "getUserListByGroupResponse")
    public JAXBElement<Userlist> createGetUserListByGroupResponse(Userlist value) {
        return new JAXBElement<Userlist>(_GetUserListByGroupResponse_QNAME, Userlist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Userlist }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Userlist }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "getUserListByFieldsResponse")
    public JAXBElement<Userlist> createGetUserListByFieldsResponse(Userlist value) {
        return new JAXBElement<Userlist>(_GetUserListByFieldsResponse_QNAME, Userlist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "updateUserResponse")
    public JAXBElement<SuccessResponse> createUpdateUserResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_UpdateUserResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "deleteUserResponse")
    public JAXBElement<SuccessResponse> createDeleteUserResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_DeleteUserResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "changePasswordResponse")
    public JAXBElement<SuccessResponse> createChangePasswordResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_ChangePasswordResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "storeAvatarUsingBase64StringResponse")
    public JAXBElement<SuccessResponse> createStoreAvatarUsingBase64StringResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_StoreAvatarUsingBase64StringResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Userid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Userid }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/user", name = "generatePasswordLinkRequest")
    public JAXBElement<Userid> createGeneratePasswordLinkRequest(Userid value) {
        return new JAXBElement<Userid>(_GeneratePasswordLinkRequest_QNAME, Userid.class, null, value);
    }

}

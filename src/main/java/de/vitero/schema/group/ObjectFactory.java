
package de.vitero.schema.group;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.vitero.schema.group package. 
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

    private final static QName _SuccessRequest_QNAME = new QName("http://www.vitero.de/schema/group", "successRequest");
    private final static QName _SuccessResponse_QNAME = new QName("http://www.vitero.de/schema/group", "successResponse");
    private final static QName _GetGroupRequest_QNAME = new QName("http://www.vitero.de/schema/group", "getGroupRequest");
    private final static QName _GetGroupResponse_QNAME = new QName("http://www.vitero.de/schema/group", "getGroupResponse");
    private final static QName _GetGroupByNameRequest_QNAME = new QName("http://www.vitero.de/schema/group", "getGroupByNameRequest");
    private final static QName _GetGroupByNameResponse_QNAME = new QName("http://www.vitero.de/schema/group", "getGroupByNameResponse");
    private final static QName _CreateGroupResponse_QNAME = new QName("http://www.vitero.de/schema/group", "createGroupResponse");
    private final static QName _UpdateGroupResponse_QNAME = new QName("http://www.vitero.de/schema/group", "updateGroupResponse");
    private final static QName _DeleteGroupResponse_QNAME = new QName("http://www.vitero.de/schema/group", "deleteGroupResponse");
    private final static QName _AddUserToGroupRequest_QNAME = new QName("http://www.vitero.de/schema/group", "addUserToGroupRequest");
    private final static QName _AddUserToGroupResponse_QNAME = new QName("http://www.vitero.de/schema/group", "addUserToGroupResponse");
    private final static QName _RemoveUserFromGroupRequest_QNAME = new QName("http://www.vitero.de/schema/group", "removeUserFromGroupRequest");
    private final static QName _RemoveUserFromGroupResponse_QNAME = new QName("http://www.vitero.de/schema/group", "removeUserFromGroupResponse");
    private final static QName _ChangeGroupRoleResponse_QNAME = new QName("http://www.vitero.de/schema/group", "changeGroupRoleResponse");
    private final static QName _ChangeEnabledResponse_QNAME = new QName("http://www.vitero.de/schema/group", "changeEnabledResponse");
    private final static QName _IsUserInGroupRequest_QNAME = new QName("http://www.vitero.de/schema/group", "isUserInGroupRequest");
    private final static QName _GetParticipantRequest_QNAME = new QName("http://www.vitero.de/schema/group", "getParticipantRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.vitero.schema.group
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateGroupRequest }
     * 
     */
    public UpdateGroupRequest createUpdateGroupRequest() {
        return new UpdateGroupRequest();
    }

    /**
     * Create an instance of {@link Completegrouptype }
     * 
     */
    public Completegrouptype createCompletegrouptype() {
        return new Completegrouptype();
    }

    /**
     * Create an instance of {@link SuccessResponse }
     * 
     */
    public SuccessResponse createSuccessResponse() {
        return new SuccessResponse();
    }

    /**
     * Create an instance of {@link Groupid }
     * 
     */
    public Groupid createGroupid() {
        return new Groupid();
    }

    /**
     * Create an instance of {@link Group_Type }
     * 
     */
    public Group_Type createGroup_Type() {
        return new Group_Type();
    }

    /**
     * Create an instance of {@link Groupnamecustomerid }
     * 
     */
    public Groupnamecustomerid createGroupnamecustomerid() {
        return new Groupnamecustomerid();
    }

    /**
     * Create an instance of {@link GetGroupListByCustomerRequest }
     * 
     */
    public GetGroupListByCustomerRequest createGetGroupListByCustomerRequest() {
        return new GetGroupListByCustomerRequest();
    }

    /**
     * Create an instance of {@link GetGroupListByCustomerResponse }
     * 
     */
    public GetGroupListByCustomerResponse createGetGroupListByCustomerResponse() {
        return new GetGroupListByCustomerResponse();
    }

    /**
     * Create an instance of {@link Grouptype }
     * 
     */
    public Grouptype createGrouptype() {
        return new Grouptype();
    }

    /**
     * Create an instance of {@link CreateGroupRequest }
     * 
     */
    public CreateGroupRequest createCreateGroupRequest() {
        return new CreateGroupRequest();
    }

    /**
     * Create an instance of {@link UpdateGroupRequest.Group }
     * 
     */
    public UpdateGroupRequest.Group createUpdateGroupRequestGroup() {
        return new UpdateGroupRequest.Group();
    }

    /**
     * Create an instance of {@link DeleteGroupRequest }
     * 
     */
    public DeleteGroupRequest createDeleteGroupRequest() {
        return new DeleteGroupRequest();
    }

    /**
     * Create an instance of {@link Groupiduseridstrict }
     * 
     */
    public Groupiduseridstrict createGroupiduseridstrict() {
        return new Groupiduseridstrict();
    }

    /**
     * Create an instance of {@link ChangeGroupRoleRequest }
     * 
     */
    public ChangeGroupRoleRequest createChangeGroupRoleRequest() {
        return new ChangeGroupRoleRequest();
    }

    /**
     * Create an instance of {@link ChangeEnabledRequest }
     * 
     */
    public ChangeEnabledRequest createChangeEnabledRequest() {
        return new ChangeEnabledRequest();
    }

    /**
     * Create an instance of {@link Groupiduserid }
     * 
     */
    public Groupiduserid createGroupiduserid() {
        return new Groupiduserid();
    }

    /**
     * Create an instance of {@link IsUserInGroupResponse }
     * 
     */
    public IsUserInGroupResponse createIsUserInGroupResponse() {
        return new IsUserInGroupResponse();
    }

    /**
     * Create an instance of {@link GetParticipantResponse }
     * 
     */
    public GetParticipantResponse createGetParticipantResponse() {
        return new GetParticipantResponse();
    }

    /**
     * Create an instance of {@link Groupidcustomerid }
     * 
     */
    public Groupidcustomerid createGroupidcustomerid() {
        return new Groupidcustomerid();
    }

    /**
     * Create an instance of {@link Completegrouptype.Participant }
     * 
     */
    public Completegrouptype.Participant createCompletegrouptypeParticipant() {
        return new Completegrouptype.Participant();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "successRequest")
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
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "successResponse")
    public JAXBElement<SuccessResponse> createSuccessResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_SuccessResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Groupid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Groupid }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "getGroupRequest")
    public JAXBElement<Groupid> createGetGroupRequest(Groupid value) {
        return new JAXBElement<Groupid>(_GetGroupRequest_QNAME, Groupid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Group_Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Group_Type }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "getGroupResponse")
    public JAXBElement<Group_Type> createGetGroupResponse(Group_Type value) {
        return new JAXBElement<Group_Type>(_GetGroupResponse_QNAME, Group_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Groupnamecustomerid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Groupnamecustomerid }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "getGroupByNameRequest")
    public JAXBElement<Groupnamecustomerid> createGetGroupByNameRequest(Groupnamecustomerid value) {
        return new JAXBElement<Groupnamecustomerid>(_GetGroupByNameRequest_QNAME, Groupnamecustomerid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Group_Type }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Group_Type }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "getGroupByNameResponse")
    public JAXBElement<Group_Type> createGetGroupByNameResponse(Group_Type value) {
        return new JAXBElement<Group_Type>(_GetGroupByNameResponse_QNAME, Group_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Groupid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Groupid }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "createGroupResponse")
    public JAXBElement<Groupid> createCreateGroupResponse(Groupid value) {
        return new JAXBElement<Groupid>(_CreateGroupResponse_QNAME, Groupid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "updateGroupResponse")
    public JAXBElement<SuccessResponse> createUpdateGroupResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_UpdateGroupResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "deleteGroupResponse")
    public JAXBElement<SuccessResponse> createDeleteGroupResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_DeleteGroupResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Groupiduseridstrict }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Groupiduseridstrict }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "addUserToGroupRequest")
    public JAXBElement<Groupiduseridstrict> createAddUserToGroupRequest(Groupiduseridstrict value) {
        return new JAXBElement<Groupiduseridstrict>(_AddUserToGroupRequest_QNAME, Groupiduseridstrict.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "addUserToGroupResponse")
    public JAXBElement<SuccessResponse> createAddUserToGroupResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_AddUserToGroupResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Groupiduseridstrict }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Groupiduseridstrict }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "removeUserFromGroupRequest")
    public JAXBElement<Groupiduseridstrict> createRemoveUserFromGroupRequest(Groupiduseridstrict value) {
        return new JAXBElement<Groupiduseridstrict>(_RemoveUserFromGroupRequest_QNAME, Groupiduseridstrict.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "removeUserFromGroupResponse")
    public JAXBElement<SuccessResponse> createRemoveUserFromGroupResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_RemoveUserFromGroupResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "changeGroupRoleResponse")
    public JAXBElement<SuccessResponse> createChangeGroupRoleResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_ChangeGroupRoleResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "changeEnabledResponse")
    public JAXBElement<SuccessResponse> createChangeEnabledResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_ChangeEnabledResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Groupiduserid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Groupiduserid }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "isUserInGroupRequest")
    public JAXBElement<Groupiduserid> createIsUserInGroupRequest(Groupiduserid value) {
        return new JAXBElement<Groupiduserid>(_IsUserInGroupRequest_QNAME, Groupiduserid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Groupiduserid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Groupiduserid }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "getParticipantRequest")
    public JAXBElement<Groupiduserid> createGetParticipantRequest(Groupiduserid value) {
        return new JAXBElement<Groupiduserid>(_GetParticipantRequest_QNAME, Groupiduserid.class, null, value);
    }

}

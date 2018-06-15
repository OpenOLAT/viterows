
package de.vitero.schema.group;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


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
    private final static QName _GetGroupRequest_QNAME = new QName("http://www.vitero.de/schema/group", "getGroupRequest");
    private final static QName _GetGroupResponse_QNAME = new QName("http://www.vitero.de/schema/group", "getGroupResponse");
    private final static QName _GetGroupByNameRequest_QNAME = new QName("http://www.vitero.de/schema/group", "getGroupByNameRequest");
    private final static QName _GetGroupByNameResponse_QNAME = new QName("http://www.vitero.de/schema/group", "getGroupByNameResponse");
    private final static QName _CreateGroupResponse_QNAME = new QName("http://www.vitero.de/schema/group", "createGroupResponse");
    private final static QName _DeleteGroupRequest_QNAME = new QName("http://www.vitero.de/schema/group", "deleteGroupRequest");
    private final static QName _AddUserToGroupRequest_QNAME = new QName("http://www.vitero.de/schema/group", "addUserToGroupRequest");
    private final static QName _RemoveUserFromGroupRequest_QNAME = new QName("http://www.vitero.de/schema/group", "removeUserFromGroupRequest");

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
     * Create an instance of {@link Groupiduserid }
     * 
     */
    public Groupiduserid createGroupiduserid() {
        return new Groupiduserid();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "successRequest")
    public JAXBElement<String> createSuccessRequest(String value) {
        return new JAXBElement<String>(_SuccessRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Groupid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "getGroupRequest")
    public JAXBElement<Groupid> createGetGroupRequest(Groupid value) {
        return new JAXBElement<Groupid>(_GetGroupRequest_QNAME, Groupid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Group_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "getGroupResponse")
    public JAXBElement<Group_Type> createGetGroupResponse(Group_Type value) {
        return new JAXBElement<Group_Type>(_GetGroupResponse_QNAME, Group_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Groupnamecustomerid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "getGroupByNameRequest")
    public JAXBElement<Groupnamecustomerid> createGetGroupByNameRequest(Groupnamecustomerid value) {
        return new JAXBElement<Groupnamecustomerid>(_GetGroupByNameRequest_QNAME, Groupnamecustomerid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Group_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "getGroupByNameResponse")
    public JAXBElement<Group_Type> createGetGroupByNameResponse(Group_Type value) {
        return new JAXBElement<Group_Type>(_GetGroupByNameResponse_QNAME, Group_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Groupid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "createGroupResponse")
    public JAXBElement<Groupid> createCreateGroupResponse(Groupid value) {
        return new JAXBElement<Groupid>(_CreateGroupResponse_QNAME, Groupid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Groupid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "deleteGroupRequest")
    public JAXBElement<Groupid> createDeleteGroupRequest(Groupid value) {
        return new JAXBElement<Groupid>(_DeleteGroupRequest_QNAME, Groupid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Groupiduserid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "addUserToGroupRequest")
    public JAXBElement<Groupiduserid> createAddUserToGroupRequest(Groupiduserid value) {
        return new JAXBElement<Groupiduserid>(_AddUserToGroupRequest_QNAME, Groupiduserid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Groupiduserid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/group", name = "removeUserFromGroupRequest")
    public JAXBElement<Groupiduserid> createRemoveUserFromGroupRequest(Groupiduserid value) {
        return new JAXBElement<Groupiduserid>(_RemoveUserFromGroupRequest_QNAME, Groupiduserid.class, null, value);
    }

}

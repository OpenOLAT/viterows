
package de.vitero.schema.cms;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.vitero.schema.cms package. 
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

    private final static QName _SuccessRequest_QNAME = new QName("http://www.vitero.de/schema/cms", "successRequest");
    private final static QName _SuccessResponse_QNAME = new QName("http://www.vitero.de/schema/cms", "successResponse");
    private final static QName _GetGroupFolderResponse_QNAME = new QName("http://www.vitero.de/schema/cms", "getGroupFolderResponse");
    private final static QName _GetCustomerFolderResponse_QNAME = new QName("http://www.vitero.de/schema/cms", "getCustomerFolderResponse");
    private final static QName _DeleteNodeResponse_QNAME = new QName("http://www.vitero.de/schema/cms", "deleteNodeResponse");
    private final static QName _RenameNodeResponse_QNAME = new QName("http://www.vitero.de/schema/cms", "renameNodeResponse");
    private final static QName _CopyNodeRequest_QNAME = new QName("http://www.vitero.de/schema/cms", "copyNodeRequest");
    private final static QName _CopyNodeResponse_QNAME = new QName("http://www.vitero.de/schema/cms", "copyNodeResponse");
    private final static QName _MoveNodeRequest_QNAME = new QName("http://www.vitero.de/schema/cms", "moveNodeRequest");
    private final static QName _MoveNodeResponse_QNAME = new QName("http://www.vitero.de/schema/cms", "moveNodeResponse");
    private final static QName _ChangeDisplaytypeResponse_QNAME = new QName("http://www.vitero.de/schema/cms", "changeDisplaytypeResponse");
    private final static QName _ChangeVisibilityResponse_QNAME = new QName("http://www.vitero.de/schema/cms", "changeVisibilityResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.vitero.schema.cms
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SuccessResponse }
     * 
     */
    public SuccessResponse createSuccessResponse() {
        return new SuccessResponse();
    }

    /**
     * Create an instance of {@link GetGroupFolderRequest }
     * 
     */
    public GetGroupFolderRequest createGetGroupFolderRequest() {
        return new GetGroupFolderRequest();
    }

    /**
     * Create an instance of {@link WrappedFolder }
     * 
     */
    public WrappedFolder createWrappedFolder() {
        return new WrappedFolder();
    }

    /**
     * Create an instance of {@link GetCustomerFolderRequest }
     * 
     */
    public GetCustomerFolderRequest createGetCustomerFolderRequest() {
        return new GetCustomerFolderRequest();
    }

    /**
     * Create an instance of {@link CreateFolderRequest }
     * 
     */
    public CreateFolderRequest createCreateFolderRequest() {
        return new CreateFolderRequest();
    }

    /**
     * Create an instance of {@link CreateFolderResponse }
     * 
     */
    public CreateFolderResponse createCreateFolderResponse() {
        return new CreateFolderResponse();
    }

    /**
     * Create an instance of {@link DeleteNodeRequest }
     * 
     */
    public DeleteNodeRequest createDeleteNodeRequest() {
        return new DeleteNodeRequest();
    }

    /**
     * Create an instance of {@link RenameNodeRequest }
     * 
     */
    public RenameNodeRequest createRenameNodeRequest() {
        return new RenameNodeRequest();
    }

    /**
     * Create an instance of {@link SourceAndDestNodeId }
     * 
     */
    public SourceAndDestNodeId createSourceAndDestNodeId() {
        return new SourceAndDestNodeId();
    }

    /**
     * Create an instance of {@link ChangeDisplaytypeRequest }
     * 
     */
    public ChangeDisplaytypeRequest createChangeDisplaytypeRequest() {
        return new ChangeDisplaytypeRequest();
    }

    /**
     * Create an instance of {@link ChangeVisibilityRequest }
     * 
     */
    public ChangeVisibilityRequest createChangeVisibilityRequest() {
        return new ChangeVisibilityRequest();
    }

    /**
     * Create an instance of {@link GetDisplaytypeRequest }
     * 
     */
    public GetDisplaytypeRequest createGetDisplaytypeRequest() {
        return new GetDisplaytypeRequest();
    }

    /**
     * Create an instance of {@link GetDisplaytypeResponse }
     * 
     */
    public GetDisplaytypeResponse createGetDisplaytypeResponse() {
        return new GetDisplaytypeResponse();
    }

    /**
     * Create an instance of {@link Folder }
     * 
     */
    public Folder createFolder() {
        return new Folder();
    }

    /**
     * Create an instance of {@link File }
     * 
     */
    public File createFile() {
        return new File();
    }

    /**
     * Create an instance of {@link NodeList }
     * 
     */
    public NodeList createNodeList() {
        return new NodeList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "successRequest")
    public JAXBElement<String> createSuccessRequest(String value) {
        return new JAXBElement<String>(_SuccessRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "successResponse")
    public JAXBElement<SuccessResponse> createSuccessResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_SuccessResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WrappedFolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "getGroupFolderResponse")
    public JAXBElement<WrappedFolder> createGetGroupFolderResponse(WrappedFolder value) {
        return new JAXBElement<WrappedFolder>(_GetGroupFolderResponse_QNAME, WrappedFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WrappedFolder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "getCustomerFolderResponse")
    public JAXBElement<WrappedFolder> createGetCustomerFolderResponse(WrappedFolder value) {
        return new JAXBElement<WrappedFolder>(_GetCustomerFolderResponse_QNAME, WrappedFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "deleteNodeResponse")
    public JAXBElement<SuccessResponse> createDeleteNodeResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_DeleteNodeResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "renameNodeResponse")
    public JAXBElement<SuccessResponse> createRenameNodeResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_RenameNodeResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceAndDestNodeId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "copyNodeRequest")
    public JAXBElement<SourceAndDestNodeId> createCopyNodeRequest(SourceAndDestNodeId value) {
        return new JAXBElement<SourceAndDestNodeId>(_CopyNodeRequest_QNAME, SourceAndDestNodeId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "copyNodeResponse")
    public JAXBElement<SuccessResponse> createCopyNodeResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_CopyNodeResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceAndDestNodeId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "moveNodeRequest")
    public JAXBElement<SourceAndDestNodeId> createMoveNodeRequest(SourceAndDestNodeId value) {
        return new JAXBElement<SourceAndDestNodeId>(_MoveNodeRequest_QNAME, SourceAndDestNodeId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "moveNodeResponse")
    public JAXBElement<SuccessResponse> createMoveNodeResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_MoveNodeResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "changeDisplaytypeResponse")
    public JAXBElement<SuccessResponse> createChangeDisplaytypeResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_ChangeDisplaytypeResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "changeVisibilityResponse")
    public JAXBElement<SuccessResponse> createChangeVisibilityResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_ChangeVisibilityResponse_QNAME, SuccessResponse.class, null, value);
    }

}

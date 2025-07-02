
package de.vitero.schema.cms;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.vitero.schema.cms package. 
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

    private static final QName _SuccessRequest_QNAME = new QName("http://www.vitero.de/schema/cms", "successRequest");
    private static final QName _SuccessResponse_QNAME = new QName("http://www.vitero.de/schema/cms", "successResponse");
    private static final QName _GetGroupFolderResponse_QNAME = new QName("http://www.vitero.de/schema/cms", "getGroupFolderResponse");
    private static final QName _GetCustomerFolderResponse_QNAME = new QName("http://www.vitero.de/schema/cms", "getCustomerFolderResponse");
    private static final QName _DeleteNodeResponse_QNAME = new QName("http://www.vitero.de/schema/cms", "deleteNodeResponse");
    private static final QName _RenameNodeResponse_QNAME = new QName("http://www.vitero.de/schema/cms", "renameNodeResponse");
    private static final QName _CopyNodeRequest_QNAME = new QName("http://www.vitero.de/schema/cms", "copyNodeRequest");
    private static final QName _CopyNodeResponse_QNAME = new QName("http://www.vitero.de/schema/cms", "copyNodeResponse");
    private static final QName _MoveNodeRequest_QNAME = new QName("http://www.vitero.de/schema/cms", "moveNodeRequest");
    private static final QName _MoveNodeResponse_QNAME = new QName("http://www.vitero.de/schema/cms", "moveNodeResponse");
    private static final QName _ChangeDisplaytypeResponse_QNAME = new QName("http://www.vitero.de/schema/cms", "changeDisplaytypeResponse");
    private static final QName _ChangeVisibilityResponse_QNAME = new QName("http://www.vitero.de/schema/cms", "changeVisibilityResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.vitero.schema.cms
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link GetGroupFolderRequest }
     * 
     * @return
     *     the new instance of {@link GetGroupFolderRequest }
     */
    public GetGroupFolderRequest createGetGroupFolderRequest() {
        return new GetGroupFolderRequest();
    }

    /**
     * Create an instance of {@link WrappedFolder }
     * 
     * @return
     *     the new instance of {@link WrappedFolder }
     */
    public WrappedFolder createWrappedFolder() {
        return new WrappedFolder();
    }

    /**
     * Create an instance of {@link GetCustomerFolderRequest }
     * 
     * @return
     *     the new instance of {@link GetCustomerFolderRequest }
     */
    public GetCustomerFolderRequest createGetCustomerFolderRequest() {
        return new GetCustomerFolderRequest();
    }

    /**
     * Create an instance of {@link CreateFolderRequest }
     * 
     * @return
     *     the new instance of {@link CreateFolderRequest }
     */
    public CreateFolderRequest createCreateFolderRequest() {
        return new CreateFolderRequest();
    }

    /**
     * Create an instance of {@link CreateFolderResponse }
     * 
     * @return
     *     the new instance of {@link CreateFolderResponse }
     */
    public CreateFolderResponse createCreateFolderResponse() {
        return new CreateFolderResponse();
    }

    /**
     * Create an instance of {@link DeleteNodeRequest }
     * 
     * @return
     *     the new instance of {@link DeleteNodeRequest }
     */
    public DeleteNodeRequest createDeleteNodeRequest() {
        return new DeleteNodeRequest();
    }

    /**
     * Create an instance of {@link RenameNodeRequest }
     * 
     * @return
     *     the new instance of {@link RenameNodeRequest }
     */
    public RenameNodeRequest createRenameNodeRequest() {
        return new RenameNodeRequest();
    }

    /**
     * Create an instance of {@link SourceAndDestNodeId }
     * 
     * @return
     *     the new instance of {@link SourceAndDestNodeId }
     */
    public SourceAndDestNodeId createSourceAndDestNodeId() {
        return new SourceAndDestNodeId();
    }

    /**
     * Create an instance of {@link ChangeDisplaytypeRequest }
     * 
     * @return
     *     the new instance of {@link ChangeDisplaytypeRequest }
     */
    public ChangeDisplaytypeRequest createChangeDisplaytypeRequest() {
        return new ChangeDisplaytypeRequest();
    }

    /**
     * Create an instance of {@link ChangeVisibilityRequest }
     * 
     * @return
     *     the new instance of {@link ChangeVisibilityRequest }
     */
    public ChangeVisibilityRequest createChangeVisibilityRequest() {
        return new ChangeVisibilityRequest();
    }

    /**
     * Create an instance of {@link GetDisplaytypeRequest }
     * 
     * @return
     *     the new instance of {@link GetDisplaytypeRequest }
     */
    public GetDisplaytypeRequest createGetDisplaytypeRequest() {
        return new GetDisplaytypeRequest();
    }

    /**
     * Create an instance of {@link GetDisplaytypeResponse }
     * 
     * @return
     *     the new instance of {@link GetDisplaytypeResponse }
     */
    public GetDisplaytypeResponse createGetDisplaytypeResponse() {
        return new GetDisplaytypeResponse();
    }

    /**
     * Create an instance of {@link Folder }
     * 
     * @return
     *     the new instance of {@link Folder }
     */
    public Folder createFolder() {
        return new Folder();
    }

    /**
     * Create an instance of {@link File }
     * 
     * @return
     *     the new instance of {@link File }
     */
    public File createFile() {
        return new File();
    }

    /**
     * Create an instance of {@link NodeList }
     * 
     * @return
     *     the new instance of {@link NodeList }
     */
    public NodeList createNodeList() {
        return new NodeList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "successRequest")
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
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "successResponse")
    public JAXBElement<SuccessResponse> createSuccessResponse(SuccessResponse value) {
        return new JAXBElement<>(_SuccessResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WrappedFolder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WrappedFolder }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "getGroupFolderResponse")
    public JAXBElement<WrappedFolder> createGetGroupFolderResponse(WrappedFolder value) {
        return new JAXBElement<>(_GetGroupFolderResponse_QNAME, WrappedFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WrappedFolder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WrappedFolder }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "getCustomerFolderResponse")
    public JAXBElement<WrappedFolder> createGetCustomerFolderResponse(WrappedFolder value) {
        return new JAXBElement<>(_GetCustomerFolderResponse_QNAME, WrappedFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "deleteNodeResponse")
    public JAXBElement<SuccessResponse> createDeleteNodeResponse(SuccessResponse value) {
        return new JAXBElement<>(_DeleteNodeResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "renameNodeResponse")
    public JAXBElement<SuccessResponse> createRenameNodeResponse(SuccessResponse value) {
        return new JAXBElement<>(_RenameNodeResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceAndDestNodeId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SourceAndDestNodeId }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "copyNodeRequest")
    public JAXBElement<SourceAndDestNodeId> createCopyNodeRequest(SourceAndDestNodeId value) {
        return new JAXBElement<>(_CopyNodeRequest_QNAME, SourceAndDestNodeId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "copyNodeResponse")
    public JAXBElement<SuccessResponse> createCopyNodeResponse(SuccessResponse value) {
        return new JAXBElement<>(_CopyNodeResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SourceAndDestNodeId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SourceAndDestNodeId }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "moveNodeRequest")
    public JAXBElement<SourceAndDestNodeId> createMoveNodeRequest(SourceAndDestNodeId value) {
        return new JAXBElement<>(_MoveNodeRequest_QNAME, SourceAndDestNodeId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "moveNodeResponse")
    public JAXBElement<SuccessResponse> createMoveNodeResponse(SuccessResponse value) {
        return new JAXBElement<>(_MoveNodeResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "changeDisplaytypeResponse")
    public JAXBElement<SuccessResponse> createChangeDisplaytypeResponse(SuccessResponse value) {
        return new JAXBElement<>(_ChangeDisplaytypeResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/cms", name = "changeVisibilityResponse")
    public JAXBElement<SuccessResponse> createChangeVisibilityResponse(SuccessResponse value) {
        return new JAXBElement<>(_ChangeVisibilityResponse_QNAME, SuccessResponse.class, null, value);
    }

}

package de.vitero.schema.cms;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 4.0.0-SNAPSHOT-30b8b01da0cbd72d784fbbb0710efe252293caec
 * 2022-10-11T18:26:22.174+02:00
 * Generated source version: 4.0.0-SNAPSHOT
 *
 */
@WebService(targetNamespace = "http://www.vitero.de/schema/cms", name = "Cms")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Cms {

    @WebMethod
    @WebResult(name = "copyNodeResponse", targetNamespace = "http://www.vitero.de/schema/cms", partName = "copyNodeResponse")
    public SuccessResponse copyNode(

        @WebParam(partName = "copyNodeRequest", name = "copyNodeRequest", targetNamespace = "http://www.vitero.de/schema/cms")
        SourceAndDestNodeId copyNodeRequest
    );

    @WebMethod
    @WebResult(name = "getDisplaytypeResponse", targetNamespace = "http://www.vitero.de/schema/cms", partName = "getDisplaytypeResponse")
    public GetDisplaytypeResponse getDisplaytype(

        @WebParam(partName = "getDisplaytypeRequest", name = "getDisplaytypeRequest", targetNamespace = "http://www.vitero.de/schema/cms")
        GetDisplaytypeRequest getDisplaytypeRequest
    );

    @WebMethod
    @WebResult(name = "getCustomerFolderResponse", targetNamespace = "http://www.vitero.de/schema/cms", partName = "getCustomerFolderResponse")
    public WrappedFolder getCustomerFolder(

        @WebParam(partName = "getCustomerFolderRequest", name = "getCustomerFolderRequest", targetNamespace = "http://www.vitero.de/schema/cms")
        GetCustomerFolderRequest getCustomerFolderRequest
    );

    @WebMethod
    @WebResult(name = "successResponse", targetNamespace = "http://www.vitero.de/schema/cms", partName = "successResponse")
    public SuccessResponse success(

        @WebParam(partName = "successRequest", name = "successRequest", targetNamespace = "http://www.vitero.de/schema/cms")
        java.lang.String successRequest
    );

    @WebMethod
    @WebResult(name = "renameNodeResponse", targetNamespace = "http://www.vitero.de/schema/cms", partName = "renameNodeResponse")
    public SuccessResponse renameNode(

        @WebParam(partName = "renameNodeRequest", name = "renameNodeRequest", targetNamespace = "http://www.vitero.de/schema/cms")
        RenameNodeRequest renameNodeRequest
    );

    @WebMethod
    @WebResult(name = "moveNodeResponse", targetNamespace = "http://www.vitero.de/schema/cms", partName = "moveNodeResponse")
    public SuccessResponse moveNode(

        @WebParam(partName = "moveNodeRequest", name = "moveNodeRequest", targetNamespace = "http://www.vitero.de/schema/cms")
        SourceAndDestNodeId moveNodeRequest
    );

    @WebMethod
    @WebResult(name = "getGroupFolderResponse", targetNamespace = "http://www.vitero.de/schema/cms", partName = "getGroupFolderResponse")
    public WrappedFolder getGroupFolder(

        @WebParam(partName = "getGroupFolderRequest", name = "getGroupFolderRequest", targetNamespace = "http://www.vitero.de/schema/cms")
        GetGroupFolderRequest getGroupFolderRequest
    );

    @WebMethod
    @WebResult(name = "deleteNodeResponse", targetNamespace = "http://www.vitero.de/schema/cms", partName = "deleteNodeResponse")
    public SuccessResponse deleteNode(

        @WebParam(partName = "deleteNodeRequest", name = "deleteNodeRequest", targetNamespace = "http://www.vitero.de/schema/cms")
        DeleteNodeRequest deleteNodeRequest
    );

    @WebMethod
    @WebResult(name = "createFolderResponse", targetNamespace = "http://www.vitero.de/schema/cms", partName = "createFolderResponse")
    public CreateFolderResponse createFolder(

        @WebParam(partName = "createFolderRequest", name = "createFolderRequest", targetNamespace = "http://www.vitero.de/schema/cms")
        CreateFolderRequest createFolderRequest
    );

    @WebMethod
    @WebResult(name = "changeDisplaytypeResponse", targetNamespace = "http://www.vitero.de/schema/cms", partName = "changeDisplaytypeResponse")
    public SuccessResponse changeDisplaytype(

        @WebParam(partName = "changeDisplaytypeRequest", name = "changeDisplaytypeRequest", targetNamespace = "http://www.vitero.de/schema/cms")
        ChangeDisplaytypeRequest changeDisplaytypeRequest
    );

    @WebMethod
    @WebResult(name = "changeVisibilityResponse", targetNamespace = "http://www.vitero.de/schema/cms", partName = "changeVisibilityResponse")
    public SuccessResponse changeVisibility(

        @WebParam(partName = "changeVisibilityRequest", name = "changeVisibilityRequest", targetNamespace = "http://www.vitero.de/schema/cms")
        ChangeVisibilityRequest changeVisibilityRequest
    );
}

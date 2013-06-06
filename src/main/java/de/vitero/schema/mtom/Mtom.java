package de.vitero.schema.mtom;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.5
 * 2013-06-06T16:09:03.301+02:00
 * Generated source version: 2.7.5
 * 
 */
@WebService(targetNamespace = "http://www.vitero.de/schema/mtom", name = "Mtom")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Mtom {

    @WebResult(name = "loadFileResponse", targetNamespace = "http://www.vitero.de/schema/mtom", partName = "loadFileResponse")
    @WebMethod
    public FileWrapper loadFile(
        @WebParam(partName = "loadFileRequest", name = "loadFileRequest", targetNamespace = "http://www.vitero.de/schema/mtom")
        IdWrapper loadFileRequest
    );

    @WebResult(name = "storeFileResponse", targetNamespace = "http://www.vitero.de/schema/mtom", partName = "storeFileResponse")
    @WebMethod
    public IdWrapper storeFile(
        @WebParam(partName = "storeFileRequest", name = "storeFileRequest", targetNamespace = "http://www.vitero.de/schema/mtom")
        FileWrapper storeFileRequest
    );

    @Oneway
    @WebMethod
    public void storeAvatar(
        @WebParam(partName = "storeAvatarRequest", name = "storeAvatarRequest", targetNamespace = "http://www.vitero.de/schema/mtom")
        CompleteAvatarWrapper storeAvatarRequest
    );

    @WebResult(name = "loadAvatarResponse", targetNamespace = "http://www.vitero.de/schema/mtom", partName = "loadAvatarResponse")
    @WebMethod
    public AvatarWrapper loadAvatar(
        @WebParam(partName = "loadAvatarRequest", name = "loadAvatarRequest", targetNamespace = "http://www.vitero.de/schema/mtom")
        AvatarInformation loadAvatarRequest
    );
}

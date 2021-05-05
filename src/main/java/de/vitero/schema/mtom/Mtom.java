package de.vitero.schema.mtom;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.4.3
 * 2021-05-05T17:04:34.616+02:00
 * Generated source version: 3.4.3
 *
 */
@WebService(targetNamespace = "http://www.vitero.de/schema/mtom", name = "Mtom")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@org.apache.cxf.annotations.EndpointProperty(key = "soap.no.validate.parts", value = "true")
public interface Mtom {

    @WebMethod
    @WebResult(name = "loadFileResponse", targetNamespace = "http://www.vitero.de/schema/mtom", partName = "loadFileResponse")
    public FileWrapper loadFile(

        @WebParam(partName = "loadFileRequest", name = "loadFileRequest", targetNamespace = "http://www.vitero.de/schema/mtom")
        IdWrapper loadFileRequest
    );

    @WebMethod
    @Oneway
    public void storeAvatar(

        @WebParam(partName = "storeAvatarRequest", name = "storeAvatarRequest", targetNamespace = "http://www.vitero.de/schema/mtom")
        CompleteAvatarWrapper storeAvatarRequest
    );

    @WebMethod
    @WebResult(name = "loadAvatarResponse", targetNamespace = "http://www.vitero.de/schema/mtom", partName = "loadAvatarResponse")
    public AvatarWrapper loadAvatar(

        @WebParam(partName = "loadAvatarRequest", name = "loadAvatarRequest", targetNamespace = "http://www.vitero.de/schema/mtom")
        AvatarInformation loadAvatarRequest
    );

    @WebMethod
    @WebResult(name = "storeFileResponse", targetNamespace = "http://www.vitero.de/schema/mtom", partName = "storeFileResponse")
    public IdWrapper storeFile(

        @WebParam(partName = "storeFileRequest", name = "storeFileRequest", targetNamespace = "http://www.vitero.de/schema/mtom")
        FileWrapper storeFileRequest
    );
}

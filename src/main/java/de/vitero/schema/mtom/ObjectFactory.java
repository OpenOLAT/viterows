
package de.vitero.schema.mtom;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.vitero.schema.mtom package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _LoadFileRequest_QNAME = new QName("http://www.vitero.de/schema/mtom", "loadFileRequest");
    private final static QName _LoadFileResponse_QNAME = new QName("http://www.vitero.de/schema/mtom", "loadFileResponse");
    private final static QName _StoreFileRequest_QNAME = new QName("http://www.vitero.de/schema/mtom", "storeFileRequest");
    private final static QName _StoreFileResponse_QNAME = new QName("http://www.vitero.de/schema/mtom", "storeFileResponse");
    private final static QName _LoadAvatarRequest_QNAME = new QName("http://www.vitero.de/schema/mtom", "loadAvatarRequest");
    private final static QName _LoadAvatarResponse_QNAME = new QName("http://www.vitero.de/schema/mtom", "loadAvatarResponse");
    private final static QName _StoreAvatarRequest_QNAME = new QName("http://www.vitero.de/schema/mtom", "storeAvatarRequest");
    private final static QName _SuccessResponse_QNAME = new QName("http://www.vitero.de/schema/mtom", "successResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.vitero.schema.mtom
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IdWrapper }
     * 
     */
    public IdWrapper createIdWrapper() {
        return new IdWrapper();
    }

    /**
     * Create an instance of {@link FileWrapper }
     * 
     */
    public FileWrapper createFileWrapper() {
        return new FileWrapper();
    }

    /**
     * Create an instance of {@link AvatarInformation }
     * 
     */
    public AvatarInformation createAvatarInformation() {
        return new AvatarInformation();
    }

    /**
     * Create an instance of {@link AvatarWrapper }
     * 
     */
    public AvatarWrapper createAvatarWrapper() {
        return new AvatarWrapper();
    }

    /**
     * Create an instance of {@link CompleteAvatarWrapper }
     * 
     */
    public CompleteAvatarWrapper createCompleteAvatarWrapper() {
        return new CompleteAvatarWrapper();
    }

    /**
     * Create an instance of {@link SuccessResponse }
     * 
     */
    public SuccessResponse createSuccessResponse() {
        return new SuccessResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/mtom", name = "loadFileRequest")
    public JAXBElement<IdWrapper> createLoadFileRequest(IdWrapper value) {
        return new JAXBElement<IdWrapper>(_LoadFileRequest_QNAME, IdWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/mtom", name = "loadFileResponse")
    public JAXBElement<FileWrapper> createLoadFileResponse(FileWrapper value) {
        return new JAXBElement<FileWrapper>(_LoadFileResponse_QNAME, FileWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/mtom", name = "storeFileRequest")
    public JAXBElement<FileWrapper> createStoreFileRequest(FileWrapper value) {
        return new JAXBElement<FileWrapper>(_StoreFileRequest_QNAME, FileWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IdWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/mtom", name = "storeFileResponse")
    public JAXBElement<IdWrapper> createStoreFileResponse(IdWrapper value) {
        return new JAXBElement<IdWrapper>(_StoreFileResponse_QNAME, IdWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvatarInformation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AvatarInformation }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/mtom", name = "loadAvatarRequest")
    public JAXBElement<AvatarInformation> createLoadAvatarRequest(AvatarInformation value) {
        return new JAXBElement<AvatarInformation>(_LoadAvatarRequest_QNAME, AvatarInformation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AvatarWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AvatarWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/mtom", name = "loadAvatarResponse")
    public JAXBElement<AvatarWrapper> createLoadAvatarResponse(AvatarWrapper value) {
        return new JAXBElement<AvatarWrapper>(_LoadAvatarResponse_QNAME, AvatarWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompleteAvatarWrapper }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CompleteAvatarWrapper }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/mtom", name = "storeAvatarRequest")
    public JAXBElement<CompleteAvatarWrapper> createStoreAvatarRequest(CompleteAvatarWrapper value) {
        return new JAXBElement<CompleteAvatarWrapper>(_StoreAvatarRequest_QNAME, CompleteAvatarWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/mtom", name = "successResponse")
    public JAXBElement<SuccessResponse> createSuccessResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_SuccessResponse_QNAME, SuccessResponse.class, null, value);
    }

}

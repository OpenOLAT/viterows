
package de.vitero.schema.licence;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.vitero.schema.licence package. 
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

    private static final QName _SuccessRequest_QNAME = new QName("http://www.vitero.de/schema/licence", "successRequest");
    private static final QName _GetBookableModulesForGroupRequest_QNAME = new QName("http://www.vitero.de/schema/licence", "getBookableModulesForGroupRequest");
    private static final QName _GetBookableModulesForGroupResponse_QNAME = new QName("http://www.vitero.de/schema/licence", "getBookableModulesForGroupResponse");
    private static final QName _GetBookableRoomsForGroupRequest_QNAME = new QName("http://www.vitero.de/schema/licence", "getBookableRoomsForGroupRequest");
    private static final QName _IsPhoneAvailableRequest_QNAME = new QName("http://www.vitero.de/schema/licence", "isPhoneAvailableRequest");
    private static final QName _GetModulesForCustomerResponse_QNAME = new QName("http://www.vitero.de/schema/licence", "getModulesForCustomerResponse");
    private static final QName _GetAllModulesResponse_QNAME = new QName("http://www.vitero.de/schema/licence", "getAllModulesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.vitero.schema.licence
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBookableRoomsForGroupResponse }
     * 
     * @return
     *     the new instance of {@link GetBookableRoomsForGroupResponse }
     */
    public GetBookableRoomsForGroupResponse createGetBookableRoomsForGroupResponse() {
        return new GetBookableRoomsForGroupResponse();
    }

    /**
     * Create an instance of {@link Modulestype }
     * 
     * @return
     *     the new instance of {@link Modulestype }
     */
    public Modulestype createModulestype() {
        return new Modulestype();
    }

    /**
     * Create an instance of {@link Modulestype.Modules }
     * 
     * @return
     *     the new instance of {@link Modulestype.Modules }
     */
    public Modulestype.Modules createModulestypeModules() {
        return new Modulestype.Modules();
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
     * Create an instance of {@link Grouprequesttype }
     * 
     * @return
     *     the new instance of {@link Grouprequesttype }
     */
    public Grouprequesttype createGrouprequesttype() {
        return new Grouprequesttype();
    }

    /**
     * Create an instance of {@link GetBookableRoomsForGroupResponse.Rooms }
     * 
     * @return
     *     the new instance of {@link GetBookableRoomsForGroupResponse.Rooms }
     */
    public GetBookableRoomsForGroupResponse.Rooms createGetBookableRoomsForGroupResponseRooms() {
        return new GetBookableRoomsForGroupResponse.Rooms();
    }

    /**
     * Create an instance of {@link GroupHasBookableModuleRequest }
     * 
     * @return
     *     the new instance of {@link GroupHasBookableModuleRequest }
     */
    public GroupHasBookableModuleRequest createGroupHasBookableModuleRequest() {
        return new GroupHasBookableModuleRequest();
    }

    /**
     * Create an instance of {@link GroupHasBookableModuleResponse }
     * 
     * @return
     *     the new instance of {@link GroupHasBookableModuleResponse }
     */
    public GroupHasBookableModuleResponse createGroupHasBookableModuleResponse() {
        return new GroupHasBookableModuleResponse();
    }

    /**
     * Create an instance of {@link IsPhoneAvailableResponse }
     * 
     * @return
     *     the new instance of {@link IsPhoneAvailableResponse }
     */
    public IsPhoneAvailableResponse createIsPhoneAvailableResponse() {
        return new IsPhoneAvailableResponse();
    }

    /**
     * Create an instance of {@link GetModulesForCustomerRequest }
     * 
     * @return
     *     the new instance of {@link GetModulesForCustomerRequest }
     */
    public GetModulesForCustomerRequest createGetModulesForCustomerRequest() {
        return new GetModulesForCustomerRequest();
    }

    /**
     * Create an instance of {@link GetAllModulesRequest }
     * 
     * @return
     *     the new instance of {@link GetAllModulesRequest }
     */
    public GetAllModulesRequest createGetAllModulesRequest() {
        return new GetAllModulesRequest();
    }

    /**
     * Create an instance of {@link Modulestype.Modules.Module }
     * 
     * @return
     *     the new instance of {@link Modulestype.Modules.Module }
     */
    public Modulestype.Modules.Module createModulestypeModulesModule() {
        return new Modulestype.Modules.Module();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/licence", name = "successRequest")
    public JAXBElement<String> createSuccessRequest(String value) {
        return new JAXBElement<>(_SuccessRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Grouprequesttype }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Grouprequesttype }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/licence", name = "getBookableModulesForGroupRequest")
    public JAXBElement<Grouprequesttype> createGetBookableModulesForGroupRequest(Grouprequesttype value) {
        return new JAXBElement<>(_GetBookableModulesForGroupRequest_QNAME, Grouprequesttype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Modulestype }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Modulestype }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/licence", name = "getBookableModulesForGroupResponse")
    public JAXBElement<Modulestype> createGetBookableModulesForGroupResponse(Modulestype value) {
        return new JAXBElement<>(_GetBookableModulesForGroupResponse_QNAME, Modulestype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Grouprequesttype }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Grouprequesttype }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/licence", name = "getBookableRoomsForGroupRequest")
    public JAXBElement<Grouprequesttype> createGetBookableRoomsForGroupRequest(Grouprequesttype value) {
        return new JAXBElement<>(_GetBookableRoomsForGroupRequest_QNAME, Grouprequesttype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Grouprequesttype }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Grouprequesttype }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/licence", name = "isPhoneAvailableRequest")
    public JAXBElement<Grouprequesttype> createIsPhoneAvailableRequest(Grouprequesttype value) {
        return new JAXBElement<>(_IsPhoneAvailableRequest_QNAME, Grouprequesttype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Modulestype }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Modulestype }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/licence", name = "getModulesForCustomerResponse")
    public JAXBElement<Modulestype> createGetModulesForCustomerResponse(Modulestype value) {
        return new JAXBElement<>(_GetModulesForCustomerResponse_QNAME, Modulestype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Modulestype }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Modulestype }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/licence", name = "getAllModulesResponse")
    public JAXBElement<Modulestype> createGetAllModulesResponse(Modulestype value) {
        return new JAXBElement<>(_GetAllModulesResponse_QNAME, Modulestype.class, null, value);
    }

}


package de.vitero.schema.sessioncode;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.vitero.schema.sessioncode package. 
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

    private final static QName _SuccessRequest_QNAME = new QName("http://www.vitero.de/schema/sessioncode", "successRequest");
    private final static QName _CreateBookingSessionCodeResponse_QNAME = new QName("http://www.vitero.de/schema/sessioncode", "createBookingSessionCodeResponse");
    private final static QName _CreatePersonalBookingSessionCodeResponse_QNAME = new QName("http://www.vitero.de/schema/sessioncode", "createPersonalBookingSessionCodeResponse");
    private final static QName _CreatePersonalGroupSessionCodeResponse_QNAME = new QName("http://www.vitero.de/schema/sessioncode", "createPersonalGroupSessionCodeResponse");
    private final static QName _CreateVmsSessionCodeResponse_QNAME = new QName("http://www.vitero.de/schema/sessioncode", "createVmsSessionCodeResponse");
    private final static QName _CreateAppointmentConfirmationSessionCodeResponse_QNAME = new QName("http://www.vitero.de/schema/sessioncode", "createAppointmentConfirmationSessionCodeResponse");
    private final static QName _DeleteSessionCodeRequest_QNAME = new QName("http://www.vitero.de/schema/sessioncode", "deleteSessionCodeRequest");
    private final static QName _GetTestroomSessionCodeResponse_QNAME = new QName("http://www.vitero.de/schema/sessioncode", "getTestroomSessionCodeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.vitero.schema.sessioncode
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateBookingSessionCodeRequest }
     * 
     */
    public CreateBookingSessionCodeRequest createCreateBookingSessionCodeRequest() {
        return new CreateBookingSessionCodeRequest();
    }

    /**
     * Create an instance of {@link CreatePersonalBookingSessionCodeRequest }
     * 
     */
    public CreatePersonalBookingSessionCodeRequest createCreatePersonalBookingSessionCodeRequest() {
        return new CreatePersonalBookingSessionCodeRequest();
    }

    /**
     * Create an instance of {@link CreatePersonalGroupSessionCodeRequest }
     * 
     */
    public CreatePersonalGroupSessionCodeRequest createCreatePersonalGroupSessionCodeRequest() {
        return new CreatePersonalGroupSessionCodeRequest();
    }

    /**
     * Create an instance of {@link CreateVmsSessionCodeRequest }
     * 
     */
    public CreateVmsSessionCodeRequest createCreateVmsSessionCodeRequest() {
        return new CreateVmsSessionCodeRequest();
    }

    /**
     * Create an instance of {@link CreateAppointmentConfirmationSessionCodeRequest }
     * 
     */
    public CreateAppointmentConfirmationSessionCodeRequest createCreateAppointmentConfirmationSessionCodeRequest() {
        return new CreateAppointmentConfirmationSessionCodeRequest();
    }

    /**
     * Create an instance of {@link GetSessionCodeInformationResponse }
     * 
     */
    public GetSessionCodeInformationResponse createGetSessionCodeInformationResponse() {
        return new GetSessionCodeInformationResponse();
    }

    /**
     * Create an instance of {@link SuccessResponse }
     * 
     */
    public SuccessResponse createSuccessResponse() {
        return new SuccessResponse();
    }

    /**
     * Create an instance of {@link CreateBookingSessionCodeRequest.Sessioncode }
     * 
     */
    public CreateBookingSessionCodeRequest.Sessioncode createCreateBookingSessionCodeRequestSessioncode() {
        return new CreateBookingSessionCodeRequest.Sessioncode();
    }

    /**
     * Create an instance of {@link Codetype }
     * 
     */
    public Codetype createCodetype() {
        return new Codetype();
    }

    /**
     * Create an instance of {@link CreatePersonalBookingSessionCodeRequest.Sessioncode }
     * 
     */
    public CreatePersonalBookingSessionCodeRequest.Sessioncode createCreatePersonalBookingSessionCodeRequestSessioncode() {
        return new CreatePersonalBookingSessionCodeRequest.Sessioncode();
    }

    /**
     * Create an instance of {@link CreatePersonalGroupSessionCodeRequest.Sessioncode }
     * 
     */
    public CreatePersonalGroupSessionCodeRequest.Sessioncode createCreatePersonalGroupSessionCodeRequestSessioncode() {
        return new CreatePersonalGroupSessionCodeRequest.Sessioncode();
    }

    /**
     * Create an instance of {@link CreateVmsSessionCodeRequest.Sessioncode }
     * 
     */
    public CreateVmsSessionCodeRequest.Sessioncode createCreateVmsSessionCodeRequestSessioncode() {
        return new CreateVmsSessionCodeRequest.Sessioncode();
    }

    /**
     * Create an instance of {@link CreateAppointmentConfirmationSessionCodeRequest.Sessioncode }
     * 
     */
    public CreateAppointmentConfirmationSessionCodeRequest.Sessioncode createCreateAppointmentConfirmationSessionCodeRequestSessioncode() {
        return new CreateAppointmentConfirmationSessionCodeRequest.Sessioncode();
    }

    /**
     * Create an instance of {@link GetSessionCodeInformationRequest }
     * 
     */
    public GetSessionCodeInformationRequest createGetSessionCodeInformationRequest() {
        return new GetSessionCodeInformationRequest();
    }

    /**
     * Create an instance of {@link GetSessionCodeInformationResponse.Sessioncode }
     * 
     */
    public GetSessionCodeInformationResponse.Sessioncode createGetSessionCodeInformationResponseSessioncode() {
        return new GetSessionCodeInformationResponse.Sessioncode();
    }

    /**
     * Create an instance of {@link GetPersonalBookingSessionCodesRequest }
     * 
     */
    public GetPersonalBookingSessionCodesRequest createGetPersonalBookingSessionCodesRequest() {
        return new GetPersonalBookingSessionCodesRequest();
    }

    /**
     * Create an instance of {@link GetPersonalBookingSessionCodesResponse }
     * 
     */
    public GetPersonalBookingSessionCodesResponse createGetPersonalBookingSessionCodesResponse() {
        return new GetPersonalBookingSessionCodesResponse();
    }

    /**
     * Create an instance of {@link Sessioncodebyidtype }
     * 
     */
    public Sessioncodebyidtype createSessioncodebyidtype() {
        return new Sessioncodebyidtype();
    }

    /**
     * Create an instance of {@link GetPersonalGroupSessionCodesRequest }
     * 
     */
    public GetPersonalGroupSessionCodesRequest createGetPersonalGroupSessionCodesRequest() {
        return new GetPersonalGroupSessionCodesRequest();
    }

    /**
     * Create an instance of {@link GetPersonalGroupSessionCodesResponse }
     * 
     */
    public GetPersonalGroupSessionCodesResponse createGetPersonalGroupSessionCodesResponse() {
        return new GetPersonalGroupSessionCodesResponse();
    }

    /**
     * Create an instance of {@link GetTestroomSessionCodeRequest }
     * 
     */
    public GetTestroomSessionCodeRequest createGetTestroomSessionCodeRequest() {
        return new GetTestroomSessionCodeRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/sessioncode", name = "successRequest")
    public JAXBElement<String> createSuccessRequest(String value) {
        return new JAXBElement<String>(_SuccessRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Codetype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/sessioncode", name = "createBookingSessionCodeResponse")
    public JAXBElement<Codetype> createCreateBookingSessionCodeResponse(Codetype value) {
        return new JAXBElement<Codetype>(_CreateBookingSessionCodeResponse_QNAME, Codetype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Codetype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/sessioncode", name = "createPersonalBookingSessionCodeResponse")
    public JAXBElement<Codetype> createCreatePersonalBookingSessionCodeResponse(Codetype value) {
        return new JAXBElement<Codetype>(_CreatePersonalBookingSessionCodeResponse_QNAME, Codetype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Codetype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/sessioncode", name = "createPersonalGroupSessionCodeResponse")
    public JAXBElement<Codetype> createCreatePersonalGroupSessionCodeResponse(Codetype value) {
        return new JAXBElement<Codetype>(_CreatePersonalGroupSessionCodeResponse_QNAME, Codetype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Codetype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/sessioncode", name = "createVmsSessionCodeResponse")
    public JAXBElement<Codetype> createCreateVmsSessionCodeResponse(Codetype value) {
        return new JAXBElement<Codetype>(_CreateVmsSessionCodeResponse_QNAME, Codetype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Codetype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/sessioncode", name = "createAppointmentConfirmationSessionCodeResponse")
    public JAXBElement<Codetype> createCreateAppointmentConfirmationSessionCodeResponse(Codetype value) {
        return new JAXBElement<Codetype>(_CreateAppointmentConfirmationSessionCodeResponse_QNAME, Codetype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Codetype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/sessioncode", name = "deleteSessionCodeRequest")
    public JAXBElement<Codetype> createDeleteSessionCodeRequest(Codetype value) {
        return new JAXBElement<Codetype>(_DeleteSessionCodeRequest_QNAME, Codetype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Codetype }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/sessioncode", name = "getTestroomSessionCodeResponse")
    public JAXBElement<Codetype> createGetTestroomSessionCodeResponse(Codetype value) {
        return new JAXBElement<Codetype>(_GetTestroomSessionCodeResponse_QNAME, Codetype.class, null, value);
    }

}


package de.vitero.schema.booking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.vitero.schema.booking package. 
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

    private final static QName _SuccessRequest_QNAME = new QName("http://www.vitero.de/schema/booking", "successRequest");
    private final static QName _SuccessResponse_QNAME = new QName("http://www.vitero.de/schema/booking", "successResponse");
    private final static QName _GetBookingByIdRequest_QNAME = new QName("http://www.vitero.de/schema/booking", "getBookingByIdRequest");
    private final static QName _GetBookingByIdResponse_QNAME = new QName("http://www.vitero.de/schema/booking", "getBookingByIdResponse");
    private final static QName _GetBookingByBookingTimeIdRequest_QNAME = new QName("http://www.vitero.de/schema/booking", "getBookingByBookingTimeIdRequest");
    private final static QName _GetBookingByBookingTimeIdResponse_QNAME = new QName("http://www.vitero.de/schema/booking", "getBookingByBookingTimeIdResponse");
    private final static QName _GetBookingTimeByIdRequest_QNAME = new QName("http://www.vitero.de/schema/booking", "getBookingTimeByIdRequest");
    private final static QName _GetBookingTimeByIdResponse_QNAME = new QName("http://www.vitero.de/schema/booking", "getBookingTimeByIdResponse");
    private final static QName _GetBookingListByGroupAndDateResponse_QNAME = new QName("http://www.vitero.de/schema/booking", "getBookingListByGroupAndDateResponse");
    private final static QName _GetBookingListByGroupInFutureResponse_QNAME = new QName("http://www.vitero.de/schema/booking", "getBookingListByGroupInFutureResponse");
    private final static QName _GetBookingListByUserAndDateResponse_QNAME = new QName("http://www.vitero.de/schema/booking", "getBookingListByUserAndDateResponse");
    private final static QName _GetBookingListByUserAndDateAndCustomerResponse_QNAME = new QName("http://www.vitero.de/schema/booking", "getBookingListByUserAndDateAndCustomerResponse");
    private final static QName _GetBookingListByUserInFutureResponse_QNAME = new QName("http://www.vitero.de/schema/booking", "getBookingListByUserInFutureResponse");
    private final static QName _GetBookingListByUserAndCustomerInFutureResponse_QNAME = new QName("http://www.vitero.de/schema/booking", "getBookingListByUserAndCustomerInFutureResponse");
    private final static QName _GetBookingListByDateResponse_QNAME = new QName("http://www.vitero.de/schema/booking", "getBookingListByDateResponse");
    private final static QName _UpdateBookingResponse_QNAME = new QName("http://www.vitero.de/schema/booking", "updateBookingResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.vitero.schema.booking
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Booking_Type }
     * 
     */
    public Booking_Type createBooking_Type() {
        return new Booking_Type();
    }

    /**
     * Create an instance of {@link Booking_Type.Subtractexceptions }
     * 
     */
    public Booking_Type.Subtractexceptions createBooking_TypeSubtractexceptions() {
        return new Booking_Type.Subtractexceptions();
    }

    /**
     * Create an instance of {@link Booking_Type.Addexceptions }
     * 
     */
    public Booking_Type.Addexceptions createBooking_TypeAddexceptions() {
        return new Booking_Type.Addexceptions();
    }

    /**
     * Create an instance of {@link SuccessResponse }
     * 
     */
    public SuccessResponse createSuccessResponse() {
        return new SuccessResponse();
    }

    /**
     * Create an instance of {@link Bookingid }
     * 
     */
    public Bookingid createBookingid() {
        return new Bookingid();
    }

    /**
     * Create an instance of {@link Bookingtype }
     * 
     */
    public Bookingtype createBookingtype() {
        return new Bookingtype();
    }

    /**
     * Create an instance of {@link Bookingtimeid }
     * 
     */
    public Bookingtimeid createBookingtimeid() {
        return new Bookingtimeid();
    }

    /**
     * Create an instance of {@link Bookingtimetype }
     * 
     */
    public Bookingtimetype createBookingtimetype() {
        return new Bookingtimetype();
    }

    /**
     * Create an instance of {@link GetBookingListByGroupAndDateRequest }
     * 
     */
    public GetBookingListByGroupAndDateRequest createGetBookingListByGroupAndDateRequest() {
        return new GetBookingListByGroupAndDateRequest();
    }

    /**
     * Create an instance of {@link Bookinglist }
     * 
     */
    public Bookinglist createBookinglist() {
        return new Bookinglist();
    }

    /**
     * Create an instance of {@link GetBookingListByGroupInFutureRequest }
     * 
     */
    public GetBookingListByGroupInFutureRequest createGetBookingListByGroupInFutureRequest() {
        return new GetBookingListByGroupInFutureRequest();
    }

    /**
     * Create an instance of {@link GetBookingListByUserAndDateRequest }
     * 
     */
    public GetBookingListByUserAndDateRequest createGetBookingListByUserAndDateRequest() {
        return new GetBookingListByUserAndDateRequest();
    }

    /**
     * Create an instance of {@link GetBookingListByUserAndDateAndCustomerRequest }
     * 
     */
    public GetBookingListByUserAndDateAndCustomerRequest createGetBookingListByUserAndDateAndCustomerRequest() {
        return new GetBookingListByUserAndDateAndCustomerRequest();
    }

    /**
     * Create an instance of {@link GetBookingListByUserInFutureRequest }
     * 
     */
    public GetBookingListByUserInFutureRequest createGetBookingListByUserInFutureRequest() {
        return new GetBookingListByUserInFutureRequest();
    }

    /**
     * Create an instance of {@link GetBookingListByUserAndCustomerInFutureRequest }
     * 
     */
    public GetBookingListByUserAndCustomerInFutureRequest createGetBookingListByUserAndCustomerInFutureRequest() {
        return new GetBookingListByUserAndCustomerInFutureRequest();
    }

    /**
     * Create an instance of {@link GetBookingListByDateRequest }
     * 
     */
    public GetBookingListByDateRequest createGetBookingListByDateRequest() {
        return new GetBookingListByDateRequest();
    }

    /**
     * Create an instance of {@link CreateBookingRequest }
     * 
     */
    public CreateBookingRequest createCreateBookingRequest() {
        return new CreateBookingRequest();
    }

    /**
     * Create an instance of {@link Newbookingtype }
     * 
     */
    public Newbookingtype createNewbookingtype() {
        return new Newbookingtype();
    }

    /**
     * Create an instance of {@link CreateBookingResponse }
     * 
     */
    public CreateBookingResponse createCreateBookingResponse() {
        return new CreateBookingResponse();
    }

    /**
     * Create an instance of {@link UpdateBookingRequest }
     * 
     */
    public UpdateBookingRequest createUpdateBookingRequest() {
        return new UpdateBookingRequest();
    }

    /**
     * Create an instance of {@link DeleteBookingRequest }
     * 
     */
    public DeleteBookingRequest createDeleteBookingRequest() {
        return new DeleteBookingRequest();
    }

    /**
     * Create an instance of {@link DeleteBookingResponse }
     * 
     */
    public DeleteBookingResponse createDeleteBookingResponse() {
        return new DeleteBookingResponse();
    }

    /**
     * Create an instance of {@link de.vitero.schema.booking.Bookingtime }
     * 
     */
    public de.vitero.schema.booking.Bookingtime createBookingtime() {
        return new de.vitero.schema.booking.Bookingtime();
    }

    /**
     * Create an instance of {@link Phonetype }
     * 
     */
    public Phonetype createPhonetype() {
        return new Phonetype();
    }

    /**
     * Create an instance of {@link Booking_Type.Subtractexceptions.Bookingtime }
     * 
     */
    public Booking_Type.Subtractexceptions.Bookingtime createBooking_TypeSubtractexceptionsBookingtime() {
        return new Booking_Type.Subtractexceptions.Bookingtime();
    }

    /**
     * Create an instance of {@link Booking_Type.Addexceptions.Bookingtime }
     * 
     */
    public Booking_Type.Addexceptions.Bookingtime createBooking_TypeAddexceptionsBookingtime() {
        return new Booking_Type.Addexceptions.Bookingtime();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/booking", name = "successRequest")
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
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/booking", name = "successResponse")
    public JAXBElement<SuccessResponse> createSuccessResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_SuccessResponse_QNAME, SuccessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bookingid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Bookingid }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/booking", name = "getBookingByIdRequest")
    public JAXBElement<Bookingid> createGetBookingByIdRequest(Bookingid value) {
        return new JAXBElement<Bookingid>(_GetBookingByIdRequest_QNAME, Bookingid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bookingtype }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Bookingtype }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/booking", name = "getBookingByIdResponse")
    public JAXBElement<Bookingtype> createGetBookingByIdResponse(Bookingtype value) {
        return new JAXBElement<Bookingtype>(_GetBookingByIdResponse_QNAME, Bookingtype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bookingtimeid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Bookingtimeid }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/booking", name = "getBookingByBookingTimeIdRequest")
    public JAXBElement<Bookingtimeid> createGetBookingByBookingTimeIdRequest(Bookingtimeid value) {
        return new JAXBElement<Bookingtimeid>(_GetBookingByBookingTimeIdRequest_QNAME, Bookingtimeid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bookingtype }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Bookingtype }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/booking", name = "getBookingByBookingTimeIdResponse")
    public JAXBElement<Bookingtype> createGetBookingByBookingTimeIdResponse(Bookingtype value) {
        return new JAXBElement<Bookingtype>(_GetBookingByBookingTimeIdResponse_QNAME, Bookingtype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bookingtimeid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Bookingtimeid }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/booking", name = "getBookingTimeByIdRequest")
    public JAXBElement<Bookingtimeid> createGetBookingTimeByIdRequest(Bookingtimeid value) {
        return new JAXBElement<Bookingtimeid>(_GetBookingTimeByIdRequest_QNAME, Bookingtimeid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bookingtimetype }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Bookingtimetype }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/booking", name = "getBookingTimeByIdResponse")
    public JAXBElement<Bookingtimetype> createGetBookingTimeByIdResponse(Bookingtimetype value) {
        return new JAXBElement<Bookingtimetype>(_GetBookingTimeByIdResponse_QNAME, Bookingtimetype.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bookinglist }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Bookinglist }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/booking", name = "getBookingListByGroupAndDateResponse")
    public JAXBElement<Bookinglist> createGetBookingListByGroupAndDateResponse(Bookinglist value) {
        return new JAXBElement<Bookinglist>(_GetBookingListByGroupAndDateResponse_QNAME, Bookinglist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bookinglist }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Bookinglist }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/booking", name = "getBookingListByGroupInFutureResponse")
    public JAXBElement<Bookinglist> createGetBookingListByGroupInFutureResponse(Bookinglist value) {
        return new JAXBElement<Bookinglist>(_GetBookingListByGroupInFutureResponse_QNAME, Bookinglist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bookinglist }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Bookinglist }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/booking", name = "getBookingListByUserAndDateResponse")
    public JAXBElement<Bookinglist> createGetBookingListByUserAndDateResponse(Bookinglist value) {
        return new JAXBElement<Bookinglist>(_GetBookingListByUserAndDateResponse_QNAME, Bookinglist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bookinglist }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Bookinglist }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/booking", name = "getBookingListByUserAndDateAndCustomerResponse")
    public JAXBElement<Bookinglist> createGetBookingListByUserAndDateAndCustomerResponse(Bookinglist value) {
        return new JAXBElement<Bookinglist>(_GetBookingListByUserAndDateAndCustomerResponse_QNAME, Bookinglist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bookinglist }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Bookinglist }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/booking", name = "getBookingListByUserInFutureResponse")
    public JAXBElement<Bookinglist> createGetBookingListByUserInFutureResponse(Bookinglist value) {
        return new JAXBElement<Bookinglist>(_GetBookingListByUserInFutureResponse_QNAME, Bookinglist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bookinglist }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Bookinglist }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/booking", name = "getBookingListByUserAndCustomerInFutureResponse")
    public JAXBElement<Bookinglist> createGetBookingListByUserAndCustomerInFutureResponse(Bookinglist value) {
        return new JAXBElement<Bookinglist>(_GetBookingListByUserAndCustomerInFutureResponse_QNAME, Bookinglist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bookinglist }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Bookinglist }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/booking", name = "getBookingListByDateResponse")
    public JAXBElement<Bookinglist> createGetBookingListByDateResponse(Bookinglist value) {
        return new JAXBElement<Bookinglist>(_GetBookingListByDateResponse_QNAME, Bookinglist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SuccessResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.vitero.de/schema/booking", name = "updateBookingResponse")
    public JAXBElement<SuccessResponse> createUpdateBookingResponse(SuccessResponse value) {
        return new JAXBElement<SuccessResponse>(_UpdateBookingResponse_QNAME, SuccessResponse.class, null, value);
    }

}

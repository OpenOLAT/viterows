package de.vitero.schema.booking;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 4.0.0
 * 2023-01-03T10:58:22.044+01:00
 * Generated source version: 4.0.0
 *
 */
@WebService(targetNamespace = "http://www.vitero.de/schema/booking", name = "Booking")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Booking {

    @WebMethod
    @WebResult(name = "createBookingResponse", targetNamespace = "http://www.vitero.de/schema/booking", partName = "createBookingResponse")
    public CreateBookingResponse createBooking(

        @WebParam(partName = "createBookingRequest", name = "createBookingRequest", targetNamespace = "http://www.vitero.de/schema/booking")
        CreateBookingRequest createBookingRequest
    );

    @WebMethod
    @WebResult(name = "getBookingTimeByIdResponse", targetNamespace = "http://www.vitero.de/schema/booking", partName = "getBookingTimeByIdResponse")
    public Bookingtimetype getBookingTimeById(

        @WebParam(partName = "getBookingTimeByIdRequest", name = "getBookingTimeByIdRequest", targetNamespace = "http://www.vitero.de/schema/booking")
        Bookingtimeid getBookingTimeByIdRequest
    );

    @WebMethod
    @WebResult(name = "getBookingListByUserAndCustomerInFutureResponse", targetNamespace = "http://www.vitero.de/schema/booking", partName = "getBookingListByUserAndCustomerInFutureResponse")
    public Bookinglist getBookingListByUserAndCustomerInFuture(

        @WebParam(partName = "getBookingListByUserAndCustomerInFutureRequest", name = "getBookingListByUserAndCustomerInFutureRequest", targetNamespace = "http://www.vitero.de/schema/booking")
        GetBookingListByUserAndCustomerInFutureRequest getBookingListByUserAndCustomerInFutureRequest
    );

    @WebMethod
    @WebResult(name = "getBookingListByUserInFutureResponse", targetNamespace = "http://www.vitero.de/schema/booking", partName = "getBookingListByUserInFutureResponse")
    public Bookinglist getBookingListByUserInFuture(

        @WebParam(partName = "getBookingListByUserInFutureRequest", name = "getBookingListByUserInFutureRequest", targetNamespace = "http://www.vitero.de/schema/booking")
        GetBookingListByUserInFutureRequest getBookingListByUserInFutureRequest
    );

    @WebMethod
    @WebResult(name = "successResponse", targetNamespace = "http://www.vitero.de/schema/booking", partName = "successResponse")
    public SuccessResponse success(

        @WebParam(partName = "successRequest", name = "successRequest", targetNamespace = "http://www.vitero.de/schema/booking")
        java.lang.String successRequest
    );

    @WebMethod
    @WebResult(name = "getBookingListByUserAndDateAndCustomerResponse", targetNamespace = "http://www.vitero.de/schema/booking", partName = "getBookingListByUserAndDateAndCustomerResponse")
    public Bookinglist getBookingListByUserAndDateAndCustomer(

        @WebParam(partName = "getBookingListByUserAndDateAndCustomerRequest", name = "getBookingListByUserAndDateAndCustomerRequest", targetNamespace = "http://www.vitero.de/schema/booking")
        GetBookingListByUserAndDateAndCustomerRequest getBookingListByUserAndDateAndCustomerRequest
    );

    @WebMethod
    @WebResult(name = "getBookingListByGroupInFutureResponse", targetNamespace = "http://www.vitero.de/schema/booking", partName = "getBookingListByGroupInFutureResponse")
    public Bookinglist getBookingListByGroupInFuture(

        @WebParam(partName = "getBookingListByGroupInFutureRequest", name = "getBookingListByGroupInFutureRequest", targetNamespace = "http://www.vitero.de/schema/booking")
        GetBookingListByGroupInFutureRequest getBookingListByGroupInFutureRequest
    );

    @WebMethod
    @WebResult(name = "getBookingListByDateResponse", targetNamespace = "http://www.vitero.de/schema/booking", partName = "getBookingListByDateResponse")
    public Bookinglist getBookingListByDate(

        @WebParam(partName = "getBookingListByDateRequest", name = "getBookingListByDateRequest", targetNamespace = "http://www.vitero.de/schema/booking")
        GetBookingListByDateRequest getBookingListByDateRequest
    );

    @WebMethod
    @WebResult(name = "getBookingListByUserAndDateResponse", targetNamespace = "http://www.vitero.de/schema/booking", partName = "getBookingListByUserAndDateResponse")
    public Bookinglist getBookingListByUserAndDate(

        @WebParam(partName = "getBookingListByUserAndDateRequest", name = "getBookingListByUserAndDateRequest", targetNamespace = "http://www.vitero.de/schema/booking")
        GetBookingListByUserAndDateRequest getBookingListByUserAndDateRequest
    );

    @WebMethod
    @WebResult(name = "getBookingByBookingTimeIdResponse", targetNamespace = "http://www.vitero.de/schema/booking", partName = "getBookingByBookingTimeIdResponse")
    public Bookingtype getBookingByBookingTimeId(

        @WebParam(partName = "getBookingByBookingTimeIdRequest", name = "getBookingByBookingTimeIdRequest", targetNamespace = "http://www.vitero.de/schema/booking")
        Bookingtimeid getBookingByBookingTimeIdRequest
    );

    @WebMethod
    @WebResult(name = "deleteBookingResponse", targetNamespace = "http://www.vitero.de/schema/booking", partName = "deleteBookingResponse")
    public DeleteBookingResponse deleteBooking(

        @WebParam(partName = "deleteBookingRequest", name = "deleteBookingRequest", targetNamespace = "http://www.vitero.de/schema/booking")
        DeleteBookingRequest deleteBookingRequest
    );

    @WebMethod
    @WebResult(name = "getBookingByIdResponse", targetNamespace = "http://www.vitero.de/schema/booking", partName = "getBookingByIdResponse")
    public Bookingtype getBookingById(

        @WebParam(partName = "getBookingByIdRequest", name = "getBookingByIdRequest", targetNamespace = "http://www.vitero.de/schema/booking")
        Bookingid getBookingByIdRequest
    );

    @WebMethod
    @WebResult(name = "getBookingListByGroupAndDateResponse", targetNamespace = "http://www.vitero.de/schema/booking", partName = "getBookingListByGroupAndDateResponse")
    public Bookinglist getBookingListByGroupAndDate(

        @WebParam(partName = "getBookingListByGroupAndDateRequest", name = "getBookingListByGroupAndDateRequest", targetNamespace = "http://www.vitero.de/schema/booking")
        GetBookingListByGroupAndDateRequest getBookingListByGroupAndDateRequest
    );

    @WebMethod
    @WebResult(name = "updateBookingResponse", targetNamespace = "http://www.vitero.de/schema/booking", partName = "updateBookingResponse")
    public SuccessResponse updateBooking(

        @WebParam(partName = "updateBookingRequest", name = "updateBookingRequest", targetNamespace = "http://www.vitero.de/schema/booking")
        UpdateBookingRequest updateBookingRequest
    );
}

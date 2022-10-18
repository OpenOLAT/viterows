
package de.vitero.schema.booking;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 4.0.0-SNAPSHOT-30b8b01da0cbd72d784fbbb0710efe252293caec
 * 2022-10-11T18:26:22.081+02:00
 * Generated source version: 4.0.0-SNAPSHOT
 *
 */
public final class Booking_BookingSoap11_Client {

    private static final QName SERVICE_NAME = new QName("http://www.vitero.de/schema/booking", "BookingService");

    private Booking_BookingSoap11_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = BookingService.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }

        BookingService ss = new BookingService(wsdlURL, SERVICE_NAME);
        Booking port = ss.getBookingSoap11();

        {
        System.out.println("Invoking createBooking...");
        de.vitero.schema.booking.CreateBookingRequest _createBooking_createBookingRequest = null;
        de.vitero.schema.booking.CreateBookingResponse _createBooking__return = port.createBooking(_createBooking_createBookingRequest);
        System.out.println("createBooking.result=" + _createBooking__return);


        }
        {
        System.out.println("Invoking getBookingTimeById...");
        de.vitero.schema.booking.Bookingtimeid _getBookingTimeById_getBookingTimeByIdRequest = null;
        de.vitero.schema.booking.Bookingtimetype _getBookingTimeById__return = port.getBookingTimeById(_getBookingTimeById_getBookingTimeByIdRequest);
        System.out.println("getBookingTimeById.result=" + _getBookingTimeById__return);


        }
        {
        System.out.println("Invoking getBookingListByUserAndCustomerInFuture...");
        de.vitero.schema.booking.GetBookingListByUserAndCustomerInFutureRequest _getBookingListByUserAndCustomerInFuture_getBookingListByUserAndCustomerInFutureRequest = null;
        de.vitero.schema.booking.Bookinglist _getBookingListByUserAndCustomerInFuture__return = port.getBookingListByUserAndCustomerInFuture(_getBookingListByUserAndCustomerInFuture_getBookingListByUserAndCustomerInFutureRequest);
        System.out.println("getBookingListByUserAndCustomerInFuture.result=" + _getBookingListByUserAndCustomerInFuture__return);


        }
        {
        System.out.println("Invoking getBookingListByUserInFuture...");
        de.vitero.schema.booking.GetBookingListByUserInFutureRequest _getBookingListByUserInFuture_getBookingListByUserInFutureRequest = null;
        de.vitero.schema.booking.Bookinglist _getBookingListByUserInFuture__return = port.getBookingListByUserInFuture(_getBookingListByUserInFuture_getBookingListByUserInFutureRequest);
        System.out.println("getBookingListByUserInFuture.result=" + _getBookingListByUserInFuture__return);


        }
        {
        System.out.println("Invoking success...");
        java.lang.String _success_successRequest = "";
        de.vitero.schema.booking.SuccessResponse _success__return = port.success(_success_successRequest);
        System.out.println("success.result=" + _success__return);


        }
        {
        System.out.println("Invoking getBookingListByUserAndDateAndCustomer...");
        de.vitero.schema.booking.GetBookingListByUserAndDateAndCustomerRequest _getBookingListByUserAndDateAndCustomer_getBookingListByUserAndDateAndCustomerRequest = null;
        de.vitero.schema.booking.Bookinglist _getBookingListByUserAndDateAndCustomer__return = port.getBookingListByUserAndDateAndCustomer(_getBookingListByUserAndDateAndCustomer_getBookingListByUserAndDateAndCustomerRequest);
        System.out.println("getBookingListByUserAndDateAndCustomer.result=" + _getBookingListByUserAndDateAndCustomer__return);


        }
        {
        System.out.println("Invoking getBookingListByGroupInFuture...");
        de.vitero.schema.booking.GetBookingListByGroupInFutureRequest _getBookingListByGroupInFuture_getBookingListByGroupInFutureRequest = null;
        de.vitero.schema.booking.Bookinglist _getBookingListByGroupInFuture__return = port.getBookingListByGroupInFuture(_getBookingListByGroupInFuture_getBookingListByGroupInFutureRequest);
        System.out.println("getBookingListByGroupInFuture.result=" + _getBookingListByGroupInFuture__return);


        }
        {
        System.out.println("Invoking getBookingListByDate...");
        de.vitero.schema.booking.GetBookingListByDateRequest _getBookingListByDate_getBookingListByDateRequest = null;
        de.vitero.schema.booking.Bookinglist _getBookingListByDate__return = port.getBookingListByDate(_getBookingListByDate_getBookingListByDateRequest);
        System.out.println("getBookingListByDate.result=" + _getBookingListByDate__return);


        }
        {
        System.out.println("Invoking getBookingListByUserAndDate...");
        de.vitero.schema.booking.GetBookingListByUserAndDateRequest _getBookingListByUserAndDate_getBookingListByUserAndDateRequest = null;
        de.vitero.schema.booking.Bookinglist _getBookingListByUserAndDate__return = port.getBookingListByUserAndDate(_getBookingListByUserAndDate_getBookingListByUserAndDateRequest);
        System.out.println("getBookingListByUserAndDate.result=" + _getBookingListByUserAndDate__return);


        }
        {
        System.out.println("Invoking getBookingByBookingTimeId...");
        de.vitero.schema.booking.Bookingtimeid _getBookingByBookingTimeId_getBookingByBookingTimeIdRequest = null;
        de.vitero.schema.booking.Bookingtype _getBookingByBookingTimeId__return = port.getBookingByBookingTimeId(_getBookingByBookingTimeId_getBookingByBookingTimeIdRequest);
        System.out.println("getBookingByBookingTimeId.result=" + _getBookingByBookingTimeId__return);


        }
        {
        System.out.println("Invoking deleteBooking...");
        de.vitero.schema.booking.DeleteBookingRequest _deleteBooking_deleteBookingRequest = null;
        de.vitero.schema.booking.DeleteBookingResponse _deleteBooking__return = port.deleteBooking(_deleteBooking_deleteBookingRequest);
        System.out.println("deleteBooking.result=" + _deleteBooking__return);


        }
        {
        System.out.println("Invoking getBookingById...");
        de.vitero.schema.booking.Bookingid _getBookingById_getBookingByIdRequest = null;
        de.vitero.schema.booking.Bookingtype _getBookingById__return = port.getBookingById(_getBookingById_getBookingByIdRequest);
        System.out.println("getBookingById.result=" + _getBookingById__return);


        }
        {
        System.out.println("Invoking getBookingListByGroupAndDate...");
        de.vitero.schema.booking.GetBookingListByGroupAndDateRequest _getBookingListByGroupAndDate_getBookingListByGroupAndDateRequest = null;
        de.vitero.schema.booking.Bookinglist _getBookingListByGroupAndDate__return = port.getBookingListByGroupAndDate(_getBookingListByGroupAndDate_getBookingListByGroupAndDateRequest);
        System.out.println("getBookingListByGroupAndDate.result=" + _getBookingListByGroupAndDate__return);


        }
        {
        System.out.println("Invoking updateBooking...");
        de.vitero.schema.booking.UpdateBookingRequest _updateBooking_updateBookingRequest = null;
        de.vitero.schema.booking.SuccessResponse _updateBooking__return = port.updateBooking(_updateBooking_updateBookingRequest);
        System.out.println("updateBooking.result=" + _updateBooking__return);


        }

        System.exit(0);
    }

}

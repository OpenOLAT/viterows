package de.vitero.schema.booking;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-06-15T19:57:01.532+02:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "BookingService",
                  wsdlLocation = "classpath:wsdl/booking.wsdl",
                  targetNamespace = "http://www.vitero.de/schema/booking")
public class BookingService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.vitero.de/schema/booking", "BookingService");
    public final static QName BookingSoap11 = new QName("http://www.vitero.de/schema/booking", "BookingSoap11");
    static {
        URL url = BookingService.class.getClassLoader().getResource("wsdl/booking.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(BookingService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/booking.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public BookingService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public BookingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BookingService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public BookingService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public BookingService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public BookingService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Booking
     */
    @WebEndpoint(name = "BookingSoap11")
    public Booking getBookingSoap11() {
        return super.getPort(BookingSoap11, Booking.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Booking
     */
    @WebEndpoint(name = "BookingSoap11")
    public Booking getBookingSoap11(WebServiceFeature... features) {
        return super.getPort(BookingSoap11, Booking.class, features);
    }

}

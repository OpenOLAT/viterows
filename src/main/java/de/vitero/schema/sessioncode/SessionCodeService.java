package de.vitero.schema.sessioncode;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.0-SNAPSHOT-654444433f3b17123cbc00fd17ea1c10d7de7a9c
 * 2022-10-18T10:04:13.940+02:00
 * Generated source version: 4.0.0-SNAPSHOT
 *
 */
@WebServiceClient(name = "SessionCodeService",
                  wsdlLocation = "classpath:wsdl/sessioncode.wsdl",
                  targetNamespace = "http://www.vitero.de/schema/sessioncode")
public class SessionCodeService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.vitero.de/schema/sessioncode", "SessionCodeService");
    public final static QName SessionCodeSoap11 = new QName("http://www.vitero.de/schema/sessioncode", "SessionCodeSoap11");
    static {
        URL url = SessionCodeService.class.getClassLoader().getResource("wsdl/sessioncode.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(SessionCodeService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/sessioncode.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SessionCodeService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SessionCodeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SessionCodeService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public SessionCodeService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SessionCodeService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SessionCodeService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns SessionCode
     */
    @WebEndpoint(name = "SessionCodeSoap11")
    public SessionCode getSessionCodeSoap11() {
        return super.getPort(SessionCodeSoap11, SessionCode.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SessionCode
     */
    @WebEndpoint(name = "SessionCodeSoap11")
    public SessionCode getSessionCodeSoap11(WebServiceFeature... features) {
        return super.getPort(SessionCodeSoap11, SessionCode.class, features);
    }

}

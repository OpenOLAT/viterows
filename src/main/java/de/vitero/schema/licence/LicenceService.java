package de.vitero.schema.licence;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.0-SNAPSHOT-654444433f3b17123cbc00fd17ea1c10d7de7a9c
 * 2022-10-18T10:04:13.845+02:00
 * Generated source version: 4.0.0-SNAPSHOT
 *
 */
@WebServiceClient(name = "LicenceService",
                  wsdlLocation = "classpath:wsdl/licence.wsdl",
                  targetNamespace = "http://www.vitero.de/schema/licence")
public class LicenceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.vitero.de/schema/licence", "LicenceService");
    public final static QName LicenceSoap11 = new QName("http://www.vitero.de/schema/licence", "LicenceSoap11");
    static {
        URL url = LicenceService.class.getClassLoader().getResource("wsdl/licence.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(LicenceService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/licence.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public LicenceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LicenceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LicenceService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public LicenceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public LicenceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public LicenceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Licence
     */
    @WebEndpoint(name = "LicenceSoap11")
    public Licence getLicenceSoap11() {
        return super.getPort(LicenceSoap11, Licence.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Licence
     */
    @WebEndpoint(name = "LicenceSoap11")
    public Licence getLicenceSoap11(WebServiceFeature... features) {
        return super.getPort(LicenceSoap11, Licence.class, features);
    }

}

package de.vitero.schema.licence;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.5
 * 2013-06-06T16:09:03.171+02:00
 * Generated source version: 2.7.5
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
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LicenceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public LicenceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
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
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Licence
     */
    @WebEndpoint(name = "LicenceSoap11")
    public Licence getLicenceSoap11(WebServiceFeature... features) {
        return super.getPort(LicenceSoap11, Licence.class, features);
    }

}
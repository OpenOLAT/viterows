package de.vitero.schema.mtom;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.0-SNAPSHOT-30b8b01da0cbd72d784fbbb0710efe252293caec
 * 2022-10-11T18:26:22.300+02:00
 * Generated source version: 4.0.0-SNAPSHOT
 *
 */
@WebServiceClient(name = "MtomService",
                  wsdlLocation = "classpath:wsdl/mtom.wsdl",
                  targetNamespace = "http://www.vitero.de/schema/mtom")
public class MtomService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.vitero.de/schema/mtom", "MtomService");
    public final static QName MtomSoap11 = new QName("http://www.vitero.de/schema/mtom", "MtomSoap11");
    static {
        URL url = MtomService.class.getClassLoader().getResource("wsdl/mtom.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(MtomService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/mtom.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public MtomService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public MtomService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MtomService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public MtomService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public MtomService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public MtomService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Mtom
     */
    @WebEndpoint(name = "MtomSoap11")
    public Mtom getMtomSoap11() {
        return super.getPort(MtomSoap11, Mtom.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Mtom
     */
    @WebEndpoint(name = "MtomSoap11")
    public Mtom getMtomSoap11(WebServiceFeature... features) {
        return super.getPort(MtomSoap11, Mtom.class, features);
    }

}

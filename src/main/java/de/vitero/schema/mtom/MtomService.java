package de.vitero.schema.mtom;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.7
 * 2019-01-18T12:09:01.128+01:00
 * Generated source version: 3.2.7
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
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Mtom
     */
    @WebEndpoint(name = "MtomSoap11")
    public Mtom getMtomSoap11(WebServiceFeature... features) {
        return super.getPort(MtomSoap11, Mtom.class, features);
    }

}

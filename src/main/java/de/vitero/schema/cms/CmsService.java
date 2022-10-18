package de.vitero.schema.cms;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceFeature;
import jakarta.xml.ws.Service;

/**
 * This class was generated by Apache CXF 4.0.0-SNAPSHOT-30b8b01da0cbd72d784fbbb0710efe252293caec
 * 2022-10-11T18:26:22.177+02:00
 * Generated source version: 4.0.0-SNAPSHOT
 *
 */
@WebServiceClient(name = "CmsService",
                  wsdlLocation = "classpath:wsdl/cms.wsdl",
                  targetNamespace = "http://www.vitero.de/schema/cms")
public class CmsService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.vitero.de/schema/cms", "CmsService");
    public final static QName CmsSoap11 = new QName("http://www.vitero.de/schema/cms", "CmsSoap11");
    static {
        URL url = CmsService.class.getClassLoader().getResource("wsdl/cms.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(CmsService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/cms.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CmsService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CmsService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CmsService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CmsService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CmsService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CmsService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Cms
     */
    @WebEndpoint(name = "CmsSoap11")
    public Cms getCmsSoap11() {
        return super.getPort(CmsSoap11, Cms.class);
    }

    /**
     *
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Cms
     */
    @WebEndpoint(name = "CmsSoap11")
    public Cms getCmsSoap11(WebServiceFeature... features) {
        return super.getPort(CmsSoap11, Cms.class, features);
    }

}

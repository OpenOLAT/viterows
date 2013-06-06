package de.vitero.schema.user;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.5
 * 2013-06-06T16:09:03.713+02:00
 * Generated source version: 2.7.5
 * 
 */
@WebServiceClient(name = "UserService", 
                  wsdlLocation = "classpath:wsdl/user.wsdl",
                  targetNamespace = "http://www.vitero.de/schema/user") 
public class UserService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.vitero.de/schema/user", "UserService");
    public final static QName UserSoap11 = new QName("http://www.vitero.de/schema/user", "UserSoap11");
    static {
        URL url = UserService.class.getClassLoader().getResource("wsdl/user.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(UserService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/user.wsdl");
        }       
        WSDL_LOCATION = url;   
    }

    public UserService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UserService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UserService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UserService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UserService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns User
     */
    @WebEndpoint(name = "UserSoap11")
    public User getUserSoap11() {
        return super.getPort(UserSoap11, User.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns User
     */
    @WebEndpoint(name = "UserSoap11")
    public User getUserSoap11(WebServiceFeature... features) {
        return super.getPort(UserSoap11, User.class, features);
    }

}
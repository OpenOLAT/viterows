package de.vitero.schema.group;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-09-18T18:39:05.256+02:00
 * Generated source version: 3.2.4
 *
 */
@WebServiceClient(name = "GroupService",
                  wsdlLocation = "classpath:wsdl/group.wsdl",
                  targetNamespace = "http://www.vitero.de/schema/group")
public class GroupService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.vitero.de/schema/group", "GroupService");
    public final static QName GroupSoap11 = new QName("http://www.vitero.de/schema/group", "GroupSoap11");
    static {
        URL url = GroupService.class.getClassLoader().getResource("wsdl/group.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(GroupService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/group.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GroupService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GroupService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GroupService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public GroupService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public GroupService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public GroupService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Group
     */
    @WebEndpoint(name = "GroupSoap11")
    public Group getGroupSoap11() {
        return super.getPort(GroupSoap11, Group.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Group
     */
    @WebEndpoint(name = "GroupSoap11")
    public Group getGroupSoap11(WebServiceFeature... features) {
        return super.getPort(GroupSoap11, Group.class, features);
    }

}


package de.vitero.schema.licence;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.5
 * 2013-06-06T16:21:52.635+02:00
 * Generated source version: 2.7.5
 * 
 */
public final class Licence_LicenceSoap11_Client {

    private static final QName SERVICE_NAME = new QName("http://www.vitero.de/schema/licence", "LicenceService");

    private Licence_LicenceSoap11_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = LicenceService.WSDL_LOCATION;
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
      
        LicenceService ss = new LicenceService(wsdlURL, SERVICE_NAME);
        Licence port = ss.getLicenceSoap11();  
        
        {
        System.out.println("Invoking getAllModules...");
        de.vitero.schema.licence.GetAllModulesRequest _getAllModules_getAllModulesRequest = null;
        de.vitero.schema.licence.Modulestype _getAllModules__return = port.getAllModules(_getAllModules_getAllModulesRequest);
        System.out.println("getAllModules.result=" + _getAllModules__return);


        }
        {
        System.out.println("Invoking getBookableModulesForGroup...");
        de.vitero.schema.licence.Grouprequesttype _getBookableModulesForGroup_getBookableModulesForGroupRequest = null;
        de.vitero.schema.licence.Modulestype _getBookableModulesForGroup__return = port.getBookableModulesForGroup(_getBookableModulesForGroup_getBookableModulesForGroupRequest);
        System.out.println("getBookableModulesForGroup.result=" + _getBookableModulesForGroup__return);


        }
        {
        System.out.println("Invoking getModulesForCustomer...");
        de.vitero.schema.licence.GetModulesForCustomerRequest _getModulesForCustomer_getModulesForCustomerRequest = null;
        de.vitero.schema.licence.Modulestype _getModulesForCustomer__return = port.getModulesForCustomer(_getModulesForCustomer_getModulesForCustomerRequest);
        System.out.println("getModulesForCustomer.result=" + _getModulesForCustomer__return);


        }
        {
        System.out.println("Invoking groupHasBookableModule...");
        de.vitero.schema.licence.GroupHasBookableModuleRequest _groupHasBookableModule_groupHasBookableModuleRequest = null;
        de.vitero.schema.licence.GroupHasBookableModuleResponse _groupHasBookableModule__return = port.groupHasBookableModule(_groupHasBookableModule_groupHasBookableModuleRequest);
        System.out.println("groupHasBookableModule.result=" + _groupHasBookableModule__return);


        }
        {
        System.out.println("Invoking getBookableRoomsForGroup...");
        de.vitero.schema.licence.Grouprequesttype _getBookableRoomsForGroup_getBookableRoomsForGroupRequest = null;
        de.vitero.schema.licence.GetBookableRoomsForGroupResponse _getBookableRoomsForGroup__return = port.getBookableRoomsForGroup(_getBookableRoomsForGroup_getBookableRoomsForGroupRequest);
        System.out.println("getBookableRoomsForGroup.result=" + _getBookableRoomsForGroup__return);


        }
        {
        System.out.println("Invoking isPhoneAvailable...");
        de.vitero.schema.licence.Grouprequesttype _isPhoneAvailable_isPhoneAvailableRequest = null;
        de.vitero.schema.licence.IsPhoneAvailableResponse _isPhoneAvailable__return = port.isPhoneAvailable(_isPhoneAvailable_isPhoneAvailableRequest);
        System.out.println("isPhoneAvailable.result=" + _isPhoneAvailable__return);


        }

        System.exit(0);
    }

}

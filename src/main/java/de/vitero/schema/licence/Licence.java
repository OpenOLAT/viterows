package de.vitero.schema.licence;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.5
 * 2013-06-06T16:09:03.166+02:00
 * Generated source version: 2.7.5
 * 
 */
@WebService(targetNamespace = "http://www.vitero.de/schema/licence", name = "Licence")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Licence {

    @WebResult(name = "getAllModulesResponse", targetNamespace = "http://www.vitero.de/schema/licence", partName = "getAllModulesResponse")
    @WebMethod
    public Modulestype getAllModules(
        @WebParam(partName = "getAllModulesRequest", name = "getAllModulesRequest", targetNamespace = "http://www.vitero.de/schema/licence")
        GetAllModulesRequest getAllModulesRequest
    );

    @WebResult(name = "getBookableModulesForGroupResponse", targetNamespace = "http://www.vitero.de/schema/licence", partName = "getBookableModulesForGroupResponse")
    @WebMethod
    public Modulestype getBookableModulesForGroup(
        @WebParam(partName = "getBookableModulesForGroupRequest", name = "getBookableModulesForGroupRequest", targetNamespace = "http://www.vitero.de/schema/licence")
        Grouprequesttype getBookableModulesForGroupRequest
    );

    @WebResult(name = "getModulesForCustomerResponse", targetNamespace = "http://www.vitero.de/schema/licence", partName = "getModulesForCustomerResponse")
    @WebMethod
    public Modulestype getModulesForCustomer(
        @WebParam(partName = "getModulesForCustomerRequest", name = "getModulesForCustomerRequest", targetNamespace = "http://www.vitero.de/schema/licence")
        GetModulesForCustomerRequest getModulesForCustomerRequest
    );

    @WebResult(name = "groupHasBookableModuleResponse", targetNamespace = "http://www.vitero.de/schema/licence", partName = "groupHasBookableModuleResponse")
    @WebMethod
    public GroupHasBookableModuleResponse groupHasBookableModule(
        @WebParam(partName = "groupHasBookableModuleRequest", name = "groupHasBookableModuleRequest", targetNamespace = "http://www.vitero.de/schema/licence")
        GroupHasBookableModuleRequest groupHasBookableModuleRequest
    );

    @WebResult(name = "getBookableRoomsForGroupResponse", targetNamespace = "http://www.vitero.de/schema/licence", partName = "getBookableRoomsForGroupResponse")
    @WebMethod
    public GetBookableRoomsForGroupResponse getBookableRoomsForGroup(
        @WebParam(partName = "getBookableRoomsForGroupRequest", name = "getBookableRoomsForGroupRequest", targetNamespace = "http://www.vitero.de/schema/licence")
        Grouprequesttype getBookableRoomsForGroupRequest
    );

    @WebResult(name = "isPhoneAvailableResponse", targetNamespace = "http://www.vitero.de/schema/licence", partName = "isPhoneAvailableResponse")
    @WebMethod
    public IsPhoneAvailableResponse isPhoneAvailable(
        @WebParam(partName = "isPhoneAvailableRequest", name = "isPhoneAvailableRequest", targetNamespace = "http://www.vitero.de/schema/licence")
        Grouprequesttype isPhoneAvailableRequest
    );
}

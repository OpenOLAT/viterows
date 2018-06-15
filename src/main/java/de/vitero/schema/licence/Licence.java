package de.vitero.schema.licence;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-06-15T19:57:01.519+02:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://www.vitero.de/schema/licence", name = "Licence")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Licence {

    @WebMethod
    @WebResult(name = "isPhoneAvailableResponse", targetNamespace = "http://www.vitero.de/schema/licence", partName = "isPhoneAvailableResponse")
    public IsPhoneAvailableResponse isPhoneAvailable(
        @WebParam(partName = "isPhoneAvailableRequest", name = "isPhoneAvailableRequest", targetNamespace = "http://www.vitero.de/schema/licence")
        Grouprequesttype isPhoneAvailableRequest
    );

    @WebMethod
    @WebResult(name = "groupHasBookableModuleResponse", targetNamespace = "http://www.vitero.de/schema/licence", partName = "groupHasBookableModuleResponse")
    public GroupHasBookableModuleResponse groupHasBookableModule(
        @WebParam(partName = "groupHasBookableModuleRequest", name = "groupHasBookableModuleRequest", targetNamespace = "http://www.vitero.de/schema/licence")
        GroupHasBookableModuleRequest groupHasBookableModuleRequest
    );

    @WebMethod
    @WebResult(name = "getBookableModulesForGroupResponse", targetNamespace = "http://www.vitero.de/schema/licence", partName = "getBookableModulesForGroupResponse")
    public Modulestype getBookableModulesForGroup(
        @WebParam(partName = "getBookableModulesForGroupRequest", name = "getBookableModulesForGroupRequest", targetNamespace = "http://www.vitero.de/schema/licence")
        Grouprequesttype getBookableModulesForGroupRequest
    );

    @WebMethod
    @WebResult(name = "successResponse", targetNamespace = "http://www.vitero.de/schema/licence", partName = "successResponse")
    public SuccessResponse success(
        @WebParam(partName = "successRequest", name = "successRequest", targetNamespace = "http://www.vitero.de/schema/licence")
        java.lang.String successRequest
    );

    @WebMethod
    @WebResult(name = "getAllModulesResponse", targetNamespace = "http://www.vitero.de/schema/licence", partName = "getAllModulesResponse")
    public Modulestype getAllModules(
        @WebParam(partName = "getAllModulesRequest", name = "getAllModulesRequest", targetNamespace = "http://www.vitero.de/schema/licence")
        GetAllModulesRequest getAllModulesRequest
    );

    @WebMethod
    @WebResult(name = "getBookableRoomsForGroupResponse", targetNamespace = "http://www.vitero.de/schema/licence", partName = "getBookableRoomsForGroupResponse")
    public GetBookableRoomsForGroupResponse getBookableRoomsForGroup(
        @WebParam(partName = "getBookableRoomsForGroupRequest", name = "getBookableRoomsForGroupRequest", targetNamespace = "http://www.vitero.de/schema/licence")
        Grouprequesttype getBookableRoomsForGroupRequest
    );

    @WebMethod
    @WebResult(name = "getModulesForCustomerResponse", targetNamespace = "http://www.vitero.de/schema/licence", partName = "getModulesForCustomerResponse")
    public Modulestype getModulesForCustomer(
        @WebParam(partName = "getModulesForCustomerRequest", name = "getModulesForCustomerRequest", targetNamespace = "http://www.vitero.de/schema/licence")
        GetModulesForCustomerRequest getModulesForCustomerRequest
    );
}

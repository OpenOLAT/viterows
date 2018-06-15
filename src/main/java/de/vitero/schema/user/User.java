package de.vitero.schema.user;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.4
 * 2018-06-15T19:57:02.045+02:00
 * Generated source version: 3.2.4
 *
 */
@WebService(targetNamespace = "http://www.vitero.de/schema/user", name = "User")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface User {

    @WebMethod
    @Oneway
    public void deleteUser(
        @WebParam(partName = "deleteUserRequest", name = "deleteUserRequest", targetNamespace = "http://www.vitero.de/schema/user")
        Userid deleteUserRequest
    );

    @WebMethod
    @WebResult(name = "createUserResponse", targetNamespace = "http://www.vitero.de/schema/user", partName = "createUserResponse")
    public Userid createUser(
        @WebParam(partName = "createUserRequest", name = "createUserRequest", targetNamespace = "http://www.vitero.de/schema/user")
        CreateUserRequest createUserRequest
    );

    @WebMethod
    @WebResult(name = "getUserListByGroupResponse", targetNamespace = "http://www.vitero.de/schema/user", partName = "getUserListByGroupResponse")
    public Userlist getUserListByGroup(
        @WebParam(partName = "getUserListByGroupRequest", name = "getUserListByGroupRequest", targetNamespace = "http://www.vitero.de/schema/user")
        GetUserListByGroupRequest getUserListByGroupRequest
    );

    @WebMethod
    @WebResult(name = "getUserCountResponse", targetNamespace = "http://www.vitero.de/schema/user", partName = "getUserCountResponse")
    public GetUserCountResponse getUserCount(
        @WebParam(partName = "getUserCountRequest", name = "getUserCountRequest", targetNamespace = "http://www.vitero.de/schema/user")
        GetUserCountRequest getUserCountRequest
    );

    @WebMethod
    @WebResult(name = "getUserListByCustomerResponse", targetNamespace = "http://www.vitero.de/schema/user", partName = "getUserListByCustomerResponse")
    public Userlist getUserListByCustomer(
        @WebParam(partName = "getUserListByCustomerRequest", name = "getUserListByCustomerRequest", targetNamespace = "http://www.vitero.de/schema/user")
        GetUserListByCustomerRequest getUserListByCustomerRequest
    );

    @WebMethod
    @WebResult(name = "successResponse", targetNamespace = "http://www.vitero.de/schema/user", partName = "successResponse")
    public SuccessResponse success(
        @WebParam(partName = "successRequest", name = "successRequest", targetNamespace = "http://www.vitero.de/schema/user")
        java.lang.String successRequest
    );

    @WebMethod
    @Oneway
    public void updateUser(
        @WebParam(partName = "updateUserRequest", name = "updateUserRequest", targetNamespace = "http://www.vitero.de/schema/user")
        UpdateUserRequest updateUserRequest
    );

    @WebMethod
    @WebResult(name = "getUserListResponse", targetNamespace = "http://www.vitero.de/schema/user", partName = "getUserListResponse")
    public Userlist getUserList(
        @WebParam(partName = "getUserListRequest", name = "getUserListRequest", targetNamespace = "http://www.vitero.de/schema/user")
        java.lang.Object getUserListRequest
    );

    @WebMethod
    @Oneway
    public void changePassword(
        @WebParam(partName = "changePasswordRequest", name = "changePasswordRequest", targetNamespace = "http://www.vitero.de/schema/user")
        ChangePasswordRequest changePasswordRequest
    );

    @WebMethod
    @WebResult(name = "getUserListByPositionResponse", targetNamespace = "http://www.vitero.de/schema/user", partName = "getUserListByPositionResponse")
    public Userlist getUserListByPosition(
        @WebParam(partName = "getUserListByPositionRequest", name = "getUserListByPositionRequest", targetNamespace = "http://www.vitero.de/schema/user")
        GetUserListByPositionRequest getUserListByPositionRequest
    );

    @WebMethod
    @Oneway
    public void storeAvatarUsingBase64String(
        @WebParam(partName = "storeAvatarUsingBase64StringRequest", name = "storeAvatarUsingBase64StringRequest", targetNamespace = "http://www.vitero.de/schema/user")
        StoreAvatarUsingBase64StringRequest storeAvatarUsingBase64StringRequest
    );

    @WebMethod
    @WebResult(name = "getUserResponse", targetNamespace = "http://www.vitero.de/schema/user", partName = "getUserResponse")
    public GetUserResponse getUser(
        @WebParam(partName = "getUserRequest", name = "getUserRequest", targetNamespace = "http://www.vitero.de/schema/user")
        Userid getUserRequest
    );
}

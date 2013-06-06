
package de.vitero.schema.group;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.5
 * 2013-06-06T16:09:02.983+02:00
 * Generated source version: 2.7.5
 * 
 */
public final class Group_GroupSoap11_Client {

    private static final QName SERVICE_NAME = new QName("http://www.vitero.de/schema/group", "GroupService");

    private Group_GroupSoap11_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = GroupService.WSDL_LOCATION;
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
      
        GroupService ss = new GroupService(wsdlURL, SERVICE_NAME);
        Group port = ss.getGroupSoap11();  
        
        {
        System.out.println("Invoking getGroupByName...");
        de.vitero.schema.group.Groupnamecustomerid _getGroupByName_getGroupByNameRequest = null;
        de.vitero.schema.group.Group_Type _getGroupByName__return = port.getGroupByName(_getGroupByName_getGroupByNameRequest);
        System.out.println("getGroupByName.result=" + _getGroupByName__return);


        }
        {
        System.out.println("Invoking addUserToGroup...");
        de.vitero.schema.group.Groupiduserid _addUserToGroup_addUserToGroupRequest = null;
        port.addUserToGroup(_addUserToGroup_addUserToGroupRequest);


        }
        {
        System.out.println("Invoking getGroupListByCustomer...");
        de.vitero.schema.group.GetGroupListByCustomerRequest _getGroupListByCustomer_getGroupListByCustomerRequest = null;
        de.vitero.schema.group.GetGroupListByCustomerResponse _getGroupListByCustomer__return = port.getGroupListByCustomer(_getGroupListByCustomer_getGroupListByCustomerRequest);
        System.out.println("getGroupListByCustomer.result=" + _getGroupListByCustomer__return);


        }
        {
        System.out.println("Invoking changeGroupRole...");
        de.vitero.schema.group.ChangeGroupRoleRequest _changeGroupRole_changeGroupRoleRequest = null;
        port.changeGroupRole(_changeGroupRole_changeGroupRoleRequest);


        }
        {
        System.out.println("Invoking removeUserFromGroup...");
        de.vitero.schema.group.Groupiduserid _removeUserFromGroup_removeUserFromGroupRequest = null;
        port.removeUserFromGroup(_removeUserFromGroup_removeUserFromGroupRequest);


        }
        {
        System.out.println("Invoking getGroup...");
        de.vitero.schema.group.Groupid _getGroup_getGroupRequest = null;
        de.vitero.schema.group.Group_Type _getGroup__return = port.getGroup(_getGroup_getGroupRequest);
        System.out.println("getGroup.result=" + _getGroup__return);


        }
        {
        System.out.println("Invoking changeEnabled...");
        de.vitero.schema.group.ChangeEnabledRequest _changeEnabled_changeEnabledRequest = null;
        port.changeEnabled(_changeEnabled_changeEnabledRequest);


        }
        {
        System.out.println("Invoking createGroup...");
        de.vitero.schema.group.CreateGroupRequest _createGroup_createGroupRequest = null;
        de.vitero.schema.group.Groupid _createGroup__return = port.createGroup(_createGroup_createGroupRequest);
        System.out.println("createGroup.result=" + _createGroup__return);


        }
        {
        System.out.println("Invoking updateGroup...");
        de.vitero.schema.group.UpdateGroupRequest _updateGroup_updateGroupRequest = null;
        port.updateGroup(_updateGroup_updateGroupRequest);


        }
        {
        System.out.println("Invoking deleteGroup...");
        de.vitero.schema.group.Groupid _deleteGroup_deleteGroupRequest = null;
        port.deleteGroup(_deleteGroup_deleteGroupRequest);


        }

        System.exit(0);
    }

}


package de.vitero.schema.cms;

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
 * This class was generated by Apache CXF 3.4.3
 * 2021-05-05T17:04:34.341+02:00
 * Generated source version: 3.4.3
 *
 */
public final class Cms_CmsSoap11_Client {

    private static final QName SERVICE_NAME = new QName("http://www.vitero.de/schema/cms", "CmsService");

    private Cms_CmsSoap11_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = CmsService.WSDL_LOCATION;
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

        CmsService ss = new CmsService(wsdlURL, SERVICE_NAME);
        Cms port = ss.getCmsSoap11();

        {
        System.out.println("Invoking copyNode...");
        de.vitero.schema.cms.SourceAndDestNodeId _copyNode_copyNodeRequest = null;
        de.vitero.schema.cms.SuccessResponse _copyNode__return = port.copyNode(_copyNode_copyNodeRequest);
        System.out.println("copyNode.result=" + _copyNode__return);


        }
        {
        System.out.println("Invoking getDisplaytype...");
        de.vitero.schema.cms.GetDisplaytypeRequest _getDisplaytype_getDisplaytypeRequest = null;
        de.vitero.schema.cms.GetDisplaytypeResponse _getDisplaytype__return = port.getDisplaytype(_getDisplaytype_getDisplaytypeRequest);
        System.out.println("getDisplaytype.result=" + _getDisplaytype__return);


        }
        {
        System.out.println("Invoking getCustomerFolder...");
        de.vitero.schema.cms.GetCustomerFolderRequest _getCustomerFolder_getCustomerFolderRequest = null;
        de.vitero.schema.cms.WrappedFolder _getCustomerFolder__return = port.getCustomerFolder(_getCustomerFolder_getCustomerFolderRequest);
        System.out.println("getCustomerFolder.result=" + _getCustomerFolder__return);


        }
        {
        System.out.println("Invoking success...");
        java.lang.String _success_successRequest = "";
        de.vitero.schema.cms.SuccessResponse _success__return = port.success(_success_successRequest);
        System.out.println("success.result=" + _success__return);


        }
        {
        System.out.println("Invoking renameNode...");
        de.vitero.schema.cms.RenameNodeRequest _renameNode_renameNodeRequest = null;
        de.vitero.schema.cms.SuccessResponse _renameNode__return = port.renameNode(_renameNode_renameNodeRequest);
        System.out.println("renameNode.result=" + _renameNode__return);


        }
        {
        System.out.println("Invoking moveNode...");
        de.vitero.schema.cms.SourceAndDestNodeId _moveNode_moveNodeRequest = null;
        de.vitero.schema.cms.SuccessResponse _moveNode__return = port.moveNode(_moveNode_moveNodeRequest);
        System.out.println("moveNode.result=" + _moveNode__return);


        }
        {
        System.out.println("Invoking getGroupFolder...");
        de.vitero.schema.cms.GetGroupFolderRequest _getGroupFolder_getGroupFolderRequest = null;
        de.vitero.schema.cms.WrappedFolder _getGroupFolder__return = port.getGroupFolder(_getGroupFolder_getGroupFolderRequest);
        System.out.println("getGroupFolder.result=" + _getGroupFolder__return);


        }
        {
        System.out.println("Invoking deleteNode...");
        de.vitero.schema.cms.DeleteNodeRequest _deleteNode_deleteNodeRequest = null;
        de.vitero.schema.cms.SuccessResponse _deleteNode__return = port.deleteNode(_deleteNode_deleteNodeRequest);
        System.out.println("deleteNode.result=" + _deleteNode__return);


        }
        {
        System.out.println("Invoking createFolder...");
        de.vitero.schema.cms.CreateFolderRequest _createFolder_createFolderRequest = null;
        de.vitero.schema.cms.CreateFolderResponse _createFolder__return = port.createFolder(_createFolder_createFolderRequest);
        System.out.println("createFolder.result=" + _createFolder__return);


        }
        {
        System.out.println("Invoking changeDisplaytype...");
        de.vitero.schema.cms.ChangeDisplaytypeRequest _changeDisplaytype_changeDisplaytypeRequest = null;
        de.vitero.schema.cms.SuccessResponse _changeDisplaytype__return = port.changeDisplaytype(_changeDisplaytype_changeDisplaytypeRequest);
        System.out.println("changeDisplaytype.result=" + _changeDisplaytype__return);


        }
        {
        System.out.println("Invoking changeVisibility...");
        de.vitero.schema.cms.ChangeVisibilityRequest _changeVisibility_changeVisibilityRequest = null;
        de.vitero.schema.cms.SuccessResponse _changeVisibility__return = port.changeVisibility(_changeVisibility_changeVisibilityRequest);
        System.out.println("changeVisibility.result=" + _changeVisibility__return);


        }

        System.exit(0);
    }

}

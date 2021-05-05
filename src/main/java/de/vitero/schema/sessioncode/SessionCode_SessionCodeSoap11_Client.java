
package de.vitero.schema.sessioncode;

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
 * 2021-05-05T17:04:34.710+02:00
 * Generated source version: 3.4.3
 *
 */
public final class SessionCode_SessionCodeSoap11_Client {

    private static final QName SERVICE_NAME = new QName("http://www.vitero.de/schema/sessioncode", "SessionCodeService");

    private SessionCode_SessionCodeSoap11_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = SessionCodeService.WSDL_LOCATION;
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

        SessionCodeService ss = new SessionCodeService(wsdlURL, SERVICE_NAME);
        SessionCode port = ss.getSessionCodeSoap11();

        {
        System.out.println("Invoking getPersonalGroupSessionCodes...");
        de.vitero.schema.sessioncode.GetPersonalGroupSessionCodesRequest _getPersonalGroupSessionCodes_getPersonalGroupSessionCodesRequest = null;
        de.vitero.schema.sessioncode.GetPersonalGroupSessionCodesResponse _getPersonalGroupSessionCodes__return = port.getPersonalGroupSessionCodes(_getPersonalGroupSessionCodes_getPersonalGroupSessionCodesRequest);
        System.out.println("getPersonalGroupSessionCodes.result=" + _getPersonalGroupSessionCodes__return);


        }
        {
        System.out.println("Invoking getTestroomSessionCode...");
        de.vitero.schema.sessioncode.GetTestroomSessionCodeRequest _getTestroomSessionCode_getTestroomSessionCodeRequest = null;
        de.vitero.schema.sessioncode.Codetype _getTestroomSessionCode__return = port.getTestroomSessionCode(_getTestroomSessionCode_getTestroomSessionCodeRequest);
        System.out.println("getTestroomSessionCode.result=" + _getTestroomSessionCode__return);


        }
        {
        System.out.println("Invoking success...");
        java.lang.String _success_successRequest = "";
        de.vitero.schema.sessioncode.SuccessResponse _success__return = port.success(_success_successRequest);
        System.out.println("success.result=" + _success__return);


        }
        {
        System.out.println("Invoking createAppointmentConfirmationSessionCode...");
        de.vitero.schema.sessioncode.CreateAppointmentConfirmationSessionCodeRequest _createAppointmentConfirmationSessionCode_createAppointmentConfirmationSessionCodeRequest = null;
        de.vitero.schema.sessioncode.Codetype _createAppointmentConfirmationSessionCode__return = port.createAppointmentConfirmationSessionCode(_createAppointmentConfirmationSessionCode_createAppointmentConfirmationSessionCodeRequest);
        System.out.println("createAppointmentConfirmationSessionCode.result=" + _createAppointmentConfirmationSessionCode__return);


        }
        {
        System.out.println("Invoking createGroupSessionCode...");
        de.vitero.schema.sessioncode.CreateGroupSessionCodeRequest _createGroupSessionCode_createGroupSessionCodeRequest = null;
        de.vitero.schema.sessioncode.Codetype _createGroupSessionCode__return = port.createGroupSessionCode(_createGroupSessionCode_createGroupSessionCodeRequest);
        System.out.println("createGroupSessionCode.result=" + _createGroupSessionCode__return);


        }
        {
        System.out.println("Invoking createBookingSessionCode...");
        de.vitero.schema.sessioncode.CreateBookingSessionCodeRequest _createBookingSessionCode_createBookingSessionCodeRequest = null;
        de.vitero.schema.sessioncode.Codetype _createBookingSessionCode__return = port.createBookingSessionCode(_createBookingSessionCode_createBookingSessionCodeRequest);
        System.out.println("createBookingSessionCode.result=" + _createBookingSessionCode__return);


        }
        {
        System.out.println("Invoking createPersonalGroupSessionCode...");
        de.vitero.schema.sessioncode.CreatePersonalGroupSessionCodeRequest _createPersonalGroupSessionCode_createPersonalGroupSessionCodeRequest = null;
        de.vitero.schema.sessioncode.Codetype _createPersonalGroupSessionCode__return = port.createPersonalGroupSessionCode(_createPersonalGroupSessionCode_createPersonalGroupSessionCodeRequest);
        System.out.println("createPersonalGroupSessionCode.result=" + _createPersonalGroupSessionCode__return);


        }
        {
        System.out.println("Invoking createVmsSessionCode...");
        de.vitero.schema.sessioncode.CreateVmsSessionCodeRequest _createVmsSessionCode_createVmsSessionCodeRequest = null;
        de.vitero.schema.sessioncode.Codetype _createVmsSessionCode__return = port.createVmsSessionCode(_createVmsSessionCode_createVmsSessionCodeRequest);
        System.out.println("createVmsSessionCode.result=" + _createVmsSessionCode__return);


        }
        {
        System.out.println("Invoking getPersonalBookingSessionCodes...");
        de.vitero.schema.sessioncode.GetPersonalBookingSessionCodesRequest _getPersonalBookingSessionCodes_getPersonalBookingSessionCodesRequest = null;
        de.vitero.schema.sessioncode.GetPersonalBookingSessionCodesResponse _getPersonalBookingSessionCodes__return = port.getPersonalBookingSessionCodes(_getPersonalBookingSessionCodes_getPersonalBookingSessionCodesRequest);
        System.out.println("getPersonalBookingSessionCodes.result=" + _getPersonalBookingSessionCodes__return);


        }
        {
        System.out.println("Invoking createWebaccessSessionCode...");
        de.vitero.schema.sessioncode.CreateWebaccessSessionCodeRequest _createWebaccessSessionCode_createWebaccessSessionCodeRequest = null;
        de.vitero.schema.sessioncode.CreateWebaccessSessionCodeResponse _createWebaccessSessionCode__return = port.createWebaccessSessionCode(_createWebaccessSessionCode_createWebaccessSessionCodeRequest);
        System.out.println("createWebaccessSessionCode.result=" + _createWebaccessSessionCode__return);


        }
        {
        System.out.println("Invoking getSessionCodeInformation...");
        de.vitero.schema.sessioncode.GetSessionCodeInformationRequest _getSessionCodeInformation_getSessionCodeInformationRequest = null;
        de.vitero.schema.sessioncode.GetSessionCodeInformationResponse _getSessionCodeInformation__return = port.getSessionCodeInformation(_getSessionCodeInformation_getSessionCodeInformationRequest);
        System.out.println("getSessionCodeInformation.result=" + _getSessionCodeInformation__return);


        }
        {
        System.out.println("Invoking deleteSessionCode...");
        de.vitero.schema.sessioncode.DeleteSessionCodeRequest _deleteSessionCode_deleteSessionCodeRequest = null;
        de.vitero.schema.sessioncode.SuccessResponse _deleteSessionCode__return = port.deleteSessionCode(_deleteSessionCode_deleteSessionCodeRequest);
        System.out.println("deleteSessionCode.result=" + _deleteSessionCode__return);


        }
        {
        System.out.println("Invoking createPersonalBookingSessionCode...");
        de.vitero.schema.sessioncode.CreatePersonalBookingSessionCodeRequest _createPersonalBookingSessionCode_createPersonalBookingSessionCodeRequest = null;
        de.vitero.schema.sessioncode.Codetype _createPersonalBookingSessionCode__return = port.createPersonalBookingSessionCode(_createPersonalBookingSessionCode_createPersonalBookingSessionCodeRequest);
        System.out.println("createPersonalBookingSessionCode.result=" + _createPersonalBookingSessionCode__return);


        }

        System.exit(0);
    }

}

/**
 * <a href="http://www.openolat.org">
 * OpenOLAT - Online Learning and Training</a><br>
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); <br>
 * you may not use this file except in compliance with the License.<br>
 * You may obtain a copy of the License at the
 * <a href="http://www.apache.org/licenses/LICENSE-2.0">Apache homepage</a>
 * <p>
 * Unless required by applicable law or agreed to in writing,<br>
 * software distributed under the License is distributed on an "AS IS" BASIS, <br>
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. <br>
 * See the License for the specific language governing permissions and <br>
 * limitations under the License.
 * <p>
 * Initial code contributed and copyrighted by<br>
 * frentix GmbH, http://www.frentix.com
 * <p>
 */
package de.vitero;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

import javax.xml.namespace.QName;
import jakarta.xml.soap.SOAPElement;
import jakarta.xml.soap.SOAPEnvelope;
import jakarta.xml.soap.SOAPFactory;
import jakarta.xml.soap.SOAPHeader;
import jakarta.xml.ws.handler.MessageContext;
import jakarta.xml.ws.handler.soap.SOAPHandler;
import jakarta.xml.ws.handler.soap.SOAPMessageContext;

import org.apache.commons.codec.binary.Base64;

/**
 * 
 * @author srosse, stephane.rosse@frentix.com, http://www.frentix.com
 *
 */
public class ViteroSecurityHandler implements SOAPHandler<SOAPMessageContext> {

	private final String login;
	private final String pwd;
	
	public ViteroSecurityHandler(String login, String pwd) {
		this.login = login;
		this.pwd = pwd;
	}
	
	@Override
	public Set<QName> getHeaders() {
		return new TreeSet<>();
	}
	
	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean outboundProperty = (Boolean)context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if (outboundProperty.booleanValue()) {
			try {
				SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
				SOAPFactory factory = SOAPFactory.newInstance();
				String prefix = "wsse";
				String uri = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
				String wsuUri = "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";
				
				//Security
				SOAPElement securityElem = factory.createElement("Security", prefix, uri);
				securityElem.addAttribute(new QName("http://schemas.xmlsoap.org/soap/envelope/", "mustUnderstand", "soapenv"), "1");
				{
					//UsernameToken
					SOAPElement tokenElem = factory.createElement("UsernameToken", prefix, uri);
					tokenElem.addAttribute(QName.valueOf("wsu:Id"), "XWSSGID-1317643090236539015674");
					tokenElem.addAttribute(QName.valueOf("xmlns:wsu"), wsuUri);
					{
						
						//Username
						SOAPElement userElem = factory.createElement("Username", prefix, uri);
						userElem.addTextNode(login);
						tokenElem.addChildElement(userElem);
						//Password
						SOAPElement pwdElem = factory.createElement("Password", prefix, uri);
						pwdElem.addTextNode(pwd);
						pwdElem.addAttribute(QName.valueOf("Type"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
						tokenElem.addChildElement(pwdElem);
						//Nonce
						SOAPElement nonceElem = factory.createElement("Nonce", prefix, uri);
						String uuid = UUID.randomUUID().toString();
						String uuid64 = Base64.encodeBase64String(uuid.getBytes());
						nonceElem.addTextNode(uuid64);
						nonceElem.addAttribute(QName.valueOf("EncodingType"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary");
						tokenElem.addChildElement(nonceElem);
						//Created
						SOAPElement createdElem = factory.createElement("Created", "wsu", wsuUri);
						createdElem.addAttribute(QName.valueOf("wsu:Id"), "XWSSGID-1317643090236539015674");
						createdElem.addAttribute(QName.valueOf("xmlns:wsu"), wsuUri);
						SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.S'Z'");
						String created = format.format(new Date());
						createdElem.addTextNode(created);
						tokenElem.addChildElement(createdElem);
					}
					securityElem.addChildElement(tokenElem);
				}
				SOAPHeader header = envelope.addHeader();
				header.addChildElement(securityElem);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			// inbound
		}
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return false;
	}

	@Override
	public void close(MessageContext context) {
		//
	}



	
	
}

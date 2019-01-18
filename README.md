# Vitero WS for OpenOLAT

The SOAP interfaces for vitero used by OpenOLAT. You can download the WSDLs files with

```
https://vms3.vitero.de/vitero/services/booking.wsdl
https://vms3.vitero.de/vitero/services/cms.wsdl
https://vms3.vitero.de/vitero/services/customer.wsdl
https://vms3.vitero.de/vitero/services/group.wsdl
https://vms3.vitero.de/vitero/services/licence.wsdl
https://vms3.vitero.de/vitero/services/mtom.wsdl
https://vms3.vitero.de/vitero/services/sessioncode.wsdl
https://vms3.vitero.de/vitero/services/user.wsdl
```

Remove the method and operation ```success``` in mtmo.wsdl and ```moveToUser``` in customer.wsdl. Than you can compile the WSDLs with the following command:

```bash
mvn clean generate-sources
```


Add this annotation

```@org.apache.cxf.annotations.EndpointProperty(key = "soap.no.validate.parts", value = "true")```

to all webservices (search the annotation @WebService)

```bash
mvn package
```
package com.client;

import com.service.DemoWebService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class DemoWebServiceClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:1986/wss/hello?wsdl");

        QName qName = new QName("http://service.com/", "DemoWebServiceImplService");

        Service service = Service.create(url, qName);

        DemoWebService demoWebService = service.getPort(DemoWebService.class);

        System.out.println(demoWebService.getHelloString("JavaRush"));
    }
}

package com.client;

import com.service.DemoWebService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class DemoWebServiceClient {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://localhost:1986/wss/hello?wsdl");//адрес, на котором крутится наш сервис

        QName qName = new QName("http://service.com/", "DemoWebServiceImplService");//стучимся на наш сервис, аргументы ищем в wsdl- описании

        Service service = Service.create(url, qName);//соберём экземпляр сервиса

        DemoWebService demoWebService = service.getPort(DemoWebService.class);//получаем ссылку на удалённый от нас объект веб-сервиса

        System.out.println(demoWebService.getHelloString("JavaRush"));//ловим сообщение
    }
}

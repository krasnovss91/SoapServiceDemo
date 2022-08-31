package com.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.service.DemoWebService")
public class DemoWebServiceImpl implements DemoWebService {//реализация сервиса
    @Override
    public String getHelloString(String name) {
        return "Hello, " + name + "!";
    }
}

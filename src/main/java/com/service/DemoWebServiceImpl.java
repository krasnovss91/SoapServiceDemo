package com.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.service.DemoWebService")
public class DemoWebServiceImpl implements DemoWebService {
    @Override
    public String getHelloString(String name) {
        return "Hello, " + name + "!";
    }
}

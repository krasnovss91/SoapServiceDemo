package com;

import com.service.DemoWebServiceImpl;

import javax.xml.ws.Endpoint;

public class DemoWebServicePublisher {
    public static void main(String [] args){

        Endpoint.publish("http://localhost:1986/wss/hello",new DemoWebServiceImpl());
    }
}

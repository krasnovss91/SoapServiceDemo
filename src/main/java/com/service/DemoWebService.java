package com.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)//интерфейс, изображающий наш soap-сервис
public interface DemoWebService {
    @WebMethod
    public String getHelloString(String name);//метод, его можно вызывать по сети
}

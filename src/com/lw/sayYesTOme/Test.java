package com.lw.sayYesTOme;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-08-24T09:27:49.948+08:00
 * Generated source version: 2.7.18
 * 
 */
@WebService(targetNamespace = "http://wl.com/", name = "Test")
@XmlSeeAlso({ObjectFactory.class})
public interface Test {

    @WebMethod
    @RequestWrapper(localName = "say", targetNamespace = "http://wl.com/", className = "com.lw.sayYesTOme.Say")
    @ResponseWrapper(localName = "sayResponse", targetNamespace = "http://wl.com/", className = "com.lw.sayYesTOme.SayResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String say(
        @WebParam(name = "name", targetNamespace = "")
        java.lang.String name,
        @WebParam(name = "age", targetNamespace = "")
        java.lang.String age
    );
}
package com.wdp.sayHello;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-08-23T15:06:58.292+08:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "HelloWorldImplService", 
                  wsdlLocation = "http://localhost:8088/CXFService/sayHello?wsdl",
                  targetNamespace = "http://wdp.com/") 
public class HelloWorldImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://wdp.com/", "HelloWorldImplService");
    public final static QName HelloWorldImplPort = new QName("http://wdp.com/", "HelloWorldImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8088/CXFService/sayHello?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloWorldImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8088/CXFService/sayHello?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloWorldImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloWorldImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorldImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloWorldImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloWorldImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public HelloWorldImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns HelloWorld
     */
    @WebEndpoint(name = "HelloWorldImplPort")
    public HelloWorld getHelloWorldImplPort() {
        return super.getPort(HelloWorldImplPort, HelloWorld.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorld
     */
    @WebEndpoint(name = "HelloWorldImplPort")
    public HelloWorld getHelloWorldImplPort(WebServiceFeature... features) {
        return super.getPort(HelloWorldImplPort, HelloWorld.class, features);
    }

}

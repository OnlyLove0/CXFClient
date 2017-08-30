package com.lw.sayYesTOme;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.18
 * 2017-08-24T09:27:50.043+08:00
 * Generated source version: 2.7.18
 * 
 */
@WebServiceClient(name = "TestImplService", 
                  wsdlLocation = "http://localhost:8088/CXFService/say?wsdl",
                  targetNamespace = "http://wl.com/") 
public class TestImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://wl.com/", "TestImplService");
    public final static QName TestImplPort = new QName("http://wl.com/", "TestImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8088/CXFService/say?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TestImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8088/CXFService/say?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TestImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TestImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TestImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TestImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TestImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public TestImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns Test
     */
    @WebEndpoint(name = "TestImplPort")
    public Test getTestImplPort() {
        return super.getPort(TestImplPort, Test.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Test
     */
    @WebEndpoint(name = "TestImplPort")
    public Test getTestImplPort(WebServiceFeature... features) {
        return super.getPort(TestImplPort, Test.class, features);
    }

}

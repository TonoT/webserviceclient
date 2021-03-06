package demo.hw.server;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.15
 * 2018-11-28T14:24:37.487+08:00
 * Generated source version: 3.1.15
 * 
 */
@WebServiceClient(name = "HelloWorld2", 
                  wsdlLocation = "http://localhost:8080/EpointFrame/services/hello_world2?wsdl",
                  targetNamespace = "http://server.hw.demo/") 
public class HelloWorld2_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://server.hw.demo/", "HelloWorld2");
    public final static QName HelloWorldImpl2Port = new QName("http://server.hw.demo/", "HelloWorldImpl2Port");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/EpointFrame/services/hello_world2?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloWorld2_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/EpointFrame/services/hello_world2?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloWorld2_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloWorld2_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorld2_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public HelloWorld2_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HelloWorld2_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HelloWorld2_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns HelloWorld2
     */
    @WebEndpoint(name = "HelloWorldImpl2Port")
    public HelloWorld2 getHelloWorldImpl2Port() {
        return super.getPort(HelloWorldImpl2Port, HelloWorld2.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorld2
     */
    @WebEndpoint(name = "HelloWorldImpl2Port")
    public HelloWorld2 getHelloWorldImpl2Port(WebServiceFeature... features) {
        return super.getPort(HelloWorldImpl2Port, HelloWorld2.class, features);
    }

}

package demo.hw.server;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;

public class test {
	public static void main(String[] args) {
		HelloWorld2_Service service = new HelloWorld2_Service();
		HelloWorld2 helloWorldImpl2Port = service.getHelloWorldImpl2Port();
		Client client = ClientProxy.getClient(helloWorldImpl2Port);
		client.getOutInterceptors().add(new Myinterceptor("xzg", "1234"));
		System.out.println(helloWorldImpl2Port.sayHi("tonne"));
	}
}

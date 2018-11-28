package demo.hw.server;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;

public class test {
	public static void main(String[] args) {
		HelloWorld2_Service service = new HelloWorld2_Service();
		String sayHi = service.getHelloWorldImpl2Port().sayHi("222");
		Client client = ClientProxy.getClient(sayHi);
		boolean add = client.getOutInterceptors().add(new Myinterceptor("xzg", "123"));
		if (add) {
			System.out.println("success!");
		} else {
			System.out.println("filed!");
		}
		System.out.println("tonne");
	}
}

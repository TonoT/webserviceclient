package demo.hw.server;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class Myinterceptor extends AbstractPhaseInterceptor<SoapMessage> {

	private String name;
	private String password;
	public Myinterceptor(String name, String password) {
		//决定什么时间来拦截
		super(Phase.PRE_PROTOCOL);
		this.name = name;
		this.password = password;
	}

	@Override
	public void handleMessage(SoapMessage msg) throws Fault {
		// TODO Auto-generated method stub
		List<Header> headers = msg.getHeaders();
		Document document = DOMUtils.createDocument();
		Element rootEle=document.createElement("user");	
		Element nameEle=document.createElement("name");
		nameEle.setTextContent(name);
		Element passwordEle=document.createElement("password");
		passwordEle.setTextContent(password);
		rootEle.appendChild(nameEle);
		rootEle.appendChild(passwordEle);
		headers.add(new Header(new QName("user"), rootEle));
	}

}

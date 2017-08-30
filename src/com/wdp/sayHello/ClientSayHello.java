package com.wdp.sayHello;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientSayHello {

	public static void main(String[] args) {
		try {
			HelloWorldImplService service = new HelloWorldImplService(new URL("http://localhost:8088/CXFService/sayHello?wsdl"));
			HelloWorld port = service.getHelloWorldImplPort();
			List<String> response = port.sayHello("Íò´óÅô");
			for(int i = 0 ;response.size() > i ;i++){
				System.out.println(response.get(i));
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		
	}

}

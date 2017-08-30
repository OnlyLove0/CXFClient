package com.lw.sayYesTOme;

import java.net.MalformedURLException;
import java.net.URL;

public class ClientSay {

	public static void main(String[] args) {
		try {
			TestImplService TS = new TestImplService(new URL("http://localhost:8088/CXFService/say?wsdl"));
			Test testPort = TS.getTestImplPort();
			String string = testPort.say("ÕÚ¥Û≈Ù", "13");
			System.out.println(string);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}

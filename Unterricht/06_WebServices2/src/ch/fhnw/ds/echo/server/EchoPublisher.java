package ch.fhnw.ds.echo.server;

import javax.xml.ws.Endpoint;

public class EchoPublisher {

	public static void main(String[] args){
		String url = "http://127.0.0.1:9898/echo";
		Endpoint.publish(url, new Echo());
		System.out.println("service published");
		System.out.println("WSDL available at "+url+"?wsdl");
	}

}


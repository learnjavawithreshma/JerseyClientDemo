package demo;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class JaxRsClientDemo {
	
	static String URI = "http://localhost:8080/RestJAXRSJerseyDemo/learnjava/myservice";

	public static void main(String args[]) {
	Client client = ClientBuilder.newClient();
	WebTarget target = client.target(URI);
	Invocation.Builder invocationBuilder = target.request();
	Response response = invocationBuilder.get();
	String responseStr = response.readEntity(String.class);
	System.out.println("Server Response:"+responseStr);
}

}

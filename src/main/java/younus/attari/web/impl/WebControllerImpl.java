package younus.attari.web.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import younus.attari.client.JMSClient;
import younus.attari.web.WebController;

@RestController
public class WebControllerImpl implements WebController{

	@Autowired
	JMSClient jmsClient;
	
	@Override
	public String receive(String message) {
		System.out.println("this is from receive..."+message);
		 jmsClient.receive(message);
		 return "DONE";
	}

	@Override
	public String send() {
		System.out.println("this is from send...");
		jmsClient.send();
		return "Done";
	}

	
}

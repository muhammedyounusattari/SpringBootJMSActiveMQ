package younus.attari.client.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import younus.attari.client.JMSClient;
import younus.attari.consumer.JMSConsumer;
import younus.attari.producer.JMSProducer;

@Service
public class JMSClientImpl implements JMSClient {

	@Autowired
	private JMSConsumer consumer;

	@Autowired
	private JMSProducer producer;

	@Override
	public void send() {
		System.out.println("this is from send of jmsclient");
		consumer.receive();

	}

	@Override
	public String receive(String message) {
		System.out.println("this is from receive of jmsclient");
		return producer.sendMessage(message);
	}

}

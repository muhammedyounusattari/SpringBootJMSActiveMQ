package younus.attari.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JMSProducer {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Value("${jms.queue.destination}")
	String destinationName;
	
	public String sendMessage(String message){
		jmsTemplate.convertAndSend(destinationName, message);
		return "";
	}
}

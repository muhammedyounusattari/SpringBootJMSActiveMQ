package younus.attari.client;



public interface JMSClient {

	public void send();
	
	public String receive(String message);
}

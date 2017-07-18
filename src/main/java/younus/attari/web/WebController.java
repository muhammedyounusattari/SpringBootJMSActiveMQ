package younus.attari.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/home")
public interface WebController {

	@RequestMapping("/receive")
	public String receive(@RequestParam String message);
	
	@RequestMapping("/send")
	public String send();
}

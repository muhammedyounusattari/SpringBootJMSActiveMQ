package younus.attari.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootConfiguration
@ComponentScan("younus.attari")
@EnableAutoConfiguration
public class SpringConfigurationMain {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringConfigurationMain.class, args);
	}

}

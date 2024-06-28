package config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class AppConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppConfigServiceApplication.class, args);
		
		System.err.println("ConfigService is stared....");
	}

}

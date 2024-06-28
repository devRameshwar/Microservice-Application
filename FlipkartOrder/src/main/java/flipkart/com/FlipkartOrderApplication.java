package flipkart.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FlipkartOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlipkartOrderApplication.class, args);

		System.out.println("Flipkart Order Application started....");
	}

}

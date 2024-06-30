package flipkart.com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FlipkartUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlipkartUserServiceApplication.class, args);
		
		Logger logger=LoggerFactory.getLogger(FlipkartUserServiceApplication.class);
		
		logger.info("FlipkartUserServiceApplication is started....");
	}

}

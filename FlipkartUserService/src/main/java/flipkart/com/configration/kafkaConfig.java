package flipkart.com.configration;

import flipkart.com.constant.ApplicationConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.Map;

@Configuration
public class kafkaConfig {

    @Bean
    NewTopic newTopic() {
        return TopicBuilder.name(ApplicationConstant.CREATE_ORDER_TOPICS)
                .partitions(1)
                .replicas(1)
                .configs(Map.of("min.insync.replicas", "1"))
                .build();
    }

}

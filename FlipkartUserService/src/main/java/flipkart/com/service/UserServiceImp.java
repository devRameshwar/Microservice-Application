package flipkart.com.service;

import flipkart.com.constant.ApplicationConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import flipkart.com.orderFeignClient.OrderServiceFeignclient;
import flipkart.com.request.OrderDetailsResquest;
import flipkart.com.request.UserRegistretionRequest;
import flipkart.com.responce.OrderDetailsResponce;
import flipkart.com.responce.UserRegisterResponse;

import java.util.concurrent.CompletableFuture;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private OrderServiceFeignclient orderServiceFeignclient;

	private final Logger LOGGER=LoggerFactory.getLogger(UserServiceImp.class);

	@Autowired
	private KafkaTemplate<String ,ResponseEntity<OrderDetailsResponce>> kafkaTemplate;

	Logger logger = LoggerFactory.getLogger(UserServiceImp.class);

	@Override
	public UserRegisterResponse userRegister(UserRegistretionRequest request) {
		UserRegisterResponse response = UserRegisterResponse.builder().mobileNumber(request.getMobileNumber())
				.userType(request.getUserType()).emailId(request.getEmailId()).userName(request.getUserName()).build();
		return response;
	}

	@Override
	public ResponseEntity<OrderDetailsResponce> createOrder(OrderDetailsResquest request) {

		ResponseEntity<OrderDetailsResponce> createOrder = orderServiceFeignclient.createOrder(request);
		logger.info("response getting from Order Service: " + request);

		CompletableFuture<SendResult<String, ResponseEntity<OrderDetailsResponce>>> future =
				kafkaTemplate.send(ApplicationConstant.CREATE_ORDER_TOPICS,request.getOrderName(), orderServiceFeignclient.createOrder(request));

		CompletableFuture<SendResult<String, ResponseEntity<OrderDetailsResponce>>> completableFuture = future.whenComplete((result, exception) -> {
			if (exception != null) {

			} else {
				LOGGER.info("Result after getting success response: "+result.getRecordMetadata());
			}
		});

		return createOrder;

	}

}

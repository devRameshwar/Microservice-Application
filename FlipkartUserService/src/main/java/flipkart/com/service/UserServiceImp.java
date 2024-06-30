package flipkart.com.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import flipkart.com.orderFeignClient.OrderServiceFeignclient;
import flipkart.com.request.OrderDetailsResquest;
import flipkart.com.request.UserRegistretionRequest;
import flipkart.com.responce.OrderDetailsResponce;
import flipkart.com.responce.UserRegisterResponse;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private OrderServiceFeignclient orderServiceFeignclient;

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
		logger.info("responce getting from Order Servece: " + createOrder);
		return createOrder;

	}

}

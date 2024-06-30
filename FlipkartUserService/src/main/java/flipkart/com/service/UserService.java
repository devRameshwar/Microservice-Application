package flipkart.com.service;

import org.springframework.http.ResponseEntity;

import flipkart.com.request.OrderDetailsResquest;
import flipkart.com.request.UserRegistretionRequest;
import flipkart.com.responce.OrderDetailsResponce;
import flipkart.com.responce.UserRegisterResponse;

public interface UserService {

	UserRegisterResponse userRegister(UserRegistretionRequest request);

	ResponseEntity<OrderDetailsResponce> createOrder(OrderDetailsResquest request);

}

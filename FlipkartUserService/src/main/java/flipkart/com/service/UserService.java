package flipkart.com.service;

import flipkart.com.request.UserRegistretionRequest;
import flipkart.com.responce.UserRegisterResponse;

public interface UserService {

	UserRegisterResponse userRegister(UserRegistretionRequest request);

}

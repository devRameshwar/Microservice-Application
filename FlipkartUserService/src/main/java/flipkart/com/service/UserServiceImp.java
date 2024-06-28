package flipkart.com.service;

import org.springframework.stereotype.Service;

import flipkart.com.request.UserRegistretionRequest;
import flipkart.com.responce.UserRegisterResponse;

@Service
public class UserServiceImp implements UserService {

	@Override
	public UserRegisterResponse userRegister(UserRegistretionRequest request) {
		UserRegisterResponse response = UserRegisterResponse.builder().mobileNumber(request.getMobileNumber())
				.userType(request.getUserType()).emailId(request.getEmailId()).userName(request.getUserName()).build();
		return response;
	}

}

package flipkart.com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import flipkart.com.request.UserRegistretionRequest;
import flipkart.com.responce.UserRegisterResponse;
import flipkart.com.service.UserService;

@Controller
@RequestMapping("/flipkart")
public class UserController {

	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService service;

	@RequestMapping(path = "/user", method = {RequestMethod.GET,RequestMethod.POST} )
	@ResponseBody
	public ResponseEntity<UserRegisterResponse> userRegister(@RequestBody UserRegistretionRequest request) {
		
		logger.info("Request : "+request);

		return new ResponseEntity<>(service.userRegister(request),HttpStatus.ACCEPTED);
	}

}

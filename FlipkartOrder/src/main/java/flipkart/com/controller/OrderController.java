package flipkart.com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import flipkart.com.request.OrderDetailsResquest;
import flipkart.com.responce.OrderDetailsResponce;
import flipkart.com.sercice.OrderService;


@RestController
@RequestMapping(path = "/order")
public class OrderController {

	@Autowired
	private OrderService service;
	
    Logger logger=LoggerFactory.getLogger(OrderController.class);

	@PostMapping(path = "/create")
	public ResponseEntity<OrderDetailsResponce> postMethodName(@RequestBody OrderDetailsResquest  request) {
		logger.info("request Data: "+request);
		return new ResponseEntity<>(this.service.saveOrder(request),HttpStatus.CREATED);
	}


}

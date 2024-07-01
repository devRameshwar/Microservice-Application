package flipkart.com.orderFeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import flipkart.com.request.OrderDetailsResquest;
import flipkart.com.responce.OrderDetailsResponce;

 
@FeignClient(name = "FlipkartOrder")
public interface OrderServiceFeignclient {
	
	@PostMapping(path = "/order/create")
	public ResponseEntity<OrderDetailsResponce> createOrder(@RequestBody OrderDetailsResquest  request); 

}

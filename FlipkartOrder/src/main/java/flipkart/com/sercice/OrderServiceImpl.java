package flipkart.com.sercice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import flipkart.com.request.OrderDetailsResquest;
import flipkart.com.responce.OrderDetailsResponce;

@Service
public class OrderServiceImpl implements OrderService {

	Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

	@Override
	public OrderDetailsResponce saveOrder(OrderDetailsResquest request) {

		OrderDetailsResponce responce = new OrderDetailsResponce();
		responce.setBillingAddress(request.getBillingAddress());
		responce.setOrderDate(request.getOrderDate());
		responce.setOrderName(request.getOrderName());
		responce.setOrderStatus(request.getOrderStatus());
		responce.setPrice(request.getPrice());
		responce.setShippingAddress(request.getShippingAddress());
		responce.setQty(request.getQty());

		logger.info("Responce : " + responce);

		return responce;
	}

}

package flipkart.com.sercice;

import flipkart.com.request.OrderDetailsResquest;
import flipkart.com.responce.OrderDetailsResponce;

public interface OrderService {

	OrderDetailsResponce saveOrder(OrderDetailsResquest request);

}

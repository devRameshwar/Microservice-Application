package flipkart.com.request;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class OrderDetailsResquest implements Serializable {

	private String orderName;

	private String qty;

	private Float price;

	private String orderStatus;

	private String shippingAddress;

	private String billingAddress;

	private Date orderDate;
	



}

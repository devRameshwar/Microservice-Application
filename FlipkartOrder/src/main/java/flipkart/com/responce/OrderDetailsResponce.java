package flipkart.com.responce;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrderDetailsResponce implements Serializable {

	private String orderName;

	private String qty;

	private Float price;

	private String orderStatus;

	private String shippingAddress;

	private String billingAddress;

	private Date orderDate;

}

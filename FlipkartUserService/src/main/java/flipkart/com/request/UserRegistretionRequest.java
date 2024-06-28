package flipkart.com.request;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRegistretionRequest {

	private String userName;
	private String emailId;
	private String mobileNumber;
	private String userType;

}

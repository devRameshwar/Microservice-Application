package flipkart.com.responce;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRegisterResponse {
	
	private String userName;
	private String emailId;
	private String mobileNumber;
	private String userType;

}

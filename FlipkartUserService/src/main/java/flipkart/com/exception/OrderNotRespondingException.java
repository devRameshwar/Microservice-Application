package flipkart.com.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode (callSuper = false)
public class OrderNotRespondingException extends RuntimeException{

    private static final Integer serialNumber=456789_78;
    private String message;
}

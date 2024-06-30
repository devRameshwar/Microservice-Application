package flipkart.com.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobaleExceptionHandlre {

    @ExceptionHandler(OrderNotRespondingException.class)
    public ResponseEntity<String> orderNotRespondingException(OrderNotRespondingException exception){
        return ResponseEntity.ok(exception.getMessage());
    }
}

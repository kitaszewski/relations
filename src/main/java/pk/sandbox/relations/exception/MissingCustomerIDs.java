package pk.sandbox.relations.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class MissingCustomerIDs extends RuntimeException{
    private Long pathValue;
    private Long customerIdValue;

    public MissingCustomerIDs(String message, Long pathValue, Long customerIdValue) {
        super(String.format("%s, ID int URL: %s, ID in Customer object: %s", message, pathValue, customerIdValue));
        this.pathValue = pathValue;
        this.customerIdValue = customerIdValue;
    }

    public Long getPathValue() {
        return pathValue;
    }

    public Long getCustomerIdValue() {
        return customerIdValue;
    }
}

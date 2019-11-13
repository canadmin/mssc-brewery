package can.springframework.msscbrewery.web.controller;

import can.springframework.msscbrewery.web.model.CustomerDto;
import can.springframework.msscbrewery.service.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{customerId}"})
    public ResponseEntity<CustomerDto> getUser(@PathVariable UUID customerId){
        return new ResponseEntity<>(this.customerService.getById(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveCustomer(@Valid @RequestBody CustomerDto customerDto){
        CustomerDto savedCustomer = customerService.saveNewCustomer(customerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location","/api/v1/customer"+savedCustomer.getCustomerId());
        return new ResponseEntity(headers,HttpStatus.CREATED);
    }
    @PutMapping("/{customerId}")
    public ResponseEntity updateCustomer(@PathVariable UUID customerId,@Validated @RequestBody CustomerDto customerDto){
        customerService.updateCustomer(customerId,customerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCustomerById(@PathVariable UUID customerId){
        customerService.deleteById(customerId);
    }


}

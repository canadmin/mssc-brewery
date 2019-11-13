package can.springframework.msscbrewery.service;

import can.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getById(UUID customerId) {
        return  CustomerDto.builder()
                .customerId(UUID.randomUUID())
                .name("Can Yard")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().customerId(UUID.randomUUID())
                .name(customerDto.getName())
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //TODO customer update
    }

    @Override
    public void deleteById(UUID customerId) {
        //todo customer delete
    }
}

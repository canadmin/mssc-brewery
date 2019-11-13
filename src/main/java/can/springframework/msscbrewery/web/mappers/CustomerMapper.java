package can.springframework.msscbrewery.web.mappers;

import can.springframework.msscbrewery.domain.Beer;
import can.springframework.msscbrewery.domain.Customer;
import can.springframework.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDto customerDto);

    CustomerDto customerToCustomerDto(Customer customer);

}

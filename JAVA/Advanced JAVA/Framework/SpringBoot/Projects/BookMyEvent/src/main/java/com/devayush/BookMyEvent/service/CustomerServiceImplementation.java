package com.devayush.BookMyEvent.service;

import com.devayush.BookMyEvent.model.dto.CustomerPasswordDto;
import com.devayush.BookMyEvent.entities.CustomerEntity;
import com.devayush.BookMyEvent.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImplementation implements CustomerService{

    @Autowired
    CustomerRepository customerRepository;
    @Override
    public CustomerEntity registerCustomer(CustomerEntity customer) {
       return customerRepository.save(customer);
    }

    @Override
    public CustomerEntity updateCustomer(CustomerEntity customerEntity) {
        CustomerEntity oldCustomerData = customerRepository.findById(customerEntity.getUserId()).orElse(null);
        oldCustomerData.setUserName(customerEntity.getUserName());
        oldCustomerData.setPassword(customerEntity.getPassword());
        oldCustomerData.setNumber(customerEntity.getNumber());
        oldCustomerData.setEmail(customerEntity.getEmail());
        return customerRepository.save(oldCustomerData);
    }

    @Override
    public String changePassword(CustomerPasswordDto customerPasswordDto) {

            CustomerEntity customerInDatabase = customerRepository.findById(customerPasswordDto.getId()).orElse(null);
            if(customerPasswordDto.getPassword().equals(customerInDatabase.getPassword())){
                //return new ResponseEntity(customerInDatabase.setPassword(customerPasswordDto.getPassword()),(HttpStatus.OK));
                customerInDatabase.setPassword(customerPasswordDto.getPassword());
                customerRepository.save(customerInDatabase);
                return "Password changed";
            }
            else{
                return "Invalid id or password";
            }
    }
}

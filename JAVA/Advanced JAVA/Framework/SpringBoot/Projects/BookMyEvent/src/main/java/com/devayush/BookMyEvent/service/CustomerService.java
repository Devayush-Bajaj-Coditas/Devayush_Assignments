package com.devayush.BookMyEvent.service;

import com.devayush.BookMyEvent.model.dto.CustomerPasswordDto;
import com.devayush.BookMyEvent.entities.CustomerEntity;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    public CustomerEntity registerCustomer(CustomerEntity customer);

    public CustomerEntity updateCustomer(CustomerEntity customerEntity);

    public String changePassword(CustomerPasswordDto customerPasswordDto);
}

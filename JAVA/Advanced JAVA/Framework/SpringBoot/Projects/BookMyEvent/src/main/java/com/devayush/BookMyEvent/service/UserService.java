package com.devayush.BookMyEvent.service;

import com.devayush.BookMyEvent.entities.AdminEntity;
import com.devayush.BookMyEvent.entities.CustomerEntity;
import com.devayush.BookMyEvent.entities.EventOrganizerEntity;
import com.devayush.BookMyEvent.entities.UserEntity;
import com.devayush.BookMyEvent.repository.AdminRepository;
import com.devayush.BookMyEvent.repository.CustomerRepository;
import com.devayush.BookMyEvent.repository.OrganizerRepository;
import com.devayush.BookMyEvent.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    AdminRepository adminRepository;
    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    OrganizerRepository organizerRepository;

    public ResponseEntity findUserByRole(UserEntity user) {

        if (user.getRole().equalsIgnoreCase("admin")) {
            AdminEntity adminEntity = adminRepository.findByAdminEmail(user.getEmail()).orElse(null);
            return new ResponseEntity(adminEntity, HttpStatus.OK);
        } else if (user.getRole().equalsIgnoreCase("customer")) {
            CustomerEntity customerEntity = customerRepository.findByEmail(user.getEmail());
            return new ResponseEntity(customerEntity, HttpStatus.OK);
        }
        else if(user.getRole().equalsIgnoreCase("Organizer")){
            EventOrganizerEntity organizerEntity = organizerRepository.findById(user.getUserId()).orElse(null);
            return new ResponseEntity(organizerEntity,HttpStatus.OK);
        }
        else
            System.out.println("sorry");
            return new ResponseEntity(HttpStatus.NOT_FOUND);
    }


    //public ResponseEntity registerUser()
}


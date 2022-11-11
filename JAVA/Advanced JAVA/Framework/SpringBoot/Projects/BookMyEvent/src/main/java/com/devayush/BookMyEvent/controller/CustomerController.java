package com.devayush.BookMyEvent.controller;

import com.devayush.BookMyEvent.entities.BookingEntity;
import com.devayush.BookMyEvent.entities.CustomerEntity;
import com.devayush.BookMyEvent.entities.EventEntity;
import com.devayush.BookMyEvent.model.dto.CustomerPasswordDto;
import com.devayush.BookMyEvent.model.dto.FeedbackDto;
import com.devayush.BookMyEvent.service.BookingService;
import com.devayush.BookMyEvent.service.CustomerService;
import com.devayush.BookMyEvent.service.EventService;
import com.devayush.BookMyEvent.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    EventService eventService;
    @Autowired
    BookingService bookingService;

    @Autowired
    FeedbackService feedbackService;

    @Autowired
    CustomerService customerService;


    @PostMapping("/register")
    public ResponseEntity registerCustomer (CustomerEntity customer){
        try {
            return new ResponseEntity(Optional.of(customerService.registerCustomer(customer)), HttpStatus.CREATED);
        }catch (Exception exception){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/filetByPrice/{price}")
    public List<EventEntity> filterByPrice(@PathVariable float price){
        List<EventEntity>filteredEvents = eventService.filterByPrice(price);
        return filteredEvents;
    }

    @GetMapping("/filterByRating/{rating}")
    public  List<EventEntity> filterByRating(@PathVariable float rating){
        List<EventEntity> filteredEvents = eventService.filterByRating(rating);
         return filteredEvents;
    }

    //Book event
    @PostMapping("/createBooking")
    public ResponseEntity createBooking (@RequestBody BookingEntity booking){
        try{
            return new ResponseEntity(Optional.of(bookingService.createBooking(booking)),(HttpStatus.CREATED));
        }catch (Exception exception){
            exception.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //cancel booking
    @PutMapping("/cancelBooking/{id}")
    public ResponseEntity cancelBooking (@PathVariable int id){
        try {
            return new ResponseEntity(Optional.of(bookingService.cancelBooking(id)), (HttpStatus.OK));
        }catch(Exception exception){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

    //taking feedback
    @PostMapping("/giveFeedback")
    public ResponseEntity giveFeedback(@RequestBody FeedbackDto feedbackDto){
       return feedbackService.createFeedback(feedbackDto);
    }


    //change the password
    @PostMapping("/changePassword")
    public ResponseEntity changePassword(@RequestBody CustomerPasswordDto customerPasswordDto){
        return new ResponseEntity(Optional.of(customerService.changePassword(customerPasswordDto)),HttpStatus.OK);
    }


    //update profile
    @PutMapping("/updateProfile")
    public ResponseEntity updateProfile(@RequestBody CustomerEntity customerEntity){
        try{
            return new ResponseEntity(Optional.of(customerService.updateCustomer(customerEntity)),(HttpStatus.OK));
        }catch (Exception exception){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

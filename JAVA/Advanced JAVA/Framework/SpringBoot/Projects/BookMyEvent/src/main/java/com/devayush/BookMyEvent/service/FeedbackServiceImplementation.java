package com.devayush.BookMyEvent.service;

import com.devayush.BookMyEvent.entities.CustomerEntity;
import com.devayush.BookMyEvent.entities.FeedbackEntity;
import com.devayush.BookMyEvent.model.dto.FeedbackDto;
import com.devayush.BookMyEvent.repository.CustomerRepository;
import com.devayush.BookMyEvent.repository.EventRepository;
import com.devayush.BookMyEvent.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class FeedbackServiceImplementation implements FeedbackService{

    @Autowired
    FeedbackEntity feedbackEntity;

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    EventRepository eventRepository;

    @Autowired
    FeedbackRepository feedbackRepository;


    @Override
    public ResponseEntity createFeedback(FeedbackDto feedbackDto) {
        CustomerEntity customerEntity=customerRepository.findById(feedbackDto.getCustomerId()).get();
        feedbackEntity.setFeedbackComment(feedbackDto.getFeedbackComment());
        feedbackEntity.setRating(feedbackDto.getRatings());
        feedbackEntity.setUser(customerRepository.findById(feedbackDto.getCustomerId()).orElse(null));
        feedbackEntity.setEvent(eventRepository.findById(feedbackDto.getCustomerId()).orElse(null));
        customerEntity.getFeedback().add(feedbackEntity);
        try{
            return new ResponseEntity(Optional.of(customerRepository.save(customerEntity)), HttpStatus.OK);
        }catch(Exception exception){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

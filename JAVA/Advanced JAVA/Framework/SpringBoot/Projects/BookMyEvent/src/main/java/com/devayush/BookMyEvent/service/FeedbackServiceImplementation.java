package com.devayush.BookMyEvent.service;

import com.devayush.BookMyEvent.entities.CustomerEntity;
import com.devayush.BookMyEvent.entities.EventEntity;
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
    CustomerRepository customerRepository;

    @Autowired
    EventRepository eventRepository;

    @Autowired
    FeedbackRepository feedbackRepository;


    @Override
    public ResponseEntity createFeedback(FeedbackDto feedbackDto) {
        FeedbackEntity feedbackEntity = new FeedbackEntity();

        feedbackEntity.setFeedbackComment(feedbackDto.getFeedbackComment());
        feedbackEntity.setRating(feedbackDto.getRatings());

        CustomerEntity customerEntity=customerRepository.findById(feedbackDto.getCustomerId()).orElse(null);
        feedbackEntity.setUser(customerEntity);

        EventEntity event = eventRepository.findById(feedbackDto.getCustomerId()).orElse(null);
        feedbackEntity.setEvent(event);

        try{
            return new ResponseEntity(Optional.of(feedbackRepository.save(feedbackEntity)), HttpStatus.CREATED);
        }catch(Exception exception){
            exception.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

package com.devayush.BookMyEvent.service;

import com.devayush.BookMyEvent.model.dto.FeedbackDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface FeedbackService {
    public ResponseEntity createFeedback(FeedbackDto feedbackDto);
}

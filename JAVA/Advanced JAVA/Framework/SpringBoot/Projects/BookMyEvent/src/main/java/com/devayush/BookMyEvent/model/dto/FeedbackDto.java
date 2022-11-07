package com.devayush.BookMyEvent.model.dto;

import lombok.Data;
@Data
public class FeedbackDto {
    int customerId;
    float ratings;
    String feedbackComment;
    int eventId;


}

package com.devayush.practiceWithADZY.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorModel {
    String message;
    String status;
}

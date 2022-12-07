package com.devayush.ExceptionHandlingDEMO.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorDetails {
    String msg;
    String status;
}

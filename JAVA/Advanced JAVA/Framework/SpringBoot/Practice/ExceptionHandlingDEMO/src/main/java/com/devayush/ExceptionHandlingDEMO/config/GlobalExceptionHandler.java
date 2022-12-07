package com.devayush.ExceptionHandlingDEMO.config;


import com.devayush.ExceptionHandlingDEMO.exception.NewException;
import com.devayush.ExceptionHandlingDEMO.model.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice  //catches exceptions and handle in this file
@ResponseBody //to send object of response entity
public class GlobalExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ErrorDetails> handle (NullPointerException nullPointerException){
        return new ResponseEntity<ErrorDetails> (new ErrorDetails(nullPointerException.getMessage() ,"Failed"),HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NewException.class)
    public ResponseEntity<ErrorDetails> handleCustomException (NewException newException){
        return new ResponseEntity<ErrorDetails> (new ErrorDetails(newException.getMessage() ,"Failed by Custom exception"),HttpStatus.BAD_REQUEST);
    }

}

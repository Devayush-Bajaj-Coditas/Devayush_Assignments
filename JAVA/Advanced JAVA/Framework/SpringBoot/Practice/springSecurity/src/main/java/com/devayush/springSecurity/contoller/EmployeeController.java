package com.devayush.springSecurity.contoller;


import com.devayush.springSecurity.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public ResponseEntity getAllEmployees()
    {
        return new ResponseEntity(employeeService.getAllEntities(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity getEmployeeById (int id){
        try {
            return new ResponseEntity(Optional.of(employeeService.getEmployeeById(id)).orElse(null),HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity("Something went wrong", HttpStatus.BAD_REQUEST);
        }
    }



}

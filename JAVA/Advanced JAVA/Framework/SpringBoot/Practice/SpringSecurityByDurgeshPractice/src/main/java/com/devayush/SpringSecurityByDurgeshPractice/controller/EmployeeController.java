package com.devayush.SpringSecurityByDurgeshPractice.controller;

import com.devayush.SpringSecurityByDurgeshPractice.entity.EmployeeEntity;
import com.devayush.SpringSecurityByDurgeshPractice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;


//    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/add")
    public ResponseEntity addEmployee(@RequestBody EmployeeEntity employee){
        return new ResponseEntity(employeeService.addEmployee(employee),HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity getAllEmployees()
    {
        return new ResponseEntity(employeeService.getAllEntities(),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity getEmployeeById (@PathVariable("id") int id){
        try {
            return new ResponseEntity(Optional.of(employeeService.getEmployeeById(id)).orElse(null),HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity("Something went wrong", HttpStatus.BAD_REQUEST);
        }
    }



}

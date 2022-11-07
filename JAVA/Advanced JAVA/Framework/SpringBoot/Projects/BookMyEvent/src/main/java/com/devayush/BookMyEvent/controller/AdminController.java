package com.devayush.BookMyEvent.controller;

import com.devayush.BookMyEvent.entities.EventCategoryEntity;
import com.devayush.BookMyEvent.entities.EventEntity;
import com.devayush.BookMyEvent.entities.EventOrganizerEntity;
import com.devayush.BookMyEvent.repository.EventCategoryRepository;
import com.devayush.BookMyEvent.repository.OrganizerRepository;
import com.devayush.BookMyEvent.service.AdminServicesImplementation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdminServicesImplementation adminServices;
    //add event
    @Autowired
    OrganizerRepository organizerRepository;

    @PostMapping(value = "/addCategory")
    public ResponseEntity<EventEntity> addCategory(@RequestBody EventCategoryEntity eventCategoryEntity){
        try {
            return new ResponseEntity(Optional.of(adminServices.addEventCategory(eventCategoryEntity)), (HttpStatus.CREATED));
        }catch (Exception exception) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/getAllCategories")
    public List<EventCategoryEntity> getAllCategories (){
        return adminServices.getALlEventCategories();
    }


    @PutMapping(value = "/updateCategory")
    public ResponseEntity updateCategory(@RequestBody EventCategoryEntity eventCategoryEntity){
        try{
            return new ResponseEntity(Optional.of(adminServices.updateEventCategory(eventCategoryEntity)),HttpStatus.CREATED);
        }catch(Exception exception){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/deleteCategory/{id}")
    public ResponseEntity deleteCategory(@PathVariable int id){
        try {
            adminServices.deleteEventCategory(id);
            return new ResponseEntity(HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(name = "/organizers")
    public List<EventOrganizerEntity> getAllOrganizers(){
        return organizerRepository.findAll();
    }

}

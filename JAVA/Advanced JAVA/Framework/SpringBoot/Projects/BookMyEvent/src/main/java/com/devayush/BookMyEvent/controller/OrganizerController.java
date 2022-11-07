package com.devayush.BookMyEvent.controller;

import com.devayush.BookMyEvent.entities.EventEntity;
import com.devayush.BookMyEvent.entities.EventOrganizerEntity;
import com.devayush.BookMyEvent.repository.OrganizerRepository;
import com.devayush.BookMyEvent.service.BookingService;
import com.devayush.BookMyEvent.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/organizer")
public class OrganizerController {
    @Autowired
    OrganizerRepository organizerRepository;
    @Autowired
    EventService eventService;

    @Autowired
    BookingService bookingService;

    @PostMapping("/register")
    public EventOrganizerEntity registerOrganizer(@RequestBody EventOrganizerEntity organizerEntity){
        return organizerRepository.save(organizerEntity);
    }

    @PostMapping("/addEvent")
    public ResponseEntity addEvent(@RequestBody  EventEntity eventEntity){
        try {
            return new ResponseEntity(Optional.of(eventService.createEvent(eventEntity)), (HttpStatus.CREATED));
        }catch (Exception exception){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(name = "/deleteEvent/{eventId}")
    public ResponseEntity deleteEvent (@PathVariable int eventId){
        try{
           eventService.deleteEvent(eventId);
           return new ResponseEntity(HttpStatus.OK);
        }catch(Exception exception){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping(name = "/updateEvent")
    public ResponseEntity updateEvent (@RequestBody EventEntity event){
        try{
            return new ResponseEntity(Optional.of(eventService.updateEvent(event)),(HttpStatus.OK));
        }catch(Exception exception){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(name = "/viewAllEvents")
    public ResponseEntity ViewAllEvents(){
        return new ResponseEntity(Optional.of(eventService.getAllEvents()),(HttpStatus.OK));
    }



    @GetMapping("/getEventByI/{eventId}")
    public ResponseEntity getEventByI(@PathVariable int eventId){
        try{
            return new ResponseEntity(Optional.of(eventService.getEventById(eventId)),(HttpStatus.OK));
        }catch (Exception exception){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }


    //confirm booking
    @GetMapping("/status/{id}/{status}")
    public ResponseEntity updateStatus(@PathVariable int id, @PathVariable String status){
        try{
            return new ResponseEntity(Optional.of(bookingService.bookingStatus(id,status)),(HttpStatus.OK));
        }catch(Exception exception){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}

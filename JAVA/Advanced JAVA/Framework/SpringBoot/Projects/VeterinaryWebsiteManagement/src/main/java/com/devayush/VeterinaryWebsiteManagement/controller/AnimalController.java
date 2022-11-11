package com.devayush.VeterinaryWebsiteManagement.controller;

import com.devayush.VeterinaryWebsiteManagement.entiry.AnimalEntity;
import com.devayush.VeterinaryWebsiteManagement.model.dto.AppointmentDto;
import com.devayush.VeterinaryWebsiteManagement.service.AnimalService;
import com.devayush.VeterinaryWebsiteManagement.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animal")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @Autowired
    AppointmentService appointmentService;

    @PostMapping("/register")
    public ResponseEntity registerAnimal (@RequestBody AnimalEntity animal){
        return animalService.registerAnimal(animal);
    }


    @PostMapping("/book")
    public ResponseEntity bookAppointment (@RequestBody AppointmentDto appointmentDto){
    return appointmentService.createAppointment(appointmentDto);
    }

}

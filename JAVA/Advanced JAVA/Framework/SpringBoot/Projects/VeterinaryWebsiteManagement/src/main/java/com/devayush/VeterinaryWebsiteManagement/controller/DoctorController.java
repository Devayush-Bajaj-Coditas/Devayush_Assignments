package com.devayush.VeterinaryWebsiteManagement.controller;

import com.devayush.VeterinaryWebsiteManagement.entiry.DoctorEntity;
import com.devayush.VeterinaryWebsiteManagement.service.AnimalService;
import com.devayush.VeterinaryWebsiteManagement.service.AppointmentService;
import com.devayush.VeterinaryWebsiteManagement.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @Autowired
    AnimalService animalService;

    @Autowired
    AppointmentService appointmentService;

    @PostMapping("/register")
    public ResponseEntity registerDoctor(@RequestBody DoctorEntity doctor){
        return doctorService.registerDoctor(doctor);
    }


    @GetMapping("/getAllPatients/{id}")
    public ResponseEntity getAllPatients (@PathVariable long id){
        return appointmentService.findAllPatients(id);
    }

}

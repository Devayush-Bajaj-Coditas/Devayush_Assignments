package com.devayush.VeterinaryWebsiteManagement.controller;

import com.devayush.VeterinaryWebsiteManagement.entiry.DoctorEntity;
import com.devayush.VeterinaryWebsiteManagement.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.Doc;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @PostMapping("/register")
    public ResponseEntity registerDoctor(@RequestBody DoctorEntity doctor){
        return doctorService.registerDoctor(doctor);
    }



}

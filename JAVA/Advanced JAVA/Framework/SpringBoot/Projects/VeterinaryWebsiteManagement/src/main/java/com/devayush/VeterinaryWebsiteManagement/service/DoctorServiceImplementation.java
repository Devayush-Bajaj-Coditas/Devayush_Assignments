package com.devayush.VeterinaryWebsiteManagement.service;

import com.devayush.VeterinaryWebsiteManagement.entiry.DoctorEntity;
import com.devayush.VeterinaryWebsiteManagement.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DoctorServiceImplementation implements DoctorService{
    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public ResponseEntity registerDoctor(DoctorEntity doctor) {
        try {
            return new ResponseEntity(Optional.of(doctorRepository.save(doctor)), HttpStatus.CREATED);
        }catch (Exception exception) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}

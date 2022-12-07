package com.devayush.VeterinaryWebsiteManagement.service;

import com.devayush.VeterinaryWebsiteManagement.entiry.AnimalEntity;
import org.springframework.http.ResponseEntity;

public interface AnimalService {
    public ResponseEntity registerAnimal(AnimalEntity animal);

    public ResponseEntity getAllPatientsByDoctorID(int id);

}

package com.devayush.VeterinaryWebsiteManagement.service;

import com.devayush.VeterinaryWebsiteManagement.entiry.DoctorEntity;
import org.springframework.http.ResponseEntity;

public interface DoctorService {
    public ResponseEntity registerDoctor(DoctorEntity doctor);


}

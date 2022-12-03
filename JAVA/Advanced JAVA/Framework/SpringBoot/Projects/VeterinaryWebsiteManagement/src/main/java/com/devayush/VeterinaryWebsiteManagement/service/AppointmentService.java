package com.devayush.VeterinaryWebsiteManagement.service;

import com.devayush.VeterinaryWebsiteManagement.entiry.AppointmentEntity;
import com.devayush.VeterinaryWebsiteManagement.entiry.DoctorEntity;
import com.devayush.VeterinaryWebsiteManagement.model.dto.AppointmentDto;
import org.springframework.http.ResponseEntity;

public interface AppointmentService {
    public ResponseEntity createAppointment(AppointmentDto appointmentDto);

    public ResponseEntity findAllPatients(long id);


}

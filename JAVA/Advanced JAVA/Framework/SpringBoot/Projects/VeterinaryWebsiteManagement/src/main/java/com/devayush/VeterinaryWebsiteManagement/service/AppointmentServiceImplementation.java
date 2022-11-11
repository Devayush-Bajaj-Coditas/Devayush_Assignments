package com.devayush.VeterinaryWebsiteManagement.service;

import com.devayush.VeterinaryWebsiteManagement.entiry.AppointmentEntity;
import com.devayush.VeterinaryWebsiteManagement.entiry.DoctorEntity;
import com.devayush.VeterinaryWebsiteManagement.model.dto.AppointmentDto;
import com.devayush.VeterinaryWebsiteManagement.repository.AnimalRepository;
import com.devayush.VeterinaryWebsiteManagement.repository.AppointmentRepository;
import com.devayush.VeterinaryWebsiteManagement.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class AppointmentServiceImplementation implements AppointmentService {

    @Autowired
    AppointmentRepository appointmentRepository;

    @Autowired
    AnimalRepository animalRepository;
    @Autowired
    AppointmentEntity appointmentEntity;

    @Autowired
    DoctorRepository doctorRepository;

    @Override
    public ResponseEntity createAppointment(AppointmentDto appointmentDto) {

        DoctorEntity doctor = doctorRepository.getById(appointmentDto.getDoctorId());
        if (appointmentDto.getAppointmentTime().after(doctor.getAvailableFrom()) && appointmentDto.getAppointmentTime().before(doctor.getAvailableUpto())) {
            try {
                appointmentEntity.setAnimalEntity(animalRepository.getById(appointmentDto.getAnimalId()));
                appointmentEntity.setDoctorEntity(doctorRepository.getById(appointmentDto.getDoctorId()));
                appointmentEntity.setBookingDate(appointmentDto.getAppointmentDate());
                appointmentEntity.setBookingTime(appointmentDto.getAppointmentTime());
                appointmentEntity.setProblem(appointmentEntity.getProblem());
                return new ResponseEntity(Optional.of(appointmentRepository.save(appointmentEntity)), HttpStatus.CREATED);
            } catch (Exception exception) {
                return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);

            }
        } else {
            return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}

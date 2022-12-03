package com.devayush.VeterinaryWebsiteManagement.repository;

import com.devayush.VeterinaryWebsiteManagement.entiry.AppointmentEntity;
import com.devayush.VeterinaryWebsiteManagement.entiry.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity , Long> {
    @Query("select a from AppointmentEntity a where a.doctorEntity = ?1")
    List<AppointmentEntity> getPatients(DoctorEntity doctorEntity);


}

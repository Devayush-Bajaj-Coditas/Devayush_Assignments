package com.devayush.VeterinaryWebsiteManagement.repository;

import com.devayush.VeterinaryWebsiteManagement.entiry.AppointmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity , Float> {
}

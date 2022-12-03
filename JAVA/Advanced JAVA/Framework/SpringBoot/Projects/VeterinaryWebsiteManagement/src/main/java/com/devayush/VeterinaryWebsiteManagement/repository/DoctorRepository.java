package com.devayush.VeterinaryWebsiteManagement.repository;

import com.devayush.VeterinaryWebsiteManagement.entiry.AnimalEntity;
import com.devayush.VeterinaryWebsiteManagement.entiry.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DoctorRepository extends JpaRepository<DoctorEntity ,Long> {




}


package com.devayush.VeterinaryWebsiteManagement.repository;

import com.devayush.VeterinaryWebsiteManagement.entiry.AnimalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<AnimalEntity , Long> {
}

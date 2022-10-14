package com.coditas.ZooRestApi.repository;

import com.coditas.ZooRestApi.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal ,Integer> {
    List<Animal> findByspeciesName(String speciesName);
}

package com.devayush.VeterinaryWebsiteManagement.service;

import com.devayush.VeterinaryWebsiteManagement.entiry.AnimalEntity;
import com.devayush.VeterinaryWebsiteManagement.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AnimalServiceImplementation implements AnimalService{

    @Autowired
    AnimalRepository animalRepository;


    @Override
    public ResponseEntity registerAnimal(AnimalEntity animal) {
        try {
            return new ResponseEntity(Optional.of(animalRepository.save(animal)), HttpStatus.CREATED);
        }catch (Exception exception){
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
   }
}

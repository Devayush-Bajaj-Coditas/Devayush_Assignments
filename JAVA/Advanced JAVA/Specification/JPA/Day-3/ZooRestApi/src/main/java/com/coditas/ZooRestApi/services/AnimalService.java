package com.coditas.ZooRestApi.services;


import com.coditas.ZooRestApi.model.Animal;
import com.coditas.ZooRestApi.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {
    @Autowired
    public AnimalRepository repository ;
    public Animal saveAnimal(Animal animal){
        return repository.save(animal);     //returns object of animal if inserted successfully
    }

    public List<Animal> saveAnimals (List <Animal> animals){
        return repository.saveAll(animals);
    }

    public  List<Animal>  getAnimals(){
        return repository.findAll();
    }

    public Animal getAnimalById(int id){
        return repository.findById(id).orElse(null);
    }

    public List<Animal> getAnimalBySpecies(String species){
        return repository.findByspeciesName(species);
    }

    public String deleteAnimal (int id){
        repository.deleteById(id);
        return "Animal Removed" + id;
    }

    public Animal updateAnimal(Animal animal){
         Animal existingAnimal = repository.findById(animal.getAnimalId()).orElse(null);        //Fetching existing product from db
         existingAnimal.setAnimalType(animal.getAnimalType());  //setting that existing animal with the new updated animal object
         existingAnimal.setSpeciesName(animal.getSpeciesName());
         return repository.save(existingAnimal);        //Replaced old animal object with new one
    }




}

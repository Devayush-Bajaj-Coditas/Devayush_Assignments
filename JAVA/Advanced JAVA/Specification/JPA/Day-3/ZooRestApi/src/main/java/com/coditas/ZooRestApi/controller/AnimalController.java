package com.coditas.ZooRestApi.controller;

import com.coditas.ZooRestApi.model.Animal;
import com.coditas.ZooRestApi.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimalController {
    @Autowired
    private AnimalService animalService;

    @PostMapping("/addAnimal")
    public Animal addAnimal(@RequestBody Animal animal){
        return animalService.saveAnimal(animal);
    }


    @PostMapping("/addAnimals")
    public List<Animal> addAnimals (@RequestBody List<Animal>animal){
        return animalService.saveAnimals(animal);
    }


    @GetMapping("/animals")
    public List<Animal> findAllAnimals(){
        return animalService.getAnimals();
    }

    @GetMapping("/animals/{id}")
    public Animal findAnimalById(int id){
        return animalService.getAnimalById(id);
    }

    @GetMapping("/animals/{species}")
    public List<Animal> findAnimalBySpecies(String species){
        return animalService.getAnimalBySpecies(species);
    }

    @DeleteMapping("/animals/delete/{id}")
    public String deleteAnimal (int id){
        return animalService.deleteAnimal(id);
    }

    @PutMapping("/update")
    public Animal updateAnimal (Animal animal){
        return animalService.updateAnimal(animal);
    }

}


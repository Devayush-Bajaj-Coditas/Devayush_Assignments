package com.coditas.ZooRestApi.model;

import org.hibernate.annotations.GeneratorType;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;

import javax.naming.Name;
import javax.persistence.*;

@Entity
@Table(name = "AnimalRest")
public class Animal {
    @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int animalId;
    private String animalType;
    private String speciesName;

    public Animal(int animalId, String animalType, String speciesName) {
        this.animalId = animalId;
        this.animalType = animalType;
        this.speciesName = speciesName;
    }

    public Animal() {
    }


    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }
}

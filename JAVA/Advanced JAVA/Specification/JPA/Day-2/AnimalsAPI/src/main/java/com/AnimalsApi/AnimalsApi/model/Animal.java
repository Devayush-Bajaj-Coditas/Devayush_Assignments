package com.AnimalsApi.AnimalsApi.model;

import javax.persistence.*;

@Entity
public class Animal {
    int animalAge;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int animalId;
    String animalType;
    String species;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "AnimalAndZoo")
    Zoo zooAssociated;

    public Animal(int animalAge, int animalId, String animalType, String species) {
        this.animalAge = animalAge;
        this.animalId = animalId;
        this.animalType = animalType;
        this.species = species;
    }

    public Animal(int animalAge, int animalId, String animalType, String species, Zoo zooAssociated) {
        this.animalAge = animalAge;
        this.animalId = animalId;
        this.animalType = animalType;
        this.species = species;
        this.zooAssociated = zooAssociated;
    }

    public Animal() {
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Zoo getZooAssociated() {
        return zooAssociated;
    }

    public void setZooAssociated(Zoo zooAssociated) {
        this.zooAssociated = zooAssociated;
    }
}




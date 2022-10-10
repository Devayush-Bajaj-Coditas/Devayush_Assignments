package com.Devayush.ZooAPI.model;

import javax.persistence.*;

@Entity
public class Animal {

    int animalAge;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int animalId;
    String animalType;
    String species;
    @ManyToOne()
    @JoinColumn(name = "Zoo_Id")
    Zoo zooAssociated;

    public Animal() {
    }

    public Animal(int animalAge, int animalId, String animalType, String species, Zoo zooAssociated) {
        this.animalAge = animalAge;
        this.animalId = animalId;
        this.animalType = animalType;
        this.species = species;
        this.zooAssociated = zooAssociated;
    }

    public Animal(int animalId, int animalAge, String animalType, String speciesName) {
        this.animalId = animalId;
        this.animalAge = animalAge;
        this.animalType = animalType;
        this.species = speciesName;


    }
    public Animal(int animalAge, String animalType, String speciesName) {
        this.animalAge = animalAge;
        this.animalType = animalType;
        this.species = speciesName;
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

    @Override
    public String toString() {
        return "Animal{" +
                "animalAge=" + animalAge +
                ", animalId=" + animalId +
                ", animalType='" + animalType + '\'' +
                ", species='" + species + '\'' +
                ", zooAssociated=" + zooAssociated +
                '}';
    }
}

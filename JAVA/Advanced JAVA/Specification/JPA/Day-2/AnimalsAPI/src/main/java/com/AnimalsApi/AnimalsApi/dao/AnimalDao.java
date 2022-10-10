package com.AnimalsApi.AnimalsApi.dao;

import com.AnimalsApi.AnimalsApi.model.Animal;

public interface AnimalDao {
    void saveAnimal(Animal animal);
    void updateAnimal(Animal animal);
    void deleteAnimal(int id);
    Animal getAnimal(int id);
}

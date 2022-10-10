package com.Devayush.AnimalZooApi.dao;

import com.Devayush.AnimalZooApi.model.Animal;

public interface AnimalDao {
    public void insertAnimal(Animal animal);
    public void getAnimal(int id);
    public void updateAnimal(Animal animal);
    public void deleteAnimal(int id);

}

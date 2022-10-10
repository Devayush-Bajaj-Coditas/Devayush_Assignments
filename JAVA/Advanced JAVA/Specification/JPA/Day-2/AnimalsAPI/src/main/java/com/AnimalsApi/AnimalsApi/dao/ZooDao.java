package com.AnimalsApi.AnimalsApi.dao;

import com.AnimalsApi.AnimalsApi.model.Animal;
import com.AnimalsApi.AnimalsApi.model.Zoo;

public interface ZooDao {
    void saveZoo(Zoo zoo);
    void updateZoo(Zoo zoo);
    void deleteZoo(int id);
    Animal getZoo(int id);
}

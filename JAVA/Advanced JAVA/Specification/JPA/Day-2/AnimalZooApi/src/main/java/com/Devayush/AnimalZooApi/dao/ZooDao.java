package com.Devayush.AnimalZooApi.dao;

import com.Devayush.AnimalZooApi.model.Zoo;

public interface ZooDao {
    public void addZoo(Zoo zoo);
    public void getZoo(int id);
    public void updateZoo(Zoo zoo);
    public void deleteZoo(int id);
}

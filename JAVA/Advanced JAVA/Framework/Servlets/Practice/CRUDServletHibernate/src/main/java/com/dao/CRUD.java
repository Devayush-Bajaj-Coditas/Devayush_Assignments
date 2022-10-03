package com.dao;

public interface CRUD {
    public void create(Object model);
    public void readByID(int id);
    public void update();
    public void delete();

}

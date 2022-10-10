package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User2 {
    @Id
    int id;
    String name;


    public User2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public User2() {
    }
}

package com.AnimalsApi.AnimalsApi.model;

import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.util.List;
@Entity
public class Zoo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int zooId;
    String zooName;
    @OneToMany(mappedBy = "zooAssociated", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
            CascadeType.REFRESH })
    List <Animal> animalsPresent;


    public Zoo(int zooId, String zooName, List<Animal> animalsPresent) {
        this.zooId = zooId;
        this.zooName = zooName;
        this.animalsPresent = animalsPresent;
    }


    public Zoo() {
    }

    public int getZooId() {
        return zooId;
    }

    public void setZooId(int zooId) {
        this.zooId = zooId;
    }

    public String getZooName() {
        return zooName;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
    }

    public List<Animal> getAnimalsPresent() {
        return animalsPresent;
    }

    public void setAnimalsPresent(List<Animal> animalsPresent) {
        this.animalsPresent = animalsPresent;
    }
}

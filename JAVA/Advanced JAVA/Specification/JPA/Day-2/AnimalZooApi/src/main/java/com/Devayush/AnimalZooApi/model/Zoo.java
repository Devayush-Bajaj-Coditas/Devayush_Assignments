package com.Devayush.AnimalZooApi.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Zoo{
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int zooId;
        private String zooName;
        @OneToMany(mappedBy = "zooAssociated", cascade =CascadeType.ALL)
        private List<Animal> animalsPresent;

    public Zoo(String zooName, List<Animal> animalsPresent) {
        this.zooName = zooName;
        this.animalsPresent = animalsPresent;
    }

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

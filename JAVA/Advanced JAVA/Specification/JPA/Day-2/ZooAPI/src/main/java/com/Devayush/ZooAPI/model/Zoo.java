package com.Devayush.ZooAPI.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Zoo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int zooId;
    private String zooName;
    @OneToMany(mappedBy = "zooAssociated", cascade =CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Animal> animalsPresent;

    public Zoo() {
    }

    public Zoo(int zooId, String zooName, List<Animal> animalsPresent) {
        this.zooId = zooId;
        this.zooName = zooName;
        this.animalsPresent = animalsPresent;
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

    @Override
    public String toString() {
        return "Zoo{" +
                "zooId=" + zooId +
                ", zooName='" + zooName + '\'' +
                ", animalsPresent=" + animalsPresent +
                '}';
    }
}

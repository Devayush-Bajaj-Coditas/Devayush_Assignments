package com.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue( value = "Subject")
public class Marks extends Student{

    private int physics;
    private int chem;
    private int maths;

    public int getPhysics() {
        return physics;
    }

    public int getChem() {
        return chem;
    }

    public int getMaths() {
        return maths;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public void setChem(int chem) {
        this.chem = chem;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }
}

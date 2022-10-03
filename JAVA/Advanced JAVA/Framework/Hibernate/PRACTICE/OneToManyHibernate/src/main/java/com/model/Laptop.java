package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "StudentLaptop_ManyToOne")
public class Laptop {
    @Id
    int laptopId;

    String laptopName;

    @ManyToOne
    Student student;

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Laptop(int laptopId, String laptopName) {
        this.laptopId = laptopId;
        this.laptopName = laptopName;
    }

}

package com.practice.HibernateCRUD.model;

import javax.persistence.*;

@Entity
@Table(name = "Laptop_List")
public class Laptop {
    @Id
    private int laptopId;
    private String laptopName;
/*    @ManyToOne
    Student student;*/


    public Laptop(int laptopId, String laptopName  ) {
        this.laptopId = laptopId;
        this.laptopName = laptopName;
    }

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

/*    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }*/


}

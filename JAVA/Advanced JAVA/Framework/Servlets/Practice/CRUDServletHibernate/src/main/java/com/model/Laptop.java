package com.model;

import javax.persistence.*;

@Table(name = "Student_Laptops")
@Entity
public class Laptop {
    @Column(name = "Laptop_id")
    @Id
    int id;
    @Column(name = "Laptop name")
    String name;

    @ManyToOne
    Student student;

    public Laptop(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Laptop(int id, String name, Student student) {
        this.id = id;
        this.name = name;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}

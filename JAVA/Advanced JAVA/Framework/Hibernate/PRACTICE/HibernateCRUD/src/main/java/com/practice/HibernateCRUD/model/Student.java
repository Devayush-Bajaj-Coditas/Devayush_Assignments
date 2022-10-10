package com.practice.HibernateCRUD.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "Student_Details")
public class Student {
    @Id
    //@GeneratedValue (strategy = GenerationType.IDENTITY)
    private int rollNumber;
    private String Name;

   // @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    @OneToMany
    List<Laptop> laptops;


    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", Name='" + Name + '\'' +
                ", laptops=" + laptops +
                '}';
    }

    public Student() {
    }

    public Student(int rollNumber, String name, List<Laptop> laptops) {
        this.rollNumber = rollNumber;
        Name = name;
        this.laptops = laptops;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }
}

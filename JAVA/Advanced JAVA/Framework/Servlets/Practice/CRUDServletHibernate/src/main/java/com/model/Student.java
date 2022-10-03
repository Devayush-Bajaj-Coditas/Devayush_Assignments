package com.model;

import com.sun.javafx.geom.transform.Identity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "My_Students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Student_id")
    int id;
    @Column(length = 43,name = "Student_name")
    String name;

/*    @Temporal(TemporalType.DATE )
    Date date;*/
    Address address;

     //One to One mapping
     @JoinColumn(name = "Course_id")
     @OneToOne
     Course course;


     //One to many  -> one student have multiple laptops
    @ManyToOne
   @JoinColumn(name = "Student_Laptops")
     List <Laptop> laptops;


    public Student(int id, String name, Address address, Course course, List<Laptop> laptops) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.course = course;
        this.laptops = laptops;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(List<Laptop> laptops) {
        this.laptops = laptops;
    }

    public Student() {
    }
}



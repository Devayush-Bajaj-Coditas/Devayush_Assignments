package com.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "Students_OneToMany")
public class Student {
    @Id
    int student_id;
    @Column(name = "Student_name")
    String name;
    @OneToMany(mappedBy = "student")
    List<Laptop> laptopList;


    public Student(int student_id, String name, List<Laptop> laptopList) {
        this.student_id = student_id;
        this.name = name;
        this.laptopList = laptopList;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLaptopList(List<Laptop> laptopList) {
        this.laptopList = laptopList;
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getName() {
        return name;
    }

    public List<Laptop> getLaptopList() {
        return laptopList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", name='" + name + '\'' +
                ", laptopList=" + laptopList +
                '}';
    }
}

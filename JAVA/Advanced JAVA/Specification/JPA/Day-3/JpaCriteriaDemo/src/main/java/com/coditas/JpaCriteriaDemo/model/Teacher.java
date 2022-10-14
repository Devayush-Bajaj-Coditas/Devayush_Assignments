package com.coditas.JpaCriteriaDemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {
    @Id
    int teacherId;
    String teacherName;
    float teacherSalary;


    public Teacher() {
    }

    public Teacher(int teacherId, String teacherName, float teacherSalary) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.teacherSalary = teacherSalary;
    }

    public Teacher(String teacherName, float teacherSalary) {
        this.teacherName = teacherName;
        this.teacherSalary = teacherSalary;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public float getTeacherSalary() {
        return teacherSalary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                ", teacherSalary=" + teacherSalary +
                '}';
    }
}

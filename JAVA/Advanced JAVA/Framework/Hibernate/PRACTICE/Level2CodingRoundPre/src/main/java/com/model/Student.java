package com.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Student_Information")
public class Student {
    @Column(name = "Student_name")
    String studentName;
    @Column(name = "Student_Roll_Number")
    @Id
    int studentRollNumber;
    @Column(name = "Student_Address")
    String studentAddress;
    @Column(name = "Student_Phone_Number")
    long studentPhoneNumber;

    @Column(name = "Subjects")
    @ManyToMany(mappedBy = "students")
    List <Subject> subjects;

    public Student(String studentName, int studentRollNumber, String studentAddress, long studentPhoneNumber) {
        this.studentName = studentName;
        this.studentRollNumber = studentRollNumber;
        this.studentAddress = studentAddress;
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public Student() {
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentRollNumber() {
        return studentRollNumber;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public long getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentRollNumber=" + studentRollNumber +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentPhoneNumber=" + studentPhoneNumber +
                ", subjects=" + subjects +
                '}';
    }
}

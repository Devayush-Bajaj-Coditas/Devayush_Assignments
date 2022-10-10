package com.model;

import javax.persistence.*;

@Entity
@Table(name = "student_TPH")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Student_Data",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "info")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ROll_Number", length = 13)
    private int rollNo;
    private String name;

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }
}

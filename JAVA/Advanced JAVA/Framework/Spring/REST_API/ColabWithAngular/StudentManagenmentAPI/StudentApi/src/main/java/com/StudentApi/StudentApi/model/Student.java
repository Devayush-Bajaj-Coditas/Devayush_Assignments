package com.StudentApi.StudentApi.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "Student_Details")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rollNumber;
    private String fullName;
    private String motherName;
    private  int age;
    private  String gender;
    private float sscMarks;
    private String enrolledFrom;
/*    @OneToMany
    List <ContactNumber> contactNumbers;*/
    private long contactNumber;


}

package com.devayush.studentTeacher.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
public class TeacherEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int teacherId;
    private String teacherName;
    private long teacherMobileNumber;
    private String teacherAddress;

    @ManyToMany(mappedBy = "teacherEntities", cascade = CascadeType.PERSIST)
    private List<StudentEntity> studentEntities = new ArrayList<>();


}

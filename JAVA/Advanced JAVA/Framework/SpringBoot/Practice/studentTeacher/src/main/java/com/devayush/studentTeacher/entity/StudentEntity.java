package com.devayush.studentTeacher.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Data
@Entity
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String studentFirstName;
    private String studentLastName;
    private String Address;
    private long phoneNo;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "student_entity_teacher_entities",
            joinColumns = @JoinColumn(name = "student_entity_id"),
            inverseJoinColumns = @JoinColumn(name = "teacher_entities_null"))
    private List<TeacherEntity> teacherEntities = new ArrayList<>();


}

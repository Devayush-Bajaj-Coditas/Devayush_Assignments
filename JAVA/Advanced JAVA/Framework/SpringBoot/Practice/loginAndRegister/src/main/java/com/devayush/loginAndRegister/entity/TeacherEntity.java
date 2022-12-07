package com.devayush.loginAndRegister.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class TeacherEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int teacherId;

    @OneToMany(mappedBy = "teacher" ,cascade = CascadeType.ALL)
    List<StudentEntity> student;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

}

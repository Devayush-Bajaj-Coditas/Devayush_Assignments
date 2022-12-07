package com.devayush.loginAndRegister.entity;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    @ManyToOne()
    TeacherEntity teacher;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

}

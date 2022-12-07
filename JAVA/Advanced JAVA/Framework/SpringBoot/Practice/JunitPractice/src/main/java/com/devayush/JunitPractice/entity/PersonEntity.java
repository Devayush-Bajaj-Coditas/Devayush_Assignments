package com.devayush.JunitPractice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@AllArgsConstructor
@Data
@Entity
@NoArgsConstructor
public class PersonEntity {
    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    int rollNumber;
    String name;
    String email;
    String password;
    long phoneNumber;
}

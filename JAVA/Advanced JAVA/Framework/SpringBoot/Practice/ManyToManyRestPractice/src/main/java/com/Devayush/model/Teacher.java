package com.Devayush.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Teacher {
    String name;
    @Id
    int rollNo;
    @ManyToMany
    List<Student> studentList;
 }

package com.Devayush.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Student {

    String name;
    @Id
    int teacherId;
    @ManyToMany
    List<Teacher> teacherList;
}

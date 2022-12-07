package com.devayush.studentTeacher.repository;

import com.devayush.studentTeacher.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<StudentEntity , Integer> {
}

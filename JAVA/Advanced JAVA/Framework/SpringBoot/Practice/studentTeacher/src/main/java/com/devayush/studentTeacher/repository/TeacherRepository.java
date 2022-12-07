package com.devayush.studentTeacher.repository;

import com.devayush.studentTeacher.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface TeacherRepository extends JpaRepository<TeacherEntity, Integer> {
}

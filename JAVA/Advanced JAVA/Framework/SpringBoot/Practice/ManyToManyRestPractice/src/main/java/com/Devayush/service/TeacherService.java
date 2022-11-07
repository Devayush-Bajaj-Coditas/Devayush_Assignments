package com.Devayush.service;

import com.Devayush.model.Teacher;
import com.Devayush.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    @Autowired
    TeacherRepository teacherRepository;
    public String addTeacher(Teacher teacher){
        teacherRepository.save(teacher);
        return "Data added successfully";
    }

    public Teacher displayTeacher(int id){
            return teacherRepository.findById(id).orElse(null);
    }

    public List<Teacher> showAllTeachers(){
        return teacherRepository.findAll();
    }


    public List <Teacher> findTeacherByName(String name ){
        return teacherRepository.getTeacherByName(name);
    }



}

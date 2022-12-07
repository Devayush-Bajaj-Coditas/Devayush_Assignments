package com.devayush.studentTeacher.service;

import com.devayush.studentTeacher.entity.StudentEntity;
import com.devayush.studentTeacher.entity.TeacherEntity;
import com.devayush.studentTeacher.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    TeacherRepository teacherRepository;

    public TeacherEntity registerTeacher(TeacherEntity teacher){
        return teacherRepository.save(teacher);
    }

    public TeacherEntity updateStudent(TeacherEntity newTeacherData){
        TeacherEntity teacherOld = teacherRepository.findById(newTeacherData.getTeacherId()).orElse(null);
        teacherOld.setTeacherName(newTeacherData.getTeacherName());
        teacherOld.setTeacherAddress(newTeacherData.getTeacherAddress());
        teacherOld.setTeacherMobileNumber(newTeacherData.getTeacherMobileNumber());
        return teacherRepository.save(teacherOld);
    }

    public String deleteTeacher(int id){
        teacherRepository.deleteById(id);
        return "Deleted successfully";
    }

    public List<TeacherEntity> getAllTeachers(){
        return teacherRepository.findAll();
    }
}

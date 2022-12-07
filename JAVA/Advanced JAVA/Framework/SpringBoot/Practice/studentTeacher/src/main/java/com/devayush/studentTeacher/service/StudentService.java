package com.devayush.studentTeacher.service;

import com.devayush.studentTeacher.entity.StudentEntity;
import com.devayush.studentTeacher.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public StudentEntity registerStudent(StudentEntity studentEntity){
        return studentRepository.save(studentEntity);
    }

    public StudentEntity updateStudent(StudentEntity newStudentData){
        StudentEntity studentOld = studentRepository.findById(newStudentData.getStudentId()).orElse(null);
        studentOld.setStudentFirstName(newStudentData.getStudentFirstName());
        studentOld.setStudentLastName(newStudentData.getStudentLastName());
        studentOld.setPhoneNo(newStudentData.getPhoneNo());
        studentOld.setAddress(newStudentData.getAddress());
        return studentRepository.save(studentOld);
    }

    public String deleteStudent(int id){
        StudentEntity student = studentRepository.findById(id).orElse(null);
        studentRepository.delete(student);
        return "Deleted successfully";
    }

    public List<StudentEntity> getAllStudents(){
        return studentRepository.findAll();
    }


}

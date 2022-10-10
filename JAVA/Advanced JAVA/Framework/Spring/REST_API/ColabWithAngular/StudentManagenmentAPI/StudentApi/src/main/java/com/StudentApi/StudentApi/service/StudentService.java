package com.StudentApi.StudentApi.service;

import com.StudentApi.StudentApi.model.Student;
import com.StudentApi.StudentApi.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired

    //post methods
    private StudentRepository repository;
    public Student saveStudent(Student student){
        return repository.save(student);
    }


    public List<Student> saveStudents(List<Student> students){
        return repository.saveAll(students);
    }


    //get all students
    public List<Student> getStudents(){
        return repository.findAll();
    }

    //get student by ID
    public Student getProductById(int id){
        return repository.findById(id).orElse(null);
    }


    //Delete
    public String deleteStudent(int id){
        repository.deleteById(id);
        return "Student removed";

    }

    //update

    public Student updateStudent(Student student){
        Student existingStudent = repository.findById(student.getRollNumber()).orElse(null);
        existingStudent.setFullName(student.getFullName());
        existingStudent.setAge(student.getAge());
        existingStudent.setContactNumber(student.getContactNumber());
        existingStudent.setGender(student.getGender());
        existingStudent.setSscMarks(student.getSscMarks());
        existingStudent.setMotherName(student.getMotherName());
        existingStudent.setEnrolledFrom(student.getEnrolledFrom());
        return repository.save(existingStudent);

    }

}

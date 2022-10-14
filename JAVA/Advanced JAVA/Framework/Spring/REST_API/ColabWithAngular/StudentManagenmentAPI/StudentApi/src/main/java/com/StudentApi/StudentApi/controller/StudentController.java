package com.StudentApi.StudentApi.controller;

import com.StudentApi.StudentApi.model.Student;

import com.StudentApi.StudentApi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

// add one student
    @RequestMapping(value = "/addStudent", method = RequestMethod.POST, consumes = "application/JSON")         //add one student
    public Student addStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @RequestMapping(value = "/addStudents", method = RequestMethod.POST, consumes = "application/JSON")
   //add list of students
    public List<Student> addStudents(@RequestBody List<Student> students) {
        return service.saveStudents(students);
    }

    @GetMapping("/students")        //fetch all
    public List<Student> findAllStudents() {
        return service.getStudents();
    }

    @GetMapping("/students/{id}")      //fetch by id
    public Student findStudentById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        return service.deleteStudent(id);
    }
}
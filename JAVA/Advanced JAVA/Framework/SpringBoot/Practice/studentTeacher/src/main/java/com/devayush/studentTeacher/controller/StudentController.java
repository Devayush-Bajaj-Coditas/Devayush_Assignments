package com.devayush.studentTeacher.controller;

import com.devayush.studentTeacher.entity.StudentEntity;
import com.devayush.studentTeacher.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/student")
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;


    @PostMapping("/register")
    public StudentEntity registerStudent (@RequestBody StudentEntity studentEntity){
       return  studentService.registerStudent(studentEntity);
    }


    @PutMapping("/update")
    public StudentEntity student (@RequestBody StudentEntity student){
        return studentService.updateStudent(student);
    }

    @GetMapping("/getAll")
    public List<StudentEntity> getAllStudents(){
        return studentService.getAllStudents();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        return studentService.deleteStudent(id);
    }
}

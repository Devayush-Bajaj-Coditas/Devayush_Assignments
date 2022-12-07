package com.devayush.studentTeacher.controller;

import com.devayush.studentTeacher.entity.TeacherEntity;
import com.devayush.studentTeacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/teacher")
@RestController
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @PostMapping("/register")
    public TeacherEntity registerTeacher (@RequestBody TeacherEntity teacher) {
        return teacherService.registerTeacher(teacher);
    }

    @PutMapping("/update")
    public TeacherEntity updateTeacher(@RequestBody TeacherEntity teacher){
        return teacherService.updateStudent(teacher);
    }

    @GetMapping("/getAll")
    public List<TeacherEntity> getAllTeachers(){
        return teacherService.getAllTeachers();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTeacher (@PathVariable int id){
        return teacherService.deleteTeacher(id);
    }
}

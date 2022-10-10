package com.practice.HibernateCRUD.controller;

import com.practice.HibernateCRUD.dao.StudentDao;
import com.practice.HibernateCRUD.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public void addStudent(@RequestBody Student student){
        studentDao.setData(student);
    }

    @GetMapping("/students")
    public List<Student> getStudent(){
        return studentDao.getAllData();
    }
}

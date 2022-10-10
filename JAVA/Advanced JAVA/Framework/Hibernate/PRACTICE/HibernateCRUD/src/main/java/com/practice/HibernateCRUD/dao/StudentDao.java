package com.practice.HibernateCRUD.dao;

import com.practice.HibernateCRUD.model.Student;

import java.util.List;

public interface StudentDao {

    void setData(Student student);

    public List<Student> getAllData();


}

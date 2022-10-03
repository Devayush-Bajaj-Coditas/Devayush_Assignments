package com.dao;

import com.model.Student;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudImplimentation implements CrudOperations{
    @Override
    public int registerStudent() {
        int status;
        try {
            Student student = new Student();
            PreparedStatement preparedStatement = new GetConnection().connect().prepareStatement("insert into student values ()");
            preparedStatement.setString(1, student.getName());
            status = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return status;
    }

    @Override
    public int updateStudent() {
        return 0;
    }

    @Override
    public int viewStudents() {
        return 0;
    }

    @Override
    public int deleteStudent() {
        return 0;
    }
}

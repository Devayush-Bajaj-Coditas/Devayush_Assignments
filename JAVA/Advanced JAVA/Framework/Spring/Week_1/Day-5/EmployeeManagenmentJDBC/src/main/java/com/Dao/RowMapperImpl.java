package com.Dao;


import com.Bean.EmployeeBean;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperImpl implements RowMapper <EmployeeBean   >{
    @Override
    public EmployeeBean mapRow(ResultSet resultSet, int i) throws SQLException {
         EmployeeBean employeeBean = new EmployeeBean();
         employeeBean.setId(resultSet.getInt(1));
         employeeBean.setName(resultSet.getString(2));
         employeeBean.setPost(resultSet.getString(3));
         employeeBean.setCity(resultSet.getString(4));
         employeeBean.setSalary(Float.valueOf(resultSet.getString(5)));
         return employeeBean;
    }
}

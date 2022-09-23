package com.Dao;

import com.Bean.EmployeeBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDao {

    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int registerEmployee(EmployeeBean bean) {
        final String QUERY = "insert into employees values(?,?,?,?,?)";
        Object[] values = {bean.getId(), bean.getName(),bean.getPost(),bean.getCity(),bean.getSalary()};

        int status = jdbcTemplate.update(QUERY,values);
        return status;
    }


    public int update(EmployeeBean bean){
        final String UpdateQuery = "Update employees set city = ? where id = ? ";
        int status = jdbcTemplate.update(UpdateQuery, bean.getCity(),bean.getId());
        return status;
    }

    public int Delete(int id){
        final String QUERY = "Delete from employees where id = ? ";
        int status = jdbcTemplate.update(QUERY,id);
        return status;
    }

    public List<EmployeeBean> getAllEmployees(){
        final String QUERY = "Select * from employees";
        List <EmployeeBean> employeeBeans = jdbcTemplate.query(QUERY,new RowMapperImpl());
        return employeeBeans;
    }

    public EmployeeBean getEmployeeById(int empId){
        final String QUERY = "select * from employees where id =?";
        RowMapper<EmployeeBean> rowMapper = new RowMapperImpl();
        EmployeeBean employeeBean = jdbcTemplate.queryForObject(QUERY, rowMapper,   empId);
        return employeeBean;
    }




}

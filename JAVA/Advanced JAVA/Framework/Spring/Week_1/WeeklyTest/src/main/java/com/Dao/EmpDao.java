package com.Dao;

import com.model.AddressBean;
import com.model.EmployeeBean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmpDao {

    AddressBean addressBean = new AddressBean();
    EmployeeBean employeeBean = new EmployeeBean();
    JdbcTemplate jt = new JdbcTemplate();

    public JdbcTemplate getJt() {
        return jt;
    }

    public void setJt(JdbcTemplate jt) {
        this.jt = jt;
    }


    public int RegisterAdd(AddressBean address, EmployeeBean employeeBean) {
        jt.update("insert into emp_eddress values (?, ?,?,?)",address.getAddressId(), address.getFlatNo(), address.getPincode(), address.getCity());
        return this.RegisterEmp(employeeBean,address);

    }

    public int RegisterEmp(EmployeeBean employeeBean, AddressBean address ){
        return jt.update("insert into employee values (?,?,?,?,?)",employeeBean.getEmpId(),employeeBean.getFirstName(),employeeBean.getLastName(),employeeBean.getSalary(),address.getAddressId());
    }


    public int Delete (EmployeeBean employeeBean){
        return  jt.update("delete from employee where EmpId = " + employeeBean.getEmpId());

    }

    public int Update(EmployeeBean employeeBean){
        return jt.update("update employee set salary = salary+5000");
    }


}

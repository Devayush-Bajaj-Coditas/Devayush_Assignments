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
        jt.update("insert into emp_eddress values (?, ?,?,?)", address.getAddressId(), address.getFlatNo(), address.getPincode(), address.getCity());
        return this.RegisterEmp(employeeBean, address);

    }

    public int RegisterEmp(EmployeeBean employeeBean, AddressBean address) {
        return jt.update("insert into employee values (?,?,?,?,?)", employeeBean.getEmpId(), employeeBean.getFirstName(), employeeBean.getLastName(), employeeBean.getSalary(), address.getAddressId());
    }


    public int Delete(EmployeeBean employeeBean) {
        return jt.update("delete from employee,emp_eddress where addressId = " + employeeBean.getEmpId());

    }

    public int Update(EmployeeBean employeeBean) {
        return jt.update("update employee set salary = salary+5000");
    }

    public List<EmployeeBean> getAllEmployees() {
        final String query= "select * from employee ";
       List<EmployeeBean> employeeBeanList= jt.query(query,new RowMapper<EmployeeBean>() {
            @Override
            public EmployeeBean mapRow(ResultSet resultSet, int i) throws SQLException {

                employeeBean.setEmpId(resultSet.getInt(1));
                employeeBean.setFirstName(resultSet.getString(2));
                employeeBean.setLastName(resultSet.getString(3));
                employeeBean.setSalary(resultSet.getInt(4));


                addressBean.setAddressId(resultSet.getInt(1));
                addressBean.setFlatNo(resultSet.getString(2));
                addressBean.setPincode(resultSet.getString(3));
                addressBean.setCity(resultSet.getString(4));

                employeeBean.setAddressBean(addressBean);
                return employeeBean;
            }
        });

        return employeeBeanList;
    }


    public void sortByLastName(){
        String Query = "Select * from employees where salary > 10000 and city like Mumbai" ;
        jt.update(Query);
    }
}



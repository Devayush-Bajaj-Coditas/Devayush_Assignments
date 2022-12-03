package com.devayush.springSecurity.service;
import com.devayush.springSecurity.entity.EmployeeEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {

    List<EmployeeEntity> employeeEntityList;

    public String addEmployee(){
        EmployeeEntity employee1 = new EmployeeEntity(1828305,"Devayush","Bajaj",750981025);
        EmployeeEntity employee2 = new EmployeeEntity(1828300,"Amit","singh",990552083);
        employeeEntityList.add(employee1);
        employeeEntityList.add(employee2);
        return "employee added";
    }


    public List <EmployeeEntity> getAllEntities(){
        return employeeEntityList;
    }

    public EmployeeEntity getEmployeeById(int id){
        return this.employeeEntityList.stream().filter(employeeEntity -> employeeEntity.getEmployeeId() == id).findAny().orElse(null);
    }

}

package com.devayush.SpringSecurityByDurgeshPractice.service;

import com.devayush.SpringSecurityByDurgeshPractice.entity.EmployeeEntity;
import com.devayush.SpringSecurityByDurgeshPractice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeEntity addEmployee(EmployeeEntity employee){
        return employeeRepository.save(employee);
    }


    public List <EmployeeEntity> getAllEntities(){
        return employeeRepository.findAll();
    }

    public EmployeeEntity getEmployeeById(int id){
        return employeeRepository.findById(id).orElse(null);
    }

}
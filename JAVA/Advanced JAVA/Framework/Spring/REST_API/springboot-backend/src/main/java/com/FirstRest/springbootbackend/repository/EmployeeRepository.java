package com.FirstRest.springbootbackend.repository;

import com.FirstRest.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    //All crud database methods
}

package com.devayush.SpringSecurityByDurgeshPractice.repository;

import com.devayush.SpringSecurityByDurgeshPractice.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository <EmployeeEntity , Integer> {
    EmployeeEntity findByEmployeeFirstNameIgnoreCase(String employeeFirstName);

    @Query("select e from EmployeeEntity e where upper(e.employeeFirstName) = upper(?1)")
    Optional<EmployeeEntity> findByName(String employeeFirstName);


}

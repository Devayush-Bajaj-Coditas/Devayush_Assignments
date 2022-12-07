package com.devayush.springSecurity.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class EmployeeEntity {

    int employeeId;
    String employeeFirstName;
    String employeeLastName;
    long phoneNumber;

}

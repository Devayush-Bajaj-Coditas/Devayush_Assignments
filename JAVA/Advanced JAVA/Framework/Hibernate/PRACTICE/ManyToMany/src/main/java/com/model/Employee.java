package com.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Employee_M2M")
public class Employee {
    @Id
    @Column(name = "Employee_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    int EmployeeId;

    @Column (name = "Employee_name")
    String EmployeeName;
    @Column(name = "ProjectList")
    @ManyToMany(mappedBy = "employees")
    List<Projects> projectsList;

    public Employee(int employeeId, String employeeName) {
        EmployeeId = employeeId;
        EmployeeName = employeeName;
    }

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, List<Projects> projectsList) {
        EmployeeId = employeeId;
        EmployeeName = employeeName;
        this.projectsList = projectsList;
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public List<Projects> getProjectsList() {
        return projectsList;
    }

    public void setProjectsList(List<Projects> projectsList) {
        this.projectsList = projectsList;
    }
}

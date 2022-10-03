package com.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "Projects_M2M")
public class Projects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Project_id")
    int projectId;
    @Column(name = "Project_name")
    String projectName;

    @Column(name = "Employees_associated")
    @ManyToMany
    List <Employee> employees;

    public Projects() {
    }

    public Projects(int projectId, String projectName) {
        this.projectId = projectId;
        this.projectName = projectName;
    }

    public Projects(int projectId, String projectName, List<Employee> employees) {
        this.projectId = projectId;
        this.projectName = projectName;
        this.employees = employees;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

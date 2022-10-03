package com.bean;

import javax.persistence.*;


@Table(name = "Employee2")
@Entity
public class Employee {
@Id
@GeneratedValue (strategy = GenerationType.AUTO)
    int empId;
    String empName;

    //Adding City as new entity

    String Newcity;

    public String getNewcity() {
        return Newcity;
    }

    public void setNewcity(String newcity) {
        Newcity = newcity;
    }

    String empDesig;
    String empSalary;
    String city;

    @Override

    public String toString() {
        return "employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDesig='" + empDesig + '\'' +
                ", empSalary='" + empSalary + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDesig() {
        return empDesig;
    }

    public void setEmpDesig(String empDesig) {
        this.empDesig = empDesig;
    }

    public String getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(String empSalary) {
        this.empSalary = empSalary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


}

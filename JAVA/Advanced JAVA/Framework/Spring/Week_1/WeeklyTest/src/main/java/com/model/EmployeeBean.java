package com.model;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeBean {
    int EmpId;
    String firstName;
    String lastName;
    float salary;

    AddressBean addressBean;

    public EmployeeBean() {
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public AddressBean getAddressBean() {
        return addressBean;
    }

    public void setAddressBean(AddressBean addressBean) {
        this.addressBean = addressBean;
    }

    @Override
    public String toString() {
        return "EmployeeBean{" +
                "EmpId=" + EmpId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", addressBean=" + addressBean +
                '}';
    }
}

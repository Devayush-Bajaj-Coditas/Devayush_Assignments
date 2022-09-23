package com.controller;

import com.Dao.EmpDao;
import com.model.EmployeeBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class DeleteUser {
    EmployeeBean employeeBean = new EmployeeBean();
Scanner scanner = new Scanner(System.in);
public void delete(){
    System.out.println("enter id: ");
    int id = scanner.nextInt();
    employeeBean.setEmpId(id);

    ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
    EmpDao empDao = context.getBean("EmpDao", EmpDao.class);
    int status = empDao.Delete(employeeBean);
    if (status > 0){
        System.out.println("Deleted");
    }
    else
        System.out.println("Something went wrong");



}
}

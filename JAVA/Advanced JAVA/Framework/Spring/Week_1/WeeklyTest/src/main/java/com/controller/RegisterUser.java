package com.controller;

import com.Dao.EmpDao;
import com.model.AddressBean;
import com.model.EmployeeBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class RegisterUser {

    AddressBean addressBean = new AddressBean();
    EmployeeBean employeeBean = new EmployeeBean();
    Scanner scanner = new Scanner(System.in);

    public void register(){
        System.out.println("Id: ");
        int id = scanner.nextInt();
        employeeBean.setEmpId(id);

        System.out.println("First Name: " );
        employeeBean.setFirstName(scanner.next());
        System.out.println("Last Name: " );
        employeeBean.setLastName(scanner.next());
        System.out.println("Salary: ");
        employeeBean.setSalary(scanner.nextFloat());

        System.out.println("Enter your address");

        addressBean.setAddressId(id);
        System.out.println("Flat No : " );
        addressBean.setFlatNo(scanner.next());
        System.out.println("pin code :  ");
        addressBean.setPincode(scanner.next());
        System.out.println("City : ");
        addressBean.setCity(scanner.next());

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        EmpDao empDao = context.getBean("EmpDao",EmpDao.class);

        int checkAdd = empDao.RegisterAdd(addressBean,employeeBean);

        if ((checkAdd > 0) ){
            System.out.println("Register Successful");
        }
        else{
            System.out.println("Something went wrong");
        }
    }

}

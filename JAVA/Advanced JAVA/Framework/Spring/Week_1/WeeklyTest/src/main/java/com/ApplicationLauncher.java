package com;

import com.Dao.EmpDao;
import com.controller.DeleteUser;
import com.controller.RegisterUser;
import com.model.EmployeeBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

;

public class ApplicationLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeBean employeeBean = new EmployeeBean();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring.xml");
        EmpDao empDao = applicationContext.getBean("EmpDao",EmpDao.class);
        int choice = 0;
        do{
        System.out.println("Select: \n1 --> Create\n 2--> show\n 3--> update\n 4-->Delete ");
        choice = scanner.nextInt();

            switch (choice){
                case 1:
                    new RegisterUser().register();
                break;

                case 2:
                    List<EmployeeBean> employeeList= empDao.getAllEmployees();
                    for (EmployeeBean emp : employeeList){
                        System.out.println(emp);
                    }
                    break;
                case 3:
                    empDao.Update(employeeBean);
                    break;
                case 4:
                    new DeleteUser().delete();
                    break;
            }

        }
        while(choice != 0);

    }
}

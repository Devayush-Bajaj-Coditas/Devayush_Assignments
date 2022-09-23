package com;

import com.Dao.EmpDao;
import com.controller.DeleteUser;
import com.controller.RegisterUser;
import com.model.EmployeeBean;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.util.Scanner;

;

public class ApplicationLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeBean employeeBean = new EmployeeBean();
        int choice = 0;
        do{
        System.out.println("Select: \n1 --> Create\n 2--> show\n 3--> update\n 4-->Delete ");
        choice = scanner.nextInt();

            switch (choice){
                case 1:
                    new RegisterUser().register();
                break;

                case 3:
                    new EmpDao().Update(employeeBean);
                    break;
                case 4:
                    new DeleteUser().delete();
                    break;
            }

        }
        while(choice != 0);

    }
}

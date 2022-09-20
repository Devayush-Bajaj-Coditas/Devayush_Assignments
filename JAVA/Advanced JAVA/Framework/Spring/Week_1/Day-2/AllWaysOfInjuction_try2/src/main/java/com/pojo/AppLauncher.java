package com.pojo;

import com.pojo.AddressPojo;
import com.pojo.StudentPojo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppLauncher {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
       // AddressPojo address = (AddressPojo) context.getBean("address");
        System.out.println("Hello");
        StudentPojo student =(StudentPojo) context.getBean("student");
        System.out.println(student);
       // System.out.println(address);

    }
}

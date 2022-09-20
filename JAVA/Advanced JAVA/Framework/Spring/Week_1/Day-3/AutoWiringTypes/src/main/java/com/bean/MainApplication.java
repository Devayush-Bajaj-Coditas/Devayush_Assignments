package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("*******************By Name******************");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBean.xml");
        Student student = (Student) applicationContext.getBean("Student");
        System.out.println(student);

        System.out.println("*******************By Type******************");
        ApplicationContext byType = new ClassPathXmlApplicationContext("ByType.xml");
        Employee employee = (Employee) byType.getBean("Employee");
        System.out.println(employee);


        System.out.println("******************By Constructor********************");
        ApplicationContext byConstructor = new ClassPathXmlApplicationContext("ByConstructor.xml");
        //Student student1 = (Student) byConstructor.getBean("Student1");
        Student student2 = (Student) byConstructor.getBean("Student",Student.class,14,"Devayush",new Address("123","pune","mh"));
        //System.out.println(student1);
        System.out.println(student2);
    }
}

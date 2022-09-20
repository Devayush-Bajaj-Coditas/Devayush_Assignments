package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        Triangle name = (Triangle) context.getBean("Triangle");
        System.out.println(name);


    }
}

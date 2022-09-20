
package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");  //linking with the xml file of SpringBEan which will get and set the value of pojo and put it in the IOC file
        HelloWorld obj = (HelloWorld) context.getBean("hello"); //getting value from, springbean .xml file
        obj.printHello(); //
    }
}

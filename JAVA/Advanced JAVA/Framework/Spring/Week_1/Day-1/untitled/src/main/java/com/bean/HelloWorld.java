package com.bean;

public class HelloWorld {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("HEllo" + name);
    }
}

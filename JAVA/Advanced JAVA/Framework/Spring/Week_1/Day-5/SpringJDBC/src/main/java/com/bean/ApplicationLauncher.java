package com.bean;

import com.Dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.transform.Result;
import java.io.*;
import java.nio.Buffer;
import java.sql.ResultSet;
import java.util.Scanner;

public class ApplicationLauncher {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        BookDao bd = (BookDao) context.getBean("bdao");
        Book b = new Book();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        b = new Book();
        b.setAuthorName("dev");
        b.setPrice(12213);
        b.setBookName("devBook");

        int inserted = bd.insertBook(b);
        if(inserted > 0) {
            System.out.println(inserted + "values inserted");
        } else {
            System.out.println("Try again");
        }

        System.out.println("Fetching details");
        System.out.println(bd.fetchWithId(2));

    }
}

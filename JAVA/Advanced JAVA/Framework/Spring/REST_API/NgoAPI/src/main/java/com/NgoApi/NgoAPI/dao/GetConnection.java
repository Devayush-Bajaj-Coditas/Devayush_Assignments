package com.NgoApi.NgoAPI.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {
    static Connection connection = null;
    private static  final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/ngo";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345";

    public static Connection connection(){
        if(connection == null) {
            try {
                Class.forName(DRIVER_CLASS_NAME);
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ngo",USERNAME, PASSWORD);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return connection;
    }
}
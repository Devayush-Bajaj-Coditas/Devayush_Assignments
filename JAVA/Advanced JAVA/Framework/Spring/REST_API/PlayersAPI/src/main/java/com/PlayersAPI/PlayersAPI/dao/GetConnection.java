package com.PlayersAPI.PlayersAPI.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GetConnection {

static Connection connection = null;

private static final String DRIVER_CLASS_NAME= "com.mysql.jdbc.Driver";
private static final String URL = "jdbc:mysql://localhost:3306/football";

private static String USERNAME = "root";
private static String PASSWORD = "12345";

public static Connection connection(){
    if(connection == null){
        try{
            Class.forName(DRIVER_CLASS_NAME);
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    return connection;
}

}

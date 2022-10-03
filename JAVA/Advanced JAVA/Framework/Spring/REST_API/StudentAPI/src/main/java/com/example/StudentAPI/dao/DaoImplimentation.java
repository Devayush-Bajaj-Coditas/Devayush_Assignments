package com.example.StudentAPI.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoImplimentation{

    static Connection connection = null;
    private DaoImplimentation(){}
    static public Connection getConnection(){
        if(connection == null ){
            try {
                Class.forName(DaoDetails.DRIVER);
                connection = DriverManager.getConnection(DaoDetails.URL,DaoDetails.USERNAME,DaoDetails.PASSWORD);

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }
}

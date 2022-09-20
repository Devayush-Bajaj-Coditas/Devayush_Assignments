package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    public Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/devayush", "root", "12345");

        }catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return con;
        }
    }

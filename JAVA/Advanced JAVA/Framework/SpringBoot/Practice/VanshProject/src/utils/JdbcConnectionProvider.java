package utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnectionProvider {

    public static Connection getDatabaseConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/TransportServiceDB", "root", "12345");
    }catch (Exception exception){
        exception.printStackTrace();
        }
        return connection;
    }
}
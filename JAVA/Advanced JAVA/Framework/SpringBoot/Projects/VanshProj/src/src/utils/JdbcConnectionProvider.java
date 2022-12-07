package src.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnectionProvider {

    private JdbcConnectionProvider() {
    }

    public static Connection getDatabaseConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/TransportServiceDB?createDatabaseIfNotExist=true", "root", "12345");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return connection;
    }
}
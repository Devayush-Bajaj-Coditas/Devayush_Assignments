package javaFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmpDao {
    public Connection con = null;
    public Connection getCon() {
        if(con == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql//localhost:3306/servletlogincrud", "root", "12345");
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return con;
    }
}

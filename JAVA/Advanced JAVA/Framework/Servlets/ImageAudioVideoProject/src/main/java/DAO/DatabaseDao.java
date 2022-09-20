package DAO;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class DatabaseDao {
    Connection con = null;
    public void getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","12345");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Statement showImage() throws SQLException {
        getConnection();
        Statement statement = con.createStatement();
        return statement;
    }
}

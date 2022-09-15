package Dao;

import Model.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao {

    public int registerEmployee(Employee employee) {
        int result=0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restfirstproject", "root", "12345");
            PreparedStatement preparedStatement = con.prepareStatement("Insert into employee Values (?,?,?,?,?,?,?)");

            preparedStatement.setInt(1,employee.getId());
            preparedStatement.setString(2, employee.getFirstname());
            preparedStatement.setString(3, employee.getLastname());
            preparedStatement.setString(4, employee.getUsername());
            preparedStatement.setString(5, employee.getPassword());
            preparedStatement.setString(6, employee.getAddress());
            preparedStatement.setString(7, employee.getContact());

            result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    return result;

    }
}

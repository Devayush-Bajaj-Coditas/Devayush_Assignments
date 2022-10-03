package com.dao;

import com.model.Employee;
import com.mysql.cj.jdbc.ClientPreparedStatement;
import com.mysql.cj.jdbc.result.ResultSetImpl;

import java.sql.*;
import java.util.Random;

public class EmployeeDao {
    Connection connection = null;
    Employee employee = new Employee();

    public Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/practice","root","12345");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public int createUser(Employee employee){
        final String QUERY = "insert into bank values (?,?,?,?,?,?,?,?)";
        int status;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
            preparedStatement.setString(1,employee.getName());
            preparedStatement.setString(2,employee.getAddress());
            preparedStatement.setString(3,employee.getPhoneNo());
            preparedStatement.setString(4,employee.getEmail());
            preparedStatement.setString(5,employee.getAccountNumber());
            preparedStatement.setString(6,employee.getCompanyName());
            preparedStatement.setString(7,employee.getAccountPin());
            preparedStatement.setString(8,employee.getAccountType());
             status = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return status;
    }

    public int getBalance() {
        ResultSet resultSet = null;
        int bankBalance;
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery("select balance from bank where accountNo = ? and accountPin = ? ");
            bankBalance = resultSet.findColumn("balance");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return bankBalance;
    }

    public int validation(){
        final String QUERY = "select balance from bank where accountNo = ? and accountPin = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();
            employee.setAccountNumber(resultSet.getString(1));

        }catch (Exception e ){e.printStackTrace();
    }


}

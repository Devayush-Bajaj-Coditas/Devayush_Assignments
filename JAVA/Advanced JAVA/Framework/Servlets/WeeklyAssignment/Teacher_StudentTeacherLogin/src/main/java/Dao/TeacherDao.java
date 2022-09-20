package Dao;

import Model.bean.TeacherBean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeacherDao {
    DatabaseConnection databaseConnection = new DatabaseConnection();
    Connection con = databaseConnection.getConnection();

    public int registerTeacher(TeacherBean bean){
        int status;
        try {
            PreparedStatement preparedStatement = con.prepareStatement("insert into teachers values(?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,bean.getId());
            preparedStatement.setString(2,bean.getFirstName());
            preparedStatement.setString(3,bean.getLastName());
            preparedStatement.setString(4,bean.getPassword());
            preparedStatement.setString(5,bean.getEmail());
            preparedStatement.setString(6,bean.getMobileNo());
            preparedStatement.setString(7,"Coming soon");
            status = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return status;
    }

    public boolean teacherLogin(TeacherBean bean){
        boolean status;
        try {
            PreparedStatement preparedStatement = con.prepareStatement("select * from teachers where Email = ? and Password = ?");
            preparedStatement.setString(1, bean.getEmail());
            preparedStatement.setString(2, bean.getPassword());
            ResultSet resultSet = preparedStatement.executeQuery();
            status =resultSet.next();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    return status;
    }
}

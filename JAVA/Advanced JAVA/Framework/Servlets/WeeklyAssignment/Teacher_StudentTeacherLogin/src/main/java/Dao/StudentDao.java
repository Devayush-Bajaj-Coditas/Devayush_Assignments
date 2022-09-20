package Dao;

import Model.bean.StudentBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao{
    DatabaseConnection connection = new DatabaseConnection();
    Connection con = connection.getConnection();
    StudentBean studentBean = new StudentBean();

    public int registerStudent(StudentBean bean){
        int status;
        try {
            PreparedStatement preparedStatement = con.prepareStatement("insert into students (id, First_Name, Last_Name, Password,Email,Mobile_No) values (?,?,?,?,?,?)");
            preparedStatement.setInt(1,bean.getStu_id());
            preparedStatement.setString(2,bean.getStu_firstName());
            preparedStatement.setString(3,bean.getStu_lastName());
            preparedStatement.setString(4,bean.getStu_password());
            preparedStatement.setString(5,bean.getStu_email());
            preparedStatement.setString(6,bean.getStu_mobileNo());
            status = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return status;
    }
    public boolean loginStudent(StudentBean bean){
        boolean status;
        try {
            PreparedStatement preparedStatement = con.prepareStatement("select * from students where Email = ? and password = ?");
            preparedStatement.setString(1,bean.getStu_email());
            preparedStatement.setString(2,bean.getStu_password());

            ResultSet resultSet = preparedStatement.executeQuery();
            status = resultSet.next();
            studentBean.setStu_firstName(resultSet.getString(2));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return status;
    }

}

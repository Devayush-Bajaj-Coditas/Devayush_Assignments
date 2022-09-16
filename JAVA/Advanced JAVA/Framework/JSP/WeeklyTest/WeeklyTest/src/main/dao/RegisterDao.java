package dao;

import model.UserBean;

import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RegisterDao {
    Connection con = null;

    public void getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/weeklytest", "root", "12345");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public int save(UserBean userBean) throws SQLException {
        getConnection();
        PreparedStatement preparedStatement = con.prepareStatement("insert into weeklytest values (?,?,?,?)");
        preparedStatement.setString(1, userBean.getUsername());
        preparedStatement.setString(2, userBean.getEmail());
        preparedStatement.setString(3, userBean.getPassword());
        preparedStatement.setString(4, userBean.getContact());

        int status = preparedStatement.executeUpdate();
        return status;
    }

    public List display() throws SQLException {
        getConnection();
        List<UserBean> list = new ArrayList();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from weeklytest");

        while (rs.next()) {
            UserBean userBean = new UserBean();
            userBean.setUsername(rs.getString("name"));
            userBean.setEmail(rs.getString("email"));
            userBean.setPassword(rs.getString("password"));
            userBean.setContact(rs.getString("mobile"));
            list.add(userBean);
        }

        return list;
    }

    public int delete(String name) throws SQLException {
        getConnection();
        PreparedStatement preparedStatement = con.prepareStatement("delete from weeklytest where name = ?");
        preparedStatement.setString(1,name);
        int status = preparedStatement.executeUpdate();
        return status;
    }

    public int update(UserBean bean) throws SQLException {
        getConnection();
        String updateThis = bean.getUpdateThis();
        PreparedStatement preparedStatement = con.prepareStatement("update weeklytest set "+ updateThis +" =  ?  where name =  ? ");
        preparedStatement.setString(1,bean.getNewData());
        preparedStatement.setString(2,bean.getUsername());
        int status = preparedStatement.executeUpdate();
        return status;
    }
}

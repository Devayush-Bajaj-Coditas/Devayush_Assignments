package Dao;

import Model.UserBean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
    UserBean userBean = new UserBean();
    Connection con = null;

    public void getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","12345");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public String save(UserBean bean){
        try {
            PreparedStatement ps = con.prepareStatement("insert into users value (?,?,?,?)");
            String name = bean.getName();
            String email = bean.getEmail();
            String password = bean.getPasseord();
            String mobile = bean.getMobile();

            ps.setString(1,name);
            ps.setString(2,email);
            ps.setString(3,password);
            ps.setString(4,mobile);

            int status = ps.executeUpdate();
            if(status> 0)
                return "success";

            else
                return "failed";

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

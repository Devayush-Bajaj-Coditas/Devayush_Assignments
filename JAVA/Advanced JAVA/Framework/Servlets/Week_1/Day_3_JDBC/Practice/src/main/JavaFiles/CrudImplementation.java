package JavaFiles;

import javax.servlet.http.HttpServlet;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudImplementation extends HttpServlet implements Crud {
Employee employee = new Employee();



    @Override
    public void addEmployee(Employee e) {
        Connection con = new EmployeeDao().getConnection();
        try {
            PreparedStatement preparedStatement = con.prepareStatement("insert into employee values (?,?,?,?)");
            preparedStatement.setString(1,employee.getName());
            preparedStatement.setString(2,employee.getEmail());
            preparedStatement.setString(3,employee.getPassword());
            preparedStatement.setString(4,employee.getMobileNo());
            int flag = preparedStatement.executeUpdate();
            if(flag > 0 ){
                System.out.println("Successfully registered");
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }


    }

    @Override
    public void displayEmployee(Employee e) {

    }

    @Override
    public void updateEmployee(Employee e) {

    }

    @Override
    public void DeleteEmployee(Employee e) {

    }
}

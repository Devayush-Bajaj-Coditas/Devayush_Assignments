package javaFiles.CrudOperation;

import javaFiles.EmpDao;
import javaFiles.Employee;

import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CrudOperations implements Crud{
    @Override
    public void create(Employee employee) {
        EmpDao empDao = new EmpDao();
        try {
            PreparedStatement preparedStatement = empDao.getCon().prepareStatement("insert into  UserData values (?,?,?,?,?)");
            int id = employee.getId();
            String name = employee.getName();
            String password = employee.getPassword();
            String email = employee.getEmail();
            String country = employee.getCountry();

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, password);
            preparedStatement.setString(5, country);

            int status =  preparedStatement.executeUpdate();
            empDao.con.close();
            if(status>0){
                System.out.println("Success");
            }
            else{
                System.out.println("Something went wrong");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void read(Employee employee) {

    }

    @Override
    public void update(Employee employee) {

    }

    @Override
    public void delete(Employee employee) {

    }
}

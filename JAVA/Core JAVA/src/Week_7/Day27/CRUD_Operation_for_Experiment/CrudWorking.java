package Week_7.Day27.CRUD_Operation_for_Experiment;

import java.awt.geom.RectangularShape;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Stack;

import Week_7.Day27.CRUD_Operation_for_Experiment.Dao.ConnectToDatabase;
import Week_7.Day27.CRUD_Operation_for_Experiment.Dao.Connectivity;
import com.mysql.cj.jdbc.CallableStatementWrapper;

import javax.swing.text.html.HTMLDocument;

public class CrudWorking implements Application_Operaions_CRUD{
    ConnectToDatabase connectToDatabase = new ConnectToDatabase();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public void insertData() throws Exception {
        PreparedStatement preparedStatement = connectToDatabase.connect().prepareStatement(
                "insert into experiment values(?, ?, ?, ?)");
        System.out.print("Enter your ID : ");
        int id = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Enter your name : ");
        String name = bufferedReader.readLine();
        System.out.print("Enter your Contact number : ");
        String phoneNumber1 = bufferedReader.readLine();
        System.out.print("Enter your address: ");
        String address = bufferedReader.readLine();
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,name);
        preparedStatement.setString(3,phoneNumber1);
        preparedStatement.setString(4,address);
        preparedStatement.executeUpdate();
        System.out.println("Your data has been added successfully");
    }

    @Override
    public void readData() {
        try {
            Statement statement = connectToDatabase.connect().createStatement();
            ResultSet resultSet = statement.executeQuery("select * from experiment");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + "   " + resultSet.getString(2) + "   "
                        + resultSet.getString(3) + "   " + resultSet.getString(4));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateData() throws Exception {
        System.out.println("Enter your ID : ");
        int userId = Integer.parseInt(bufferedReader.readLine());
        System.out.println("What do you want to update\n 1 --> name\n 2 --> contact number\n 3 --> address\n Enter: ");
        int choice = Integer.parseInt(bufferedReader.readLine());
        switch (choice){
            case 1:
                PreparedStatement preparedStatement = connectToDatabase.connect().prepareStatement(
                        "update experiment set name = ? where id = ?" );
                preparedStatement.setInt(2,userId);
                System.out.println("Enter your new name : ");
                String newName = bufferedReader.readLine();
                preparedStatement.setString(1,newName);
                preparedStatement.executeUpdate();
                System.out.println("Name updated");
                break;
            case 2:

                PreparedStatement preparedStatement2 = connectToDatabase.connect().prepareStatement(
                        "update experiment set contact_number = ? where id = ?" );
                System.out.println("Enter your new phone Number : ");
                String newPhoneNumber = bufferedReader.readLine();
                preparedStatement2.setString(1,newPhoneNumber);
                preparedStatement2.setInt(2,userId);
                preparedStatement2.executeUpdate();
                System.out.println("Phone number updated");
                break;
            case 3:
                PreparedStatement preparedStatement3 = connectToDatabase.connect().prepareStatement(
                        "update experiment set address = ? where id = ?" );
                preparedStatement3.setInt(2,userId);
                System.out.println("Enter your new address : ");
                String newAddress = bufferedReader.readLine();
                preparedStatement3.setString(1,newAddress);
                preparedStatement3.executeUpdate();
                System.out.println("Address updated");
                break;
        }

    }

    @Override
    public void deleteData() throws Exception {
        PreparedStatement preparedStatement = connectToDatabase.connect().prepareStatement(
                "delete from experiment where id = ?");
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(bufferedReader.readLine());
        preparedStatement.setInt(1,id);
        preparedStatement.executeUpdate();
    }
}

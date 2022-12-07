package Week_7.WeeklyTest.BookMAnagenment.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import Week_7.WeeklyTest.BookMAnagenment.src.DAO.SqlConnectivity;
import Week_7.WeeklyTest.BookMAnagenment.src.DAO.BookManagnenmentConnection;


public class BookMangenemntImplementation implements BookManagementMethods, BookManagnenmentConnection {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    Connection connection= SqlConnectivity.getMyConnection();
    public BookMangenemntImplementation() throws Exception {
    }

    @Override
    public void createRecord() throws Exception {

        PreparedStatement preparedStatement = connection.prepareStatement("insert into  weekly_test_bookManagenment values (?,?,?,?,?)");
        System.out.print("Enter the details: \nID: ");
        int id = Integer.parseInt(bufferedReader.readLine());
        System.out.print("Name: ");
        String name = bufferedReader.readLine();
        System.out.print("Publisher : ");
        String publisher = bufferedReader.readLine();
        System.out.print("Price : ");
        float price = Float.parseFloat(bufferedReader.readLine());
        System.out.print("Author : ");
        String author = bufferedReader.readLine();
        preparedStatement.setInt(1,id);
        preparedStatement.setString(2,name);
        preparedStatement.setString(3,publisher);
        preparedStatement.setFloat(4,price);
        preparedStatement.setString(5,author);
        System.out.println("Added successfully");
        preparedStatement.executeUpdate();
    }

    @Override
    public void retrieveRecords() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from weekly_test_bookManagenment");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " "
                    + resultSet.getString(3) + " " + resultSet.getFloat(4) + " " + resultSet.getString(5));
        }
    }

    @Override
    public void updateRecords() throws SQLException {
        try {

            System.out.print("What you want to edit : \n1 --> ID\n2 --> Name\n3 --> Publisher\n 4 --> price\n 5 --> author \nEnter:");
            int choice = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter your current ID : ");
            int currentId = Integer.parseInt(bufferedReader.readLine());
            String changeField = " ";
            PreparedStatement preparedStatement = connection.prepareStatement("Update  weekly_test_bookManagenment set "+ changeField +" = ? where id = ? ");
            preparedStatement.setInt(2,currentId);

            switch (choice){
                case 1:
                    System.out.print("Enter new Id : ");
                    changeField = "id";
                    preparedStatement.setInt(1,Integer.parseInt(bufferedReader.readLine()));
                    preparedStatement.executeUpdate();
                    break;

                case 2:
                    System.out.print("Enter new Name : ");
                    preparedStatement.setString(1,"name");
                    preparedStatement.setString(2, bufferedReader.readLine());
                    preparedStatement.executeUpdate();
                    break;

                case 3:
                    System.out.print("Enter new Publisher: ");
                    preparedStatement.setString(1,"publisher");
                    preparedStatement.setString(2,bufferedReader.readLine());
                    preparedStatement.executeUpdate();
                    break;

                case 4:
                    System.out.print("Enter new Price : ");
                    preparedStatement.setString(1,"price");
                    preparedStatement.setFloat(2, Float.parseFloat(bufferedReader.readLine()));
                    preparedStatement.executeUpdate();
                    break;
                case 5:
                    System.out.print("Enter new author : ");
                    preparedStatement.setString(1,"aurthor");
                    preparedStatement.setString(2, bufferedReader.readLine());
                    preparedStatement.executeUpdate();
                    break;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Updated successfully");
    }

    void sortByID() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from weekly_test_bookManagenment order by id");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " "
                    + resultSet.getString(3) + " " + resultSet.getFloat(4) + " " + resultSet.getString(5));
        }
    }

    void sortByPublisher() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from weekly_test_bookManagenment order by publisher");
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " "
                    + resultSet.getString(3) + " " + resultSet.getFloat(4) + " " + resultSet.getString(5));
        }
    }

    void sortByPublisherWiseAuthorBook() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select a.publisher, b.aurthor from weekly_test_bookManagenment a inner join weekly_test_bookManagenment b on a.id = b.id");
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
        }
    }


    @Override
    public void deleteRecords() throws IOException, SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement("Delete from weekly_test_bookManagenment where id = ?");
        System.out.print("Enter the ID you want to delete  :");
        int id = Integer.parseInt(bufferedReader.readLine());
        preparedStatement.setInt(1,id);
        preparedStatement.executeUpdate();
    }

}

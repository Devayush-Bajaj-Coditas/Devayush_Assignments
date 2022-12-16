package Week_7.Day27.CRUD_Operation_for_Experiment.Dao;

import java.sql.Connection;

public interface Connectivity {
    String DRIVERPATH = "com.mysql.cj.jdbc.Driver";
    String DATABASELINK = "jdbc:mysql://localhost:3306/day_27_jdbc";
    String USERNAME = "root";
    String PASSWOrD = "12345";
}

package Week_7.Day27.CRUD_Operation_for_Experiment.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectToDatabase {
    //Connection connection = null;
    public Connection connect() throws Exception {
        Class.forName(Connectivity.DRIVERPATH);
        Connection connection = DriverManager.getConnection(
                Connectivity.DATABASELINK, Connectivity.USERNAME, Connectivity.PASSWOrD);
        return connection;
    }
}

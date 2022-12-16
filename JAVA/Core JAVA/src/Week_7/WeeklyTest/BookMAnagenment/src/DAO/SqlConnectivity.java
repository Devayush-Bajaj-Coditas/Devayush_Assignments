package Week_7.WeeklyTest.BookMAnagenment.src.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class SqlConnectivity {
    public static Connection getMyConnection() throws Exception {
        Class.forName(BookManagnenmentConnection.DRIVERNAME);
        Connection connection = DriverManager.getConnection(BookManagnenmentConnection.PATH,
                BookManagnenmentConnection.USER,BookManagnenmentConnection.PASSWORD);
        return connection;
    }

    private SqlConnectivity(){
    }
}

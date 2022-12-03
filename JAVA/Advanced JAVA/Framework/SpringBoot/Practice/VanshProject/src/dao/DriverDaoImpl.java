package dao;

import entity.CabDriverEntity;
import utils.JdbcConnectionProvider;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DriverDaoImpl implements DriverDao{

    Connection connection = JdbcConnectionProvider.getDatabaseConnection();
    @Override
    public String registerDriver(CabDriverEntity cabDriverEntity) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "insert into TransportDriverDetails(location_Id,vehicle_category, available, driver_contact_no) values (" +
                        cabDriverEntity.getLocationId()+",'"+cabDriverEntity.getVehicleCategory()+"','"+cabDriverEntity +"','"
                        +cabDriverEntity.getVehicleStatus()+"',"+cabDriverEntity.getDriverContactNumber());

        System.out.println("insert into TransportDriverDetails(location_Id,vehicle_category, available, driver_contact_no) values (" +
                cabDriverEntity.getLocationId()+",'"+cabDriverEntity.getVehicleCategory()+"','"+cabDriverEntity +"','"
                +cabDriverEntity.getVehicleStatus()+"',"+cabDriverEntity.getDriverContactNumber());
    return "Cab driver registered successfully";
    }

    @Override
    public String searchDriver(int locationId) throws SQLException {
        static String QUERY = "select * from TransportDriverDetails "
    }
}

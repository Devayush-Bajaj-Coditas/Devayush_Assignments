package dao;

import entity.CabDriverEntity;
import utils.JdbcConnectionProvider;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DriverDaoImpl implements DriverDao {

    //Connection connection = JdbcConnectionProvider.getDatabaseConnection();

    @Override
    public String registerDriver(CabDriverEntity cabDriverEntity) {
        Connection connection = JdbcConnectionProvider.getDatabaseConnection();
        PreparedStatement preparedStatement = null;
        boolean isRegistered = false;
        try {
            preparedStatement = connection.prepareStatement("insert into TransportDriverDetails values(?, ?, ?, ?, ?)");
            preparedStatement.setInt(1, cabDriverEntity.getLocationId());
            preparedStatement.setString(2, cabDriverEntity.getVehicleNo());
            preparedStatement.setString(3, cabDriverEntity.getVehicleCategory());
            preparedStatement.setString(4, cabDriverEntity.getVehicleStatus().toLowerCase());
            preparedStatement.setLong(5, cabDriverEntity.getDriverContactNumber());
            preparedStatement.execute();
            return "Cab registered successfully";
        } catch (SQLException e) {
            return "cannot register cab";
        }
    }

    //1, 6, 7, 0, 5

    @Override
    public List<CabDriverEntity> searchDriver(int locationId) {
        Connection connection = JdbcConnectionProvider.getDatabaseConnection();
        try {
            List<CabDriverEntity> nearestCabs = new ArrayList<>();
            List<CabDriverEntity> cabDrivers = new ArrayList<>();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from TransportDriverDetails where available = 'yes'");
            while (resultSet.next()) {
                CabDriverEntity cabDriver = new CabDriverEntity();
                cabDriver.setLocationId(resultSet.getInt(1));
                cabDriver.setVehicleNo(resultSet.getString(2));
                cabDriver.setVehicleCategory(resultSet.getString(3));
                cabDriver.setVehicleStatus(resultSet.getString(4));
                cabDriver.setDriverContactNumber(resultSet.getLong(5));
                cabDrivers.add(cabDriver);
            }
            CabDriverEntity car = getNearestCab(cabDrivers.stream().filter(cab -> cab.getVehicleCategory()
                    .equalsIgnoreCase("Car")).collect(Collectors.toList()), locationId);
            CabDriverEntity auto = getNearestCab(cabDrivers.stream().filter(cab -> cab.getVehicleCategory()
                    .equalsIgnoreCase("Auto")).collect(Collectors.toList()), locationId);
            CabDriverEntity bike = getNearestCab(cabDrivers.stream().filter(cab -> cab.getVehicleCategory()
                    .equalsIgnoreCase("Bike")).collect(Collectors.toList()), locationId);

            nearestCabs.add(car);
            nearestCabs.add(auto);
            nearestCabs.add(bike);

            return nearestCabs;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private CabDriverEntity getNearestCab(List<CabDriverEntity> cabs, int locationId) {
        Connection connection = JdbcConnectionProvider.getDatabaseConnection();
        int nearestDistance = Integer.MAX_VALUE;
        CabDriverEntity nearestCab = null;
        for (CabDriverEntity cabDriver : cabs) {
            int individualDistance = Math.abs(cabDriver.getLocationId() - locationId) ^ 2;
            if (individualDistance <= nearestDistance) {
                nearestCab = cabDriver;
                nearestDistance = individualDistance;
            }
        }
        return nearestCab;
    }
}
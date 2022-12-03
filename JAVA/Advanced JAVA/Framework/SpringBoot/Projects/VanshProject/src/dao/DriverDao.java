package dao;

import entity.CabDriverEntity;

import java.sql.SQLException;

public interface DriverDao {
    public String registerDriver(CabDriverEntity cabDriverEntity) throws SQLException;

    public String searchDriver (int locationId) throws SQLException;
}

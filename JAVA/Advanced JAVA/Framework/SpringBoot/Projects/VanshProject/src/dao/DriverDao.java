package dao;

import entity.CabDriverEntity;

import java.sql.SQLException;
import java.util.List;

public interface DriverDao {
    public String registerDriver(CabDriverEntity cabDriverEntity);
    public List<CabDriverEntity> searchDriver (int locationId);
}

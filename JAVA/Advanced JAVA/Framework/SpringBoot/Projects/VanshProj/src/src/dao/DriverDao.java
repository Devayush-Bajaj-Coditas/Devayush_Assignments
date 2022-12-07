package src.dao;

import src.entity.CabDriverEntity;

import java.util.List;

public interface DriverDao {


    String registerDriver(CabDriverEntity cabDriverEntity);

    public List<CabDriverEntity> searchDriver (int locationId);

    CabDriverEntity getNearestCab(List<CabDriverEntity> cabs, int locationId);
}

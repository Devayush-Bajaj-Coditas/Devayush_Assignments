package com.example.StudentAPI.services;

import com.example.StudentAPI.dao.DaoDetails;
import com.example.StudentAPI.dao.DaoImplimentation;
import com.example.StudentAPI.entities.ContributorEntities;
import com.example.StudentAPI.entities.ContributorList;
import jdk.nashorn.internal.runtime.RecompilableScriptFunctionData;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContributorImplementation implements ContributorServices{
    @Override
    public List<ContributorList> fetchNameAndId() {
        Connection connection = DaoImplimentation.getConnection();
        List<ContributorList> contributorLists= new ArrayList<ContributorList>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from Contributors");
            while(resultSet.next()){
                ContributorList contributorList = new ContributorList();
                contributorList.setId(resultSet.getInt(1));
                contributorList.setContributorName(resultSet.getString(2));
                contributorLists.add(contributorList);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return contributorLists;
    }

    @Override
    public ContributorEntities fetchAll(int id) {
        Connection connection = DaoImplimentation.getConnection();

        return null;
    }
}

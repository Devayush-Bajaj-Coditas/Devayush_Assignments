package com.NgoApi.NgoAPI.dao;

import com.NgoApi.NgoAPI.model.Contributor;
import com.NgoApi.NgoAPI.model.ContributorList;
import org.springframework.stereotype.Service;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ContributorDaoImplementation implements ContributorDao{

    @Override
    public List<ContributorList> getContributorNames() {
        List<ContributorList> contributorNames = new ArrayList<>();
        final String QUERY = "select name, contrubutor_id, profile_pic from ngocontributors";
        try {
            PreparedStatement preparedStatement = GetConnection.connection().prepareStatement(QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                ContributorList contributorList = new ContributorList();
                contributorList.setName(resultSet.getString(1));
                contributorList.setContributorId(resultSet.getInt(2));
                contributorList.setProfilePicture(resultSet.getString(3));
                contributorNames.add(contributorList);
            }

        }catch (Exception e){System.out.println(e.getMessage());}
        return contributorNames;
    }


    @Override
    public Contributor getContributorDetails(int id) {
        final String QUERY = "select * from ngocontributors where contrubutor_id = " + id ;
        Contributor contributor = new Contributor();
        try {
            PreparedStatement preparedStatement = GetConnection.connection().prepareStatement(QUERY);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                contributor.setContributorId(resultSet.getInt(1));
                contributor.setName(resultSet.getString(2));
                contributor.setEmail(resultSet.getString(3));
                contributor.setPhoneNumber(resultSet.getLong(4));
                contributor.setAddress(resultSet.getString(5));
                contributor.setOccupation(resultSet.getString(6));
                contributor.setContributionAmt(resultSet.getInt(7));
                contributor.setContributingSince(resultSet.getString(8));
                contributor.setProfilePicture(resultSet.getString(9));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return contributor;
    }
}

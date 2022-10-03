package com.NgoApi.NgoAPI.dao;

import com.NgoApi.NgoAPI.model.Contributor;
import com.NgoApi.NgoAPI.model.ContributorList;

import java.util.List;

public interface ContributorDao {
    public List<ContributorList> getContributorNames();
    public Contributor getContributorDetails(int id);
}

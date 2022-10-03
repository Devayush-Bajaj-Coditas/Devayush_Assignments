package com.example.StudentAPI.services;

import com.example.StudentAPI.entities.ContributorEntities;
import com.example.StudentAPI.entities.ContributorList;

import java.util.List;

public interface ContributorServices {

    public List<ContributorList> fetchNameAndId();

    public ContributorEntities fetchAll(int id);


}

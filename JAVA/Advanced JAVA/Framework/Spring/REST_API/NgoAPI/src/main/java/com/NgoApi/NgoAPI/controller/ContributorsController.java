package com.NgoApi.NgoAPI.controller;


import com.NgoApi.NgoAPI.dao.ContributorDao;
import com.NgoApi.NgoAPI.model.Contributor;
import com.NgoApi.NgoAPI.model.ContributorList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContributorsController {
    @Autowired
    private ContributorDao contributorDao;

    @GetMapping("/names")
    public List<ContributorList> getName(){
        return contributorDao.getContributorNames();
    }

    @GetMapping("/names/{contributorId}")
    public Contributor getContributorDetails(@PathVariable int contributorId){
        return contributorDao.getContributorDetails(contributorId);
    }

}

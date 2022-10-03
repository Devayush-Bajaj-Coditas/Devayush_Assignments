package controller;

import exception.ResourceNotFoundException;
import model.Contributor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import repository.ContributorRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1") //v1 - API coming from rest v1
public class ContributorController {
    @Autowired
    private ContributorRepository contributorRepository;

    //Create new contributor
    @PostMapping("/newContributor")        //used to create post request
    public Contributor createContributor(@Validated @RequestBody Contributor contributor){         //@RequestBody converts JSON object into java object
        return contributorRepository.save(contributor);
    }


    //get contributor details by ID
    @GetMapping("contributors/{id}")
        public ResponseEntity<Contributor> getEmployeeById(@PathVariable(value = "contributorId")long contributorId) throws ResourceNotFoundException {
        Contributor contributor = null;
        contributor = contributorRepository.findById(contributorId).orElseThrow (() -> new ResourceNotFoundException("Contributor not found for this id :: " + contributorId ));
        return ResponseEntity.ok().body(contributor);

    }
    @GetMapping("/getAllContributors")
    public List <Contributor> getAllContributors(){
        List<Contributor> allContributors = new ArrayList<>();
        contributorRepository.findAll().forEach(contributor -> allContributors.add(contributor));
        return allContributors;
    }
}

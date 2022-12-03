package com.devayush.JunitPractice.controller;

import com.devayush.JunitPractice.model.dto.request.LoginDto;
import com.devayush.JunitPractice.model.dto.request.PersonRegisterRequestDto;
import com.devayush.JunitPractice.repository.PersonEntityInfo;
import com.devayush.JunitPractice.repository.PersonRepository;
import com.devayush.JunitPractice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class personController {
    @Autowired
    PersonService personService;

    @Autowired
    PersonRepository personRepository;

    @PostMapping("/addPerson")
    public ResponseEntity addPerson(@RequestBody PersonRegisterRequestDto personEntity){
        return new ResponseEntity(Optional.of(personService.addPerson(personEntity)), HttpStatus.CREATED);
    }

    @GetMapping("/getAllPersons")
    public ResponseEntity getAllPersons(){
        return new ResponseEntity(Optional.of(personService.fetchAllPersons()),HttpStatus.OK);
    }
    @GetMapping("/checkById/{id}")
    public ResponseEntity checkById(@PathVariable int id){
        return new ResponseEntity(Optional.of(personService.checkIfExist(id)).orElseThrow(null),HttpStatus.OK);
    }

    @GetMapping("/findNames/{name}")
    public List<PersonEntityInfo> getAllNames(@PathVariable String name){
        return personRepository.findAllNames(name);
    }


    @GetMapping("/login")
    public ResponseEntity login(@RequestBody LoginDto loginDto){
        return new ResponseEntity(Optional.of(personService.login(loginDto)),HttpStatus.OK);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity deletePerson (@PathVariable int id){
        try {

            return new ResponseEntity(Optional.of(personService.deletePerson(id)), HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}

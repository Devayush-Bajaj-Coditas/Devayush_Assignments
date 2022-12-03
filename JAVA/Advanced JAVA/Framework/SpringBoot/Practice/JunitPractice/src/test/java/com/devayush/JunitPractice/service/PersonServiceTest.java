package com.devayush.JunitPractice.service;

import com.devayush.JunitPractice.repository.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)  //--> it automatically creates ,opens and closes the mockito object
class PersonServiceTest {


    //TO test the service layer we need repository which creates fake database for testing purpose. This is done by using MOKITO library.

    @Mock // will create mimic of database
    private PersonRepository personRepository;


    private PersonService personService;


    @BeforeEach
    void setUp(){
        this.personService = new PersonService(this.personRepository);      //just inserting dummy data into the repository
    }
    //We are just comparing findAll method in repository as well as service layer
    @Test
    void fetchAllPerson() {
        personService.fetchAllPersons();        //comparing and verifying both the data
        verify(personRepository).findAll();
    }


}
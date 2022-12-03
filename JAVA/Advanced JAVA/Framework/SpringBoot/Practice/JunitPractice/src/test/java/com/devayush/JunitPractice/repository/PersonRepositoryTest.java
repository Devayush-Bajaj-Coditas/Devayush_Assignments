package com.devayush.JunitPractice.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
@SpringBootTest
class PersonRepositoryTest {


    @Autowired
    private PersonRepository personRepository;

    @Test
    void findIfExist() {
        Boolean actualResult = personRepository.findIfExist(1);
        assertThat(actualResult).isTrue();


    }
}
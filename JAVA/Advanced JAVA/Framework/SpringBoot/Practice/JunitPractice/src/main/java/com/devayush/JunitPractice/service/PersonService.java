package com.devayush.JunitPractice.service;


import com.devayush.JunitPractice.entity.PersonEntity;
import com.devayush.JunitPractice.exception.UserNotFound;
import com.devayush.JunitPractice.model.dto.request.LoginDto;
import com.devayush.JunitPractice.model.dto.request.PersonRegisterRequestDto;
import com.devayush.JunitPractice.repository.PersonRepository;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.extension.ExtendWith;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    @Autowired
    ModelMapper modelMapper;

    public PersonService(PersonRepository personRepository) {

    }


    public PersonEntity login(LoginDto loginDto){
            PersonEntity person = personRepository.findByEmailIgnoreCaseAndPassword(loginDto.getEmail(), loginDto.getPassword()).orElseThrow(()->new UserNotFound("User not found"));
            return person;
        }

    public PersonEntity addPerson(PersonRegisterRequestDto personEntity) {
        PersonEntity personEntity1 = this.modelMapper.map(personEntity, PersonEntity.class);
        return personRepository.save(personEntity1);
    }

    public List<PersonEntity> fetchAllPersons() {
        return personRepository.findAll();
    }

    public boolean checkIfExist(int id){
        return personRepository.findIfExist(id);
    }


    public String deletePerson(int id){
        personRepository.deleteById(id);
        return "Deleted success";

    }

}

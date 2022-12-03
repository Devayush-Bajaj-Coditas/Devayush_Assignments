package com.devayush.JunitPractice.repository;

import com.devayush.JunitPractice.entity.PersonEntity;
import dto.PersonNameWithNumber;
import org.hibernate.annotations.Parameter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<PersonEntity , Integer> {


    @Query(value = "select (count(student) > 0) from PersonEntity student where student.rollNumber = ?1")
    boolean findIfExist (int rollNumber);


    @Query("select p from PersonEntity p where p.name like ?1")
    List<PersonEntityInfo> findAllNames(String name);


    @Query("select p from PersonEntity p where upper(p.email) = upper(?1)")
    Optional<PersonEntity> findByEmailIgnoreCase(String email);

    @Query("select p from PersonEntity p where upper(p.email) = upper(?1) and p.password = ?2")
    Optional<PersonEntity> findByEmailIgnoreCaseAndPassword(String email, String password);










}


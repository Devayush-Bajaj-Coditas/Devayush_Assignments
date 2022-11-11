package com.devayush.dataInsertionInOneToMany.repository;

import com.devayush.dataInsertionInOneToMany.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}

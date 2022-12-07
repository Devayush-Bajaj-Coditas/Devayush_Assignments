package com.devayush.pagingAndSorting.repository;

import com.devayush.pagingAndSorting.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    @Query("select p from Product p where p.productPrice > ?1")
    List<Product> sortByPrice(int productPrice);

    @Query("select p from Product p where p.productPrice > ?1 order by p.productPrice")
    List<Product> filterByPriceAndSort(int productPrice);



}

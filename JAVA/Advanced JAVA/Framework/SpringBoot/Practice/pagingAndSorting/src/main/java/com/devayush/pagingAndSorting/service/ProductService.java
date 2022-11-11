package com.devayush.pagingAndSorting.service;

import com.devayush.pagingAndSorting.entity.Product;
import com.devayush.pagingAndSorting.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    @PostConstruct
    public void insertDataIntoDB(){
        List<Product> productList = IntStream.rangeClosed(1,200)
                .mapToObj(i -> new Product("product " + i,new Random().nextInt(5000))).
                collect(Collectors.toList());
                productRepository.saveAll(productList);

    }
    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }


    public List<Product> findProductsWithSorting(String field){
        return productRepository.findAll(Sort.by(Sort.Direction.ASC,field));
    }

    public Page<Product> paginateData(int page, int pageSize){
        return productRepository.findAll(PageRequest.of(page, pageSize));
    }

    public Page<Product> sortAndPaginateProducts(int page, int pageSize, String field){
        return productRepository.findAll(PageRequest.of(page,pageSize).withSort(Sort.by(Sort.Direction.ASC,field)));
    }
}

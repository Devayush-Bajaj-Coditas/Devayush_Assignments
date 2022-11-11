package com.devayush.dataInsertionInOneToMany.controller;

import com.devayush.dataInsertionInOneToMany.entity.Product;
import com.devayush.dataInsertionInOneToMany.model.dto.RegisterProductDto;
import com.devayush.dataInsertionInOneToMany.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;


    @PostMapping("/register")
    public Product registerProduct(@RequestBody RegisterProductDto registerProductDto){
        return productService.registerProduct(registerProductDto);
    }
}
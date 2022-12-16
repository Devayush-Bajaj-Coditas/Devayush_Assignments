package com.devayush.productservice.controller;

import com.devayush.productservice.model.dto.request.ProductRequestDto;
import com.devayush.productservice.model.dto.response.ProductResponseDto;
import com.devayush.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {


    @Autowired
    ProductService productService;

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequestDto productRequestDto){
        productService.createProduct(productRequestDto);
    }


    @GetMapping("/products")
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponseDto> getAllProducts(){
        return productService.getAllProducts();
    }

}

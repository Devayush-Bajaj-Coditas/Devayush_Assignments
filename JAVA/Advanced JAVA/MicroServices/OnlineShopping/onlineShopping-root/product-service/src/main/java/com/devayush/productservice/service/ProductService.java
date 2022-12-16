package com.devayush.productservice.service;

import com.devayush.productservice.entity.ProductEntity;
import com.devayush.productservice.model.dto.request.ProductRequestDto;
import com.devayush.productservice.model.dto.response.ProductResponseDto;
import com.devayush.productservice.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public void createProduct (ProductRequestDto productRequestDto){
        ProductEntity product = ProductEntity.builder()
                .name(productRequestDto.getName())
                .price(productRequestDto.getPrice())
                .description(productRequestDto.getDescription()).build();
        productRepository.save(product);

        log.info("Product {} saved",product.getId());
    }

    public List<ProductResponseDto> getAllProducts(){
        List<ProductEntity> products = productRepository.findAll();
        return products.stream().map(productEntity -> mapToProductResponse(productEntity)).collect(Collectors.toList());
    }

    private ProductResponseDto mapToProductResponse (ProductEntity product){
        return ProductResponseDto.builder().id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .description(product.getDescription()).build();
    }


}




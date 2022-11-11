package com.devayush.dataInsertionInOneToMany.service;


import com.devayush.dataInsertionInOneToMany.entity.Product;
import com.devayush.dataInsertionInOneToMany.model.dto.RegisterProductDto;
import com.devayush.dataInsertionInOneToMany.repository.CategoryRepository;
import com.devayush.dataInsertionInOneToMany.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    Product product;

    public Product registerProduct(RegisterProductDto productDto){
        product.setProductName(productDto.getProductName());
        product.setCategory(categoryRepository.findById(productDto.getProductCategoryId()).orElse(null));
        product.setProductPrice(productDto.getProductPrice());
        return productRepository.save(product);
    }
}

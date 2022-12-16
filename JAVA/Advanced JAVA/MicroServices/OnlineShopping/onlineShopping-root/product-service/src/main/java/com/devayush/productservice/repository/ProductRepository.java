package com.devayush.productservice.repository;

import com.devayush.productservice.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {
}

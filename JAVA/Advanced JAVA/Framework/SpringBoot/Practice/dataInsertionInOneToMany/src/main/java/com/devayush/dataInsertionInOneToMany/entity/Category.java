package com.devayush.dataInsertionInOneToMany.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;
@Data
@Component
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int categoryId;
    String categoryName;

    @OneToMany(mappedBy = "category")
    List<Product> productList;
}

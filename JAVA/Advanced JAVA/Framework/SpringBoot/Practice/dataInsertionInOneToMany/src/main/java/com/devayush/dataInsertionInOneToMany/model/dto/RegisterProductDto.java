package com.devayush.dataInsertionInOneToMany.model.dto;

import lombok.Data;
import org.springframework.stereotype.Component;
@Data
@Component
public class RegisterProductDto {
    String productName;
    float productPrice;
    int productCategoryId;

}

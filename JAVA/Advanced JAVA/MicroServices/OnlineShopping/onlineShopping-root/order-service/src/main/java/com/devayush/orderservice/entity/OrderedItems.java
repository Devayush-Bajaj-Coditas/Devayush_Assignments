package com.devayush.orderservice.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name = "ordered_items_ShoppingApp")
public class OrderedItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemId;
    private String skuCode;
    private Integer quantity;
    private BigDecimal price;


    public OrderedItems(String skuCode, Integer quantity, BigDecimal price) {
        this.skuCode = skuCode;
        this.quantity = quantity;
        this.price = price;
    }
}
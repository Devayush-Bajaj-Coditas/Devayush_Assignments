package com.devayush.inventoryservice.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Inventory_ShoppingApp")
public class InventoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private Integer quantity;

}

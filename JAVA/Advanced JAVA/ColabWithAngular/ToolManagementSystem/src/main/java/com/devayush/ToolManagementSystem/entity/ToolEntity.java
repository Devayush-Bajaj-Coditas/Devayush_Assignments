package com.devayush.ToolManagementSystem.entity;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
@ToString
@Entity
public class ToolEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int toolId;
    String toolName;
    float toolSize;
    float toolPrice;
    int toolQuantity;
    @ManyToMany
    List<OrderEntity> toolsOrder;       //multiple tools present in multiple orders


}

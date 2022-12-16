package com.devayush.orderservice.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequestDto {
    private Long ordersId;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}

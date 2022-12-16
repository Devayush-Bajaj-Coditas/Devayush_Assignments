package com.devayush.orderservice.model.dto.request;

import com.devayush.orderservice.entity.OrderedItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemsRequestDto {
    private List<OrderRequestDto> requestDtos;
}

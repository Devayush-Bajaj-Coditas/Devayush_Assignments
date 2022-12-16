package com.devayush.orderservice.service;

import com.devayush.orderservice.entity.OrderEntity;
import com.devayush.orderservice.entity.OrderedItems;
import com.devayush.orderservice.model.dto.request.OrderItemsRequestDto;
import com.devayush.orderservice.repository.OrderEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
@Service
@RequiredArgsConstructor
@Transactional
public class OrderService {

    @Autowired
    OrderEntityRepository orderEntityRepository;

    public void placeOrder(OrderItemsRequestDto orderItemsRequestDto) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderNumber(UUID.randomUUID().toString());
        List<OrderedItems> list = orderItemsRequestDto.getRequestDtos().stream().map(order -> new OrderedItems(
                order.getSkuCode(),
                order.getQuantity(),
                order.getPrice()
        )).collect(Collectors.toList());
        orderEntity.setOrderedItemsList(list);
        orderEntityRepository.save(orderEntity);
    }
}
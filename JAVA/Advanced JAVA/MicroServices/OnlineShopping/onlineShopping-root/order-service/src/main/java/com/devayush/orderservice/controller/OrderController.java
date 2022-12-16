package com.devayush.orderservice.controller;


import com.devayush.orderservice.model.dto.request.OrderItemsRequestDto;
import com.devayush.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {

    @Autowired
    private final OrderService orderService;

    @PostMapping("/placeOrder")
    @ResponseStatus(HttpStatus.CREATED)
    public void placeOrder (@RequestBody OrderItemsRequestDto orderItemsRequestDto){
        orderService.placeOrder(orderItemsRequestDto);
    }
}

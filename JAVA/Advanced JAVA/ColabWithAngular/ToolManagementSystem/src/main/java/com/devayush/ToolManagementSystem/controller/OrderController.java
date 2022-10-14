package com.devayush.ToolManagementSystem.controller;


import com.devayush.ToolManagementSystem.entity.OrderEntity;
import com.devayush.ToolManagementSystem.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class OrderController {
    OrderService orderService;

    @RequestMapping(value = "/addOrder", consumes = "application/JSON")
    public OrderEntity saveOrder(@RequestBody OrderEntity order){
        return orderService.saveOrder(order);
    }

    @GetMapping("/allOrders")
    public List<OrderEntity>getAllOrders(){
        return orderService.getAllOrders();
    }

    @PutMapping("/allOrders/update")
    public OrderEntity updateOrder (OrderEntity newOrderUpdate){
        return orderService.updateOrder(newOrderUpdate);
    }

    @DeleteMapping("/allOrders/delete/{id}")
    public String deleteOrder(@PathVariable int id){
        return orderService.deleteOrder(id);
    }

}

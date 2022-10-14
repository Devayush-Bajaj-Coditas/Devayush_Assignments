package com.devayush.ToolManagementSystem.service;

import com.devayush.ToolManagementSystem.entity.OrderEntity;
import com.devayush.ToolManagementSystem.repository.OrderRepository;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    public OrderRepository orderRepository;

    public OrderEntity saveOrder(OrderEntity order){
        return orderRepository.save(order);
    }

    public List<OrderEntity> getAllOrders(){
        return orderRepository.findAll();
    }

    public String deleteOrder(int id){
        orderRepository.deleteById(id);
        return "Deleted successfully";
    }

    public OrderEntity updateOrder(OrderEntity updatedOrder){
    OrderEntity existingOrder = orderRepository.findById(updatedOrder.getOrderId()).orElse(null);
    existingOrder.setOrderStatus(updatedOrder.getOrderStatus());
    existingOrder.setOrderTools(updatedOrder.getOrderTools());
    existingOrder.setOrderWorker(updatedOrder.getOrderWorker());
    existingOrder.setOrderCustomerName(updatedOrder.getOrderCustomerName());

    return orderRepository.save(existingOrder);

    }


}

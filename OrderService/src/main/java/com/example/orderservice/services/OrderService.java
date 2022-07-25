package com.example.orderservice.services;

import com.example.orderservice.model.Order;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<Order> getAllOrders();
    Optional<Order> getOrderById(Long id);
    ResponseEntity<Order> createOrder(Order order);
    ResponseEntity<String> updateOrder(Order order);
    ResponseEntity<String> deleteOrder(Long id);
}

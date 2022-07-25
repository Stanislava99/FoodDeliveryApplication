package com.example.orderservice.services.impl;

import com.example.orderservice.model.Order;
import com.example.orderservice.repo.OrderRepository;
import com.example.orderservice.services.OrderService;
import com.example.orderservice.services.exceptions.OrderNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    @Override
    public ResponseEntity<Order> createOrder(Order order) {
        return ResponseEntity.ok(orderRepository.save(order));
    }

    @Override
    public ResponseEntity<String> updateOrder(Order order) {
        if (orderRepository.findById(order.getOrderId()).isPresent()){
            return new ResponseEntity<>("Order updated", HttpStatus.OK);
        }
        return new ResponseEntity<>(new OrderNotFoundException().toString(),HttpStatus.BAD_REQUEST);
    }

    @Override
    public ResponseEntity<String> deleteOrder(Long id) {
        if (orderRepository.findById(id).isPresent()){
            orderRepository.deleteById(id);
            return new ResponseEntity<>("Order successfully deleted", HttpStatus.OK);
        }
        return new ResponseEntity<>(new OrderNotFoundException().toString(),HttpStatus.BAD_REQUEST);
    }
}

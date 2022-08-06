package com.example.orderservice.controllers;


import com.example.orderservice.model.Order;
import com.example.orderservice.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/all")
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Optional<Order> getOrderById(@PathVariable Long id){
        return orderService.getOrderById(id);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Order> createOrder(@RequestBody Order order){
        return orderService.createOrder(order);
    }

    @PostMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> updateOrder(@RequestBody Order order, @PathVariable Long id){
        return orderService.updateOrder(order, id);
    }



}

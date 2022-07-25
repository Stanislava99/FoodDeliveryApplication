package com.example.orderservice.services.exceptions;

import org.springframework.http.HttpStatus;

public class OrderNotFoundException extends Exception{
    public OrderNotFoundException() {
        super("Order Not Found");
    }
}

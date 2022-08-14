package com.example.restaurantservice.services.exceptions;

public class ItemNotFoundException extends Exception{
    public ItemNotFoundException() {
        super("Menu Item Not Found");
    }
}

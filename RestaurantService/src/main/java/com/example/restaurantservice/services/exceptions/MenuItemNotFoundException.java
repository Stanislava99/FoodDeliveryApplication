package com.example.restaurantservice.services.exceptions;

public class MenuItemNotFoundException extends Exception{
    public MenuItemNotFoundException() {
        super("Menu Item Not Found");
    }
}

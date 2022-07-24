package com.example.restaurantservice.services.exceptions;


public class RestaurantNotFoundException extends Exception{
    public RestaurantNotFoundException() {
        super("Restaurant doesn't exist");
    }
}

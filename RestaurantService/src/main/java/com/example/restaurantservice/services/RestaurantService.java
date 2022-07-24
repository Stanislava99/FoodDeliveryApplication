package com.example.restaurantservice.services;

import com.example.restaurantservice.models.Restaurant;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface RestaurantService {
    List<Restaurant> getAllRestaurants();
    Optional<Restaurant> getRestaurantById(Long restaurantId);
    ResponseEntity<Restaurant> addRestaurant (Restaurant restaurant);
    void addRestaurants(List<Restaurant> restaurants);
    ResponseEntity<String> deleteRestaurantById(Long restaurantId);
}

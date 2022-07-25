package com.example.restaurantservice.services.impl;

import com.example.restaurantservice.models.Restaurant;
import com.example.restaurantservice.repos.MenuItemRepository;
import com.example.restaurantservice.repos.RestaurantRepository;
import com.example.restaurantservice.services.RestaurantService;
import com.example.restaurantservice.services.exceptions.RestaurantNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    RestaurantRepository restaurantRepository;
    @Autowired
    MenuItemRepository menuItemRepository;

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    @Override
    public Optional<Restaurant> getRestaurantById(Long restaurantId) {
        return restaurantRepository.findById(restaurantId);
    }

    @Override
    public ResponseEntity<Restaurant> addRestaurant(Restaurant restaurant) {
        return ResponseEntity.ok(restaurantRepository.save(restaurant));
    }

    @Override
    public void addRestaurants(List<Restaurant> restaurants) {
        restaurantRepository.saveAll(restaurants);
    }

    @Override
    public ResponseEntity<String> deleteRestaurantById(Long restaurantId) {
        if (restaurantRepository.findById(restaurantId).isPresent()) {
            restaurantRepository.deleteById(restaurantId);
            menuItemRepository.deleteAll(menuItemRepository.getAllByRestaurantId(restaurantId));
            return new ResponseEntity<>("Restaurant with all its items deleted successfully", HttpStatus.OK);
        }
        return new ResponseEntity<>(new RestaurantNotFoundException().toString(), HttpStatus.BAD_REQUEST);
    }
}

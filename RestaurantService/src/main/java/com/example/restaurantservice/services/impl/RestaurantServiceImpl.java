package com.example.restaurantservice.services.impl;

import com.example.restaurantservice.models.Restaurant;
import com.example.restaurantservice.repos.ItemRepository;
import com.example.restaurantservice.repos.RestaurantRepository;
import com.example.restaurantservice.services.RestaurantService;
import com.example.restaurantservice.services.exceptions.RestaurantNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    RestaurantRepository restaurantRepository;
    @Autowired
    ItemRepository itemRepository;

    @Override
    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    @Override
    public Optional<Restaurant> getRestaurantById(Long restaurantId) {
        return restaurantRepository.findById(restaurantId);
    }

    @Override
    public Restaurant addRestaurant(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }

    @Override
    public ResponseEntity<String> deleteRestaurantById(Long restaurantId) {
        if (restaurantRepository.findById(restaurantId).isPresent()) {
            restaurantRepository.deleteById(restaurantId);
            itemRepository.deleteAll(itemRepository.findAll().stream().filter(item -> item.getRestaurant().getRestaurantId().equals(restaurantId)).collect(Collectors.toList()));
            return new ResponseEntity<>("Restaurant with all its items deleted successfully", HttpStatus.OK);
        }
        return new ResponseEntity<>(new RestaurantNotFoundException().toString(), HttpStatus.BAD_REQUEST);
    }
}

package com.example.restaurantservice.controllers;

import com.example.restaurantservice.models.Restaurant;
import com.example.restaurantservice.services.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/restaurant")
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;

    @GetMapping("/all")
    public List<Restaurant> getAllRestaurants(){
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("/{id}")
    public Optional<Restaurant> getRestaurantById(@PathVariable Long id){
        return restaurantService.getRestaurantById(id);
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Restaurant> addRestaurant(@RequestBody Restaurant restaurant){
        return restaurantService.addRestaurant(restaurant);
    }

    @PostMapping("/add/list")
    @ResponseStatus(HttpStatus.CREATED)
    public void addRestaurants(@RequestBody List<Restaurant> restaurants) {
        restaurantService.addRestaurants(restaurants);
    }

    @DeleteMapping("/delete-{id}")
    public ResponseEntity<String> deleteRestaurantById(@PathVariable Long id){
        return restaurantService.deleteRestaurantById(id);
    }

}

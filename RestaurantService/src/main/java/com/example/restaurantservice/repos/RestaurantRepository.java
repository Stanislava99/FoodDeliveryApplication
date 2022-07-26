package com.example.restaurantservice.repos;

import com.example.restaurantservice.models.Item;
import com.example.restaurantservice.models.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {


}

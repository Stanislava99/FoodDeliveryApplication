package com.example.restaurantservice.services;

import com.example.restaurantservice.models.MenuItem;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface MenuService {
    List<MenuItem> getAllMenuItems();
    List<MenuItem> getMenuItemsByRestaurant (Long restaurantId);
    Optional<MenuItem> getManuItem(Long itemId);
    ResponseEntity<MenuItem> addMenuItem(MenuItem menuItem);
    void addMenuItems(List<MenuItem> menuItems);
    ResponseEntity<String> deleteMenuItemById(Long menuItemId);
}

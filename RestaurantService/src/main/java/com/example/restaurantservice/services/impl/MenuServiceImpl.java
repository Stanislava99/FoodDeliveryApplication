package com.example.restaurantservice.services.impl;

import com.example.restaurantservice.models.MenuItem;
import com.example.restaurantservice.repos.MenuItemRepository;
import com.example.restaurantservice.services.MenuService;
import com.example.restaurantservice.services.exceptions.MenuItemNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    protected MenuItemRepository menuItemRepository;

    @Override
    public List<MenuItem> getAllMenuItems (){
        return menuItemRepository.findAll();
    }

    @Override
    public List<MenuItem> getMenuItemsByRestaurant(Long restaurantId) {
        return menuItemRepository.getAllByRestaurantId(restaurantId);
    }

    @Override
    public Optional<MenuItem> getManuItem(Long itemId) {
        return menuItemRepository.findById(itemId);
    }

    @Override
    public ResponseEntity<MenuItem> addMenuItem(MenuItem menuItem) {
        return ResponseEntity.ok(menuItemRepository.save(menuItem));
    }

    @Override
    public void addMenuItems(List<MenuItem> menuItems) {
        menuItemRepository.saveAll(menuItems);
    }

    @Override
    public ResponseEntity<String> deleteMenuItemById(Long menuItemId) {
        if (menuItemRepository.findById(menuItemId).isPresent()){
            menuItemRepository.deleteById(menuItemId);
            return new ResponseEntity<>("Menu item deleted successfully", HttpStatus.OK);
        }
        return new ResponseEntity<>(new MenuItemNotFoundException().toString(),HttpStatus.BAD_REQUEST);
    }
}

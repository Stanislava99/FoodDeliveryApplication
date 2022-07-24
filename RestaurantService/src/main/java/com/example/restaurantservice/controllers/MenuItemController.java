package com.example.restaurantservice.controllers;

import com.example.restaurantservice.models.MenuItem;
import com.example.restaurantservice.models.Restaurant;
import com.example.restaurantservice.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/menu")
public class MenuItemController {
    @Autowired
    MenuService menuService;

    @GetMapping
    public List<MenuItem> getAllMenuItems(){
       return menuService.getAllMenuItems();
    }

    @GetMapping("/restaurant-{restaurantId}")
    public List<MenuItem> getMenuItemsByRestaurant (@PathVariable Long restaurantId){
        return menuService.getMenuItemsByRestaurant(restaurantId);
    }

    @PostMapping("/item-{itemId}")
    @ResponseStatus(HttpStatus.CREATED)
    public Optional<MenuItem> getManuItem(@PathVariable Long itemId){
        return menuService.getManuItem(itemId);
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<MenuItem> addMenuItem(@RequestBody MenuItem menuItem){
        return menuService.addMenuItem(menuItem);
    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addMenuItems(@RequestBody List<MenuItem> menuItems){
        menuService.addMenuItems(menuItems);
    }

    @DeleteMapping("/delete-{menuItemId}")
    ResponseEntity<String> deleteMenuItemById(@PathVariable Long menuItemId){
        return menuService.deleteMenuItemById(menuItemId);
    }
}

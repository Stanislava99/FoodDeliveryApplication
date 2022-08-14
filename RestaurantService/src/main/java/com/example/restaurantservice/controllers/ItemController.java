package com.example.restaurantservice.controllers;

import com.example.restaurantservice.models.Item;
import com.example.restaurantservice.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/menu")
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping("/{itemId}")
    public ResponseEntity<Optional<Item>> getItemById(@PathVariable Long itemId){
        return itemService.getItem(itemId);
    }
    @PostMapping("/add")
    public ResponseEntity<Item> addItem(@RequestBody Item item){
        return itemService.addItem(item);
    }

    @PostMapping("/update/{itemId}")
    public Item updateItemById(@PathVariable Long itemId,@RequestBody Item item){
        return itemService.updateItem(item, itemId);
    }
    @DeleteMapping("/delete/{itemId}")
    ResponseEntity<String> deleteItemById(@PathVariable Long itemId){
        itemService.deleteItem(itemId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{restaurantId}")
    public ResponseEntity<List<Item>> getAllItems(@PathVariable Long restaurantId){
       return itemService.getItemsByRestaurant(restaurantId);
    }

    @PostMapping("/add/list")
    public void addItems(@RequestBody List<Item> items){
        itemService.addItems(items);
    }

}

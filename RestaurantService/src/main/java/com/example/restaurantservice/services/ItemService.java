package com.example.restaurantservice.services;

import com.example.restaurantservice.models.Item;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ItemService {
    ResponseEntity<Optional<Item>> getItem(Long itemId);
    ResponseEntity<Item> addItem(Item item);
    Item updateItem(Item item, Long id);
    void deleteItem(Long itemId);
    ResponseEntity<List<Item>> getItemsByRestaurant (Long restaurantId);
    ResponseEntity<List<Item>> addItems(List<Item> items);


}

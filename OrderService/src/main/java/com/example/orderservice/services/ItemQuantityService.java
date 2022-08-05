package com.example.orderservice.services;

import com.example.orderservice.model.ItemQuantity;
import com.example.orderservice.repo.ItemQuantityRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ItemQuantityService {
    List<ItemQuantity> getAllItemQuantities ();
    Optional<ItemQuantity> getItemQuantityById (Long id);
    ResponseEntity<ItemQuantity> addItemQuantity(ItemQuantity itemQuantity);
    ResponseEntity<String> updateItemQuantityById(Long id);

    ResponseEntity<String> updateItemQuantityById(Long id, ItemQuantity itemQuantity);

    ResponseEntity<String> deleteItemQuantityById(Long id);
    ResponseEntity<String> deleteAllItems ();
}

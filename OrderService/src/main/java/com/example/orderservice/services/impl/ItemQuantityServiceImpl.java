package com.example.orderservice.services.impl;

import com.example.orderservice.model.ItemQuantity;
import com.example.orderservice.repo.ItemQuantityRepository;
import com.example.orderservice.services.ItemQuantityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemQuantityServiceImpl implements ItemQuantityService {

    @Autowired
    ItemQuantityRepository itemQuantityRepository;

    @Override
    public List<ItemQuantity> getAllItemQuantities() {
        return itemQuantityRepository.findAll();
    }

    @Override
    public Optional<ItemQuantity> getItemQuantityById(Long id) {
        return itemQuantityRepository.findById(id);
    }

    @Override
    public ResponseEntity<ItemQuantity> addItemQuantity(ItemQuantity itemQuantity) {
        return ResponseEntity.ok(itemQuantityRepository.save(itemQuantity));
    }

    @Override
    public ResponseEntity<String> updateItemQuantityById(Long id, ItemQuantity itemQuantity) {
        return null;
    }

    @Override
    public ResponseEntity<String> deleteItemQuantityById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<String> deleteAllItems() {
        return null;
    }
}

package com.example.restaurantservice.services.impl;

import com.example.restaurantservice.models.Item;
import com.example.restaurantservice.repos.ItemRepository;
import com.example.restaurantservice.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;


    @Override
    public ResponseEntity<Optional<Item>> getItem(Long itemId) {
        return ResponseEntity.ok(itemRepository.findById(itemId));
    }

    @Override
    public ResponseEntity<Item> addItem(Item item) {
        if (itemRepository.findByName(item.getName()) != null) {
            return null;
        }
        return ResponseEntity.ok(itemRepository.save(item));
    }

    @Override
    public Item updateItem(Item item, Long id) {
        if (itemRepository.findById(id).isPresent()) {
            return itemRepository.save(item);
        }
        return null;
    }

    @Override
    public void deleteItem(Long itemId) {
        itemRepository.deleteById(itemId);
    }

    @Override
    public ResponseEntity<List<Item>> getItemsByRestaurant(Long restaurantId) {
        return ResponseEntity.ok(itemRepository.findAll().stream().filter(
                i -> Objects.equals(i.getRestaurant().getRestaurantId(), restaurantId))
                .collect(Collectors.toList()));
    }

    @Override
    public ResponseEntity<List<Item>> addItems(List<Item> items) {
        return ResponseEntity.ok(itemRepository.saveAll(items));
    }
}

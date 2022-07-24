package com.example.orderservice.model.Helpers;

import com.example.restaurantservice.repos.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class ItemQuantity {
    private Long menuItemId;
    private int quantity;
    private int price;

    @Autowired
    MenuItemRepository menuItemRepository;

    public ItemQuantity(Long menuItemId, Long itemId, int quantity) {
        this.menuItemId = menuItemId;
        this.quantity = quantity;
        this.price = quantity * menuItemRepository.getMenuItemById(itemId).getPrice();
    }


}

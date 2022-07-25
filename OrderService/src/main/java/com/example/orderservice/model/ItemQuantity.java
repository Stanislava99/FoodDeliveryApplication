package com.example.orderservice.model;

import com.example.restaurantservice.repos.MenuItemRepository;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import javax.ws.rs.DefaultValue;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "item_quantity")
public class ItemQuantity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemOrderId;
    private Long menuItemId;
    private Long orderId;
    @DefaultValue("1")
    private int quantity;
    private int price;

    public ItemQuantity(Long menuItemId,Long orderId, int quantity) {
        this.menuItemId = menuItemId;
        this.orderId = orderId;
        this.quantity = quantity;
    }
}

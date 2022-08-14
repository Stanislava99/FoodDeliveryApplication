package com.example.orderservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    @Column(name = "item_quatity_id")
    private Long itemQuantityId;

    @Column(name = "item_id")
    private Long itemId;
    @DefaultValue("1")
    private int quantity;
    private int price;

    @ManyToOne
    @JoinColumn
    private Order order;

    public ItemQuantity(Long itemQuantityId, int quantity, int price) {
        this.itemQuantityId = itemQuantityId;
        this.quantity = quantity;
        this.price = price;
    }
}

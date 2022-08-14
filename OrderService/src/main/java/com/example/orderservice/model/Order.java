package com.example.orderservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "order")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String username;
    @Column(name = "user_address")
    private String userAddress;
    @Column(name = "total_price")
    private int totalPrice;
    @Column(name = "order_time")
    private LocalDateTime orderTime;
    @Column(name = "special_note")
    private String specialNote;
    @OneToMany(cascade = CascadeType.ALL, fetch= FetchType.EAGER, mappedBy = "order")
    private List<ItemQuantity> itemQuantityList;

    public Order(String username, String userAddress, int totalPrice, String specialNote, Long userId, List<ItemQuantity> itemQuantityList) {
        this.username = username;
        this.userAddress = userAddress;
        this.totalPrice = totalPrice;
        this.orderTime = LocalDateTime.now();
        this.specialNote = specialNote;
        this.itemQuantityList = itemQuantityList;
    }

    public Order() {

    }
}

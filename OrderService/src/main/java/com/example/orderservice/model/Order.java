package com.example.orderservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "order_table")
@Getter
@Setter
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    @Column
    private int totalPrice;
    @Column
    private Long orderItemsId;
    @Column
    private LocalTime orderTime;
    @Column
    private String specialNote;
    @Column
    private Long paymentId;
    @Column
    private int deliveryTimeInMinutes;
    @Column
    private Long userId;

}

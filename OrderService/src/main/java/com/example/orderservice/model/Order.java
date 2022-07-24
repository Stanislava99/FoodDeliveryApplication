package com.example.orderservice.model;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    @Column
    private int totalPrice;
    @Column
    private LocalTime orderTime;
    @Column
    private String specialNote;
    @Column
    private Long paymentId;
    @Column
    private int deliveryTimeInMinutes;
    private Long userId;

}

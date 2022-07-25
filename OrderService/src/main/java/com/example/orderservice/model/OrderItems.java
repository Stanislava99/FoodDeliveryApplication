package com.example.orderservice.model;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "order_items")
@NoArgsConstructor
@AllArgsConstructor
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order orderId;
    @OneToMany
    @JoinColumn(name = "item_id")
    private List<OrderItems> orderItemsList;

}

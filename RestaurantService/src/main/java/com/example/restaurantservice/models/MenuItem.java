package com.example.restaurantservice.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class MenuItem {
    @Id
    @Column
    private Long id;

    @Column
    private Long restaurantId;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private int price;

}

package com.example.restaurantservice.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "restaurant")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "restaurant_id")
    private Long restaurantId;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private String city;

    @Column
    private String description;

    @OneToMany(cascade = CascadeType.ALL, fetch= FetchType.EAGER, mappedBy = "restaurant")
    private Set<Item> menuItems;


}

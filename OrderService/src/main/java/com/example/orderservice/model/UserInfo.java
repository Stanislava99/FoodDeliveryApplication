package com.example.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_info")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private int phoneNumber;
    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String zip;
    @Column
    private String state;


}

package com.example.orderservice.model.Helpers;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserAddress {
    private String city;
    private String address;
    private String zip;
    private String state;

    public UserAddress(String city, String address, String zip) {
        this.city = city;
        this.address = address;
        this.zip = zip;
    }
}

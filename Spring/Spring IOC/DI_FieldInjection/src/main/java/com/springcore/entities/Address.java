package com.springcore.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("${address.city}")
    private String city;

    @Value("${address.state}")
    private String state;

    @Value("${address.pincode}")
    private int pincode;

    @Override
    public String toString() {
        return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
    }
}

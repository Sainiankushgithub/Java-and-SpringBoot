package com.springcore.entities;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	String city;
	String state;
	int pincode;
	
	public Address(@Value("${address.city}")String city,
			@Value("${address.state}")String state,
			@Value("${address.pincode}")int pincode) {
		this.city=city;
		this.state=state;
		this.pincode=pincode;
		
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
}

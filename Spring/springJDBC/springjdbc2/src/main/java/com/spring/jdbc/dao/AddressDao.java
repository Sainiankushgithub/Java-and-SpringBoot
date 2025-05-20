package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Address;

public interface AddressDao {
    int insert(Address address);
    Address getAddress(int id);
}

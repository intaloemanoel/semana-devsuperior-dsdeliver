package com.intalo.dsdeliver.repositories;

import com.intalo.dsdeliver.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}

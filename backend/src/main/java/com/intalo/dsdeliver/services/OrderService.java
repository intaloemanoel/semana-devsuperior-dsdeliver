package com.intalo.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import com.intalo.dsdeliver.dto.OrderDTO;
import com.intalo.dsdeliver.entities.Order;
import com.intalo.dsdeliver.repositories.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Transactional(readOnly = true)
    public List<OrderDTO> findAll() {
        List<Order> list = repository.findOrdersWithProducts();
        return list.stream().map(OrderDTO::new).collect(Collectors.toList());
    }
}

package com.example.orderservice.controller;

import com.example.orderservice.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @GetMapping("/orders")
    public List<Order> getOrders() {

        return List.of(
                new Order(1L, "Laptop", 1),
                new Order(2L, "Mobile", 2)
        );
    }
}
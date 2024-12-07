package com.klef.jfsd.exam.lab.controller;

import com.klef.jfsd.exam.lab.model.Order;
import com.klef.jfsd.exam.lab.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")  // This will be the GET endpoint
    public List<Order> getAllOrders() {
        return orderService.getAllOrders(); // Calls the service to get all orders
    }
}






package com.klef.jfsd.exam.lab.service;

import com.klef.jfsd.exam.lab.model.Order;
import com.klef.jfsd.exam.lab.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getAllOrders() {
        return orderRepository.findAll(); // This fetches all orders from the database
    }
}

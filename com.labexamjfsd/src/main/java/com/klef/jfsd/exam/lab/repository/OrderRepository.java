package com.klef.jfsd.exam.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.jfsd.exam.lab.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

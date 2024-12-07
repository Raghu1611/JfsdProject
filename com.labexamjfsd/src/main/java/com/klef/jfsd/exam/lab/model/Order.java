package com.klef.jfsd.exam.lab.model;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")  // Ensure this is the correct table name in your database
public class Order {

    @Id
    @Column(name = "order_id")  // Ensure this matches the column name in the database
    private Long orderId;

    @Column(name = "customer_name")  // Ensure this matches the column name in the database
    private String customerName;

    @Column(name = "order_date")  // Ensure this matches the column name in the database
    private Date orderDate;

    @Column(name = "product_name")  // Ensure this matches the column name in the database
    private String productName;

    @Column(name = "quantity")  // Ensure this matches the column name in the database
    private int quantity;

    // Getters and Setters
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

package com.example.orderservice.dto;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ORDER_DETAIL")
public class OrderDetails {

    @Id
    @GeneratedValue
    int id;
   @Column(name = "CUSTOMER_NAME")
   String customerName;
   @Column(name = "ORDER_DATE")
   Date orderDate;
   @Column(name = "SHIPPING_ADDRESS")
   String shippingAddress;
   @Transient
   List<OrderItems> orderItemstList = new ArrayList<>(10);
   @Column(name = "TOTAL")
   double total;

    public String getCustomerName() {
        return customerName;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }


    public double getTotal() {
        return total;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<OrderItems> getOrderItemstList() {
        return orderItemstList;
    }

    public void setOrderItemstList(List<OrderItems> orderItemstList) {
        this.orderItemstList = orderItemstList;
    }
}

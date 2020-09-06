package com.example.orderservice.controller;

import com.example.orderservice.OrderService;
import com.example.orderservice.client.RemoteCallService;
import com.example.orderservice.dto.OrderDetails;
import com.example.orderservice.dto.OrderItems;
import com.example.orderservice.exception.RecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    RemoteCallService remoteCallService;

    @GetMapping("/get/all")
    public List<OrderDetails> getAllOrders() {
        List<OrderDetails> orderDetails = orderService.getAllOrders();
        if(orderDetails == null && orderDetails.size()==0){
            throw new RecordNotFoundException("Record not found ...");
        }
        return orderDetails;
    }

    @GetMapping("/get/items")
    public List<OrderItems> getAllOrdersItems(){
        return remoteCallService.getData();
    }

}

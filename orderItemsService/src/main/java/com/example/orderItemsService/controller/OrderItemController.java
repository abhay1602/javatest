package com.example.orderItemsService.controller;

import com.example.orderItemsService.dto.OrderItems;
import com.example.orderItemsService.exception.RecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderItemController {

    @Autowired
    OrderService orderService;

    @GetMapping("/get/items")
    public List<OrderItems> getAllItems(){
        List<OrderItems> orderItems = orderService.getAllOrder();
        if((orderItems == null) && (orderItems.size()==0)){
            throw new RecordNotFoundException("Record not found ...");
        }
        return orderItems;
    }

}

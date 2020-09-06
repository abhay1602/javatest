package com.example.orderItemsService.controller;

import com.example.orderItemsService.dto.OrderItemRepository;
import com.example.orderItemsService.dto.OrderItems;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderItemRepository orderItemRepository;

    public List<OrderItems> getAllOrder(){
        return orderItemRepository.findAll();
    }
}

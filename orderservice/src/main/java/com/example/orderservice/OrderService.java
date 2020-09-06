package com.example.orderservice;

import com.example.orderservice.client.RemoteCallService;
import com.example.orderservice.dto.OrderDetails;
import com.example.orderservice.dto.OrderItems;
import com.example.orderservice.dto.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    RemoteCallService remoteCallService;

    public List<OrderDetails> getAllOrders(){

        return buildResponse();
    }

    private List<OrderDetails> buildResponse(){
        List<OrderDetails> orderDetails =orderRepository.findAll();
        List<OrderItems> orderItemsList = remoteCallService.getData();
        for(OrderDetails details: orderDetails){
            details.setOrderItemstList(orderItemsList);
        }
        return orderDetails;
    }

}

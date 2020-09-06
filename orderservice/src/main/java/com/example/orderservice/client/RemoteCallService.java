package com.example.orderservice.client;

import com.example.orderservice.dto.OrderDetails;
import com.example.orderservice.dto.OrderItems;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@FeignClient(name = "order-item-client", url = "http://localhost:8086")

public interface RemoteCallService {
    @GetMapping("/get/items")
    public List<OrderItems> getData();

}

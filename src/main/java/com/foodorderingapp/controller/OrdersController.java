package com.foodorderingapp.controller;

import com.foodorderingapp.dto.BillDto;
import com.foodorderingapp.dto.OrderDto;
import com.foodorderingapp.model.Orders;
import com.foodorderingapp.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrdersController {

    @Autowired
    OrdersService ordersService;

    @PostMapping
    @ResponseBody
    public BillDto addOrder(@RequestBody OrderDto orderDto) {


        return ordersService.addOrders(orderDto);

    }

    @GetMapping
    public List<Orders> getOrders(){
        return  ordersService.getOrders();
    }




}

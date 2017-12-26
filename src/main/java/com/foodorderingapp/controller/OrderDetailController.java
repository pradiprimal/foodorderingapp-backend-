package com.foodorderingapp.controller;


import com.foodorderingapp.model.OrderDetail;
import com.foodorderingapp.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orderDetail")
@CrossOrigin
public class OrderDetailController {


    @Autowired
    OrderDetailService orderDetailService;

    @GetMapping
    @ResponseBody
    public List<OrderDetail> getOrderDetail() {

        return orderDetailService.getOrderDetails();

    }

}
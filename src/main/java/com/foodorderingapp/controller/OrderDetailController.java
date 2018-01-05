package com.foodorderingapp.controller;


import com.foodorderingapp.dto.OrderDetailDto;
import com.foodorderingapp.model.OrderDetail;
import com.foodorderingapp.service.OrderDetailService;
import com.sun.org.apache.xpath.internal.operations.Or;
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
    public List<OrderDetailDto> getOrderDetail() {

        return orderDetailService.getOrderDetails();

    }

    @GetMapping(value="/{userId}")
    public List<OrderDetail>  getOrderDetailByUserId(@PathVariable("userId") int userId){

        return orderDetailService.getOrderDetailByUserId(userId);
    }

}
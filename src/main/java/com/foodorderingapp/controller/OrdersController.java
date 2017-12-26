package com.foodorderingapp.controller;

import com.foodorderingapp.dto.Food;
import com.foodorderingapp.dto.FoodQuantity;
import com.foodorderingapp.dto.OrderDto;
import com.foodorderingapp.model.OrderDetail;
import com.foodorderingapp.model.Orders;
import com.foodorderingapp.model.User;
import com.foodorderingapp.service.OrderDetailService;
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
    @Autowired
    OrderDetailService orderDetailService;

    @PostMapping
    @ResponseBody
    public void addOrder(@RequestBody OrderDto orderDto) {

        Food food = new Food();
        Orders orders = new Orders();
        OrderDetail orderDetail = new OrderDetail();

        User user = new User();
        user.setUserId(orderDto.getUserId());
        orders.setUser(user);
        ordersService.addOrders(orders);

        for (FoodQuantity foodQuantity : orderDto.getFoodList()) {
            food.setId(foodQuantity.getFoodId());
            orderDetail.setOrders(orders);
            orderDetail.setFood(food);
            orderDetail.setQuantities(foodQuantity.getQuantities());

            orderDetailService.addOrderDetail(orderDetail);

        }
    }

    @GetMapping
    public List<Orders> getOrders(){
        return  ordersService.getOrders();
    }
}

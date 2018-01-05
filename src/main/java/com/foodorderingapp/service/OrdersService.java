package com.foodorderingapp.service;

import com.foodorderingapp.dto.BillDto;
import com.foodorderingapp.dto.OrderDto;
import com.foodorderingapp.model.Orders;

import java.util.List;

public interface OrdersService {
    BillDto addOrders(OrderDto ordersDto);
    List<Orders> getOrders();
}

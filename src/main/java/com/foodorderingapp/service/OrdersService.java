package com.foodorderingapp.service;

import com.foodorderingapp.model.Orders;

import java.util.List;

public interface OrdersService {
    void addOrders(Orders orders);
    List<Orders> getOrders();
}

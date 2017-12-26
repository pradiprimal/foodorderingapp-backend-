package com.foodorderingapp.service;

import com.foodorderingapp.model.OrderDetail;

import java.util.List;

public interface OrderDetailService {

    void addOrderDetail(OrderDetail orderDetail);
    List<OrderDetail> getOrderDetails();
}

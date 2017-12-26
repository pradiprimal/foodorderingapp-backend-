package com.foodorderingapp.dao;

import com.foodorderingapp.model.OrderDetail;

import java.util.List;

public interface OrderDetailDAO {

     void addOrderDetail(OrderDetail orderDetail);
    List<OrderDetail> getOrderDetail();
}

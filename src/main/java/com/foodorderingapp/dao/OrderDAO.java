package com.foodorderingapp.dao;

import com.foodorderingapp.model.Orders;

import java.util.List;

public interface OrderDAO {

     void addOrders(Orders orders);
     List<Orders> getorders();

}

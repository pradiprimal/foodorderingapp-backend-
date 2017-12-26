package com.foodorderingapp.dao;

import com.foodorderingapp.dto.Food;
import com.foodorderingapp.model.Orders;
import com.foodorderingapp.model.User;

import java.util.List;

public interface OrderDAO {

     void addOrders(Orders orders);
     List<Orders> getorders();

}

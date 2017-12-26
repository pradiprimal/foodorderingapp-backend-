package com.foodorderingapp.serviceImpl;

import com.foodorderingapp.dao.OrderDAO;
import com.foodorderingapp.model.Orders;
import com.foodorderingapp.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderService")
public class OrdersServiceImpl implements OrdersService{

    @Autowired
    private OrderDAO orderDAO;

    public void addOrders(Orders orders) {
         orderDAO.addOrders(orders);
    }

    public List<Orders> getOrders() {
       return  orderDAO.getorders();
    }
}

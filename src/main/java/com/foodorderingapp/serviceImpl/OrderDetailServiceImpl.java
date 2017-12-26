package com.foodorderingapp.serviceImpl;

import com.foodorderingapp.dao.OrderDAO;
import com.foodorderingapp.dao.OrderDetailDAO;
import com.foodorderingapp.model.OrderDetail;
import com.foodorderingapp.model.Orders;
import com.foodorderingapp.service.OrderDetailService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderDetailService")
public class OrderDetailServiceImpl implements OrderDetailService{

    @Autowired
    OrderDetailDAO orderDetailDAO;

    public void addOrderDetail(OrderDetail orderDetail) {


        orderDetailDAO.addOrderDetail(orderDetail);

    }

    public List<OrderDetail> getOrderDetails() {
      return  orderDetailDAO.getOrderDetail();
    }
}


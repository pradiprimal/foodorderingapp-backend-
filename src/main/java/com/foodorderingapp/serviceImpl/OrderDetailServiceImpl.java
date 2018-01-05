package com.foodorderingapp.serviceImpl;

import com.foodorderingapp.dao.OrderDetailDAO;
import com.foodorderingapp.dto.OrderDetailDto;
import com.foodorderingapp.model.OrderDetail;
import com.foodorderingapp.service.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderDetailService")
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    OrderDetailDAO orderDetailDAO;


    public List<OrderDetail> getOrderDetailByUserId(int userId) {

        return  orderDetailDAO.getOrderDetailByUser(userId);
    }

    public List<OrderDetailDto> getOrderDetails() {
        return orderDetailDAO.getOrderDetail();
    }
}


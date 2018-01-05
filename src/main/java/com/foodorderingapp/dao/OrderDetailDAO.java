package com.foodorderingapp.dao;

import com.foodorderingapp.dto.OrderDetailDto;
import com.foodorderingapp.model.OrderDetail;

import java.util.List;

public interface OrderDetailDAO {

     void addOrderDetail(OrderDetail orderDetail);
    List<OrderDetailDto> getOrderDetail();
    List<OrderDetail> getOrderDetailByUser(int userId);

}

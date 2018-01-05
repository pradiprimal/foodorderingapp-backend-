package com.foodorderingapp.serviceImpl;

import com.foodorderingapp.dao.FoodDAO;
import com.foodorderingapp.dao.OrderDAO;
import com.foodorderingapp.dao.OrderDetailDAO;
import com.foodorderingapp.dao.UserDAO;
import com.foodorderingapp.dto.BillDto;
import com.foodorderingapp.dto.Food;
import com.foodorderingapp.dto.FoodQuantity;
import com.foodorderingapp.dto.OrderDto;
import com.foodorderingapp.model.OrderDetail;
import com.foodorderingapp.model.Orders;
import com.foodorderingapp.model.User;
import com.foodorderingapp.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("orderService")
public class OrdersServiceImpl implements OrdersService{

    @Autowired
    private FoodDAO foodDAO;
    @Autowired
    private OrderDAO orderDAO;
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private OrderDetailDAO orderDetailDAO;

    double balance;

    public BillDto addOrders(OrderDto orderDto) {

        BillDto billDto=new BillDto();
        List<Food> foodList=new ArrayList<Food>();

        User user=userDAO.getUser(orderDto.getUserId());
        if(user == null){
            throw new RuntimeException("User not found.");
        }

        Orders orders = new Orders();
        orders.setUser(user);
        orderDAO.addOrders(orders);

        OrderDetail orderDetail = new OrderDetail();

        for(FoodQuantity foodQuantity : orderDto.getFoodList()) {

                orderDetail.setOrders(orders);
                orderDetail.setFoodName(foodQuantity.getFoodName());
                orderDetail.setQuantity(foodQuantity.getQuantity());
                orderDetail.setRestaurantName(foodQuantity.getRestaurantName());
                orderDetail.setFoodPrice(foodQuantity.getFoodPrice());

                if(foodQuantity.getQuantity()<=0){

                throw new IllegalArgumentException("quantity should be greater than 0");
                 }

                Food food=foodDAO.getFoodByName(foodQuantity.getFoodName());
                foodList.add(food);

                double amount=foodQuantity.getQuantity()*foodQuantity.getFoodPrice();
                balance=user.getBalance()-amount;
                user.setBalance(balance);
                userDAO.updateUser(user);
                billDto.setBalance(balance);
                billDto.setFoodList(foodList);

                orderDetailDAO.addOrderDetail(orderDetail);

        }
        return billDto;
        }


    public List<Orders> getOrders() {
       return  orderDAO.getorders();
    }


}

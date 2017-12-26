package com.foodorderingapp.dto;

import com.foodorderingapp.dto.Food;

import java.util.ArrayList;
import java.util.List;

public class OrderDto {


    private int userId;

    private List<FoodQuantity> foodList=new ArrayList<FoodQuantity>();




    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    public List<FoodQuantity> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<FoodQuantity> foodList) {
        this.foodList = foodList;
    }
}

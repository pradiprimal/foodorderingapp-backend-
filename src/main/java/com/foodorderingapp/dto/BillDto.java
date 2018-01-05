package com.foodorderingapp.dto;

import java.util.ArrayList;
import java.util.List;

public class BillDto {

    private double balance;
    private List<Food> foodList=new ArrayList<Food>();


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }
}

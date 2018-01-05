package com.foodorderingapp.service;

import com.foodorderingapp.dto.Food;

import java.util.List;

/**
 * Created by TOPSHI KREATS on 11/29/2017.
 */
public interface FoodService {
    boolean deleteFood(Food food);
    boolean updateFood(Food food, int id);
    List<Food> getAll();
    Food getFoodById(int id);
    List<Food> getFoodByRestaurantId(int id);
    List<Food> addFoodsToRestaurant(List<Food> foodList);
     Food getFoodByName(String foodName);
}

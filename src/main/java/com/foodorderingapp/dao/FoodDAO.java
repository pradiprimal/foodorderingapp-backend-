package com.foodorderingapp.dao;

import com.foodorderingapp.dto.Food;

import java.util.List;

/**
 * Created by TOPSHI KREATS on 11/29/2017.
 */
public interface FoodDAO {
    boolean deleteFood(Food food);
    boolean updateFood(Food food);
    List<Food> getAll();
    Food getFoodById(int id);
    Food addFoodToRestaurant(int id, Food food);
    Food addFoodToRestaurant( Food food);
    List<Food> getFoodByRestaurantId(int id);
    List<Food> addFoodsToRestaurant(List<Food> foodList);
}

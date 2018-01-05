package com.foodorderingapp.service;

import com.foodorderingapp.dto.Food;
import com.foodorderingapp.dto.Restaurant;

import java.util.List;

public interface RestaurantService {
    Restaurant addRestaurant(Restaurant restaurant);
    boolean deleteRestaurant(Restaurant restaurant);
    boolean updateRestaurant(Restaurant restaurant, int id);
    List<Restaurant> getAll();
    Restaurant getRestaurantById(int id);
    int deactivate(int id);
    int activate(int id);
    boolean getStatus(int id);
}

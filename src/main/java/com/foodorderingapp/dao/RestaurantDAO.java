package com.foodorderingapp.dao;

import com.foodorderingapp.dto.Restaurant;

import java.util.List;

public interface RestaurantDAO {
    Restaurant addRestaurant(Restaurant restaurant);
    boolean deleteRestaurant(Restaurant restaurant);
    boolean updateRestaurant(Restaurant restaurant);
    List<Restaurant> getAll();
    Restaurant getRestaurantById(int id);
    void deactivate(int id);
    void activate(int id);
    boolean getStatus(int id);
}

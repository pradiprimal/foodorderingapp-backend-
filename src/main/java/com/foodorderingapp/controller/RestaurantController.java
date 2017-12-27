package com.foodorderingapp.controller;

import com.foodorderingapp.dto.*;
import com.foodorderingapp.service.FoodService;
import com.foodorderingapp.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @Autowired
    private FoodService foodService;

    @GetMapping
    public List<Restaurant> getAllRestaurants() {
        return restaurantService.getAll();
    }

    @PostMapping
    public Restaurant addRestaurant(@RequestBody Restaurant restaurant) {
        restaurantService.addRestaurant(restaurant);
        return restaurant;
    }

    @GetMapping(value = "/{id}")
    public Restaurant getRestaurantById(@PathVariable int id) {
        return restaurantService.getRestaurantById(id);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteRestaurant(@PathVariable int id) {
        restaurantService.deleteRestaurant(getRestaurantById(id));
    }

    @PutMapping(value = "/{id}")
    public Restaurant updateRestaurant(@RequestBody Restaurant restaurant, @PathVariable int id) {
        restaurantService.updateRestaurant(restaurant, id);
        return restaurant;
    }

    @GetMapping(value = "/{id}/foods")
    public List<Food> getFoodsByRestaurant(@PathVariable int id) {
        return foodService.getFoodByRestaurantId(id);
    }

    @GetMapping(value = "/{id}/activate")
    public void activateRestaurant(@PathVariable int id){
        restaurantService.activate(id);
    }

    @GetMapping(value = "/{id}/deactivate")
    public void deactivateRestaurant(@PathVariable int id){
        restaurantService.deactivate(id);
    }
}
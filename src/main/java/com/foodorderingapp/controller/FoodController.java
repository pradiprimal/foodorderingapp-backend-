package com.foodorderingapp.controller;

import com.foodorderingapp.dto.Food;
import com.foodorderingapp.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by TOPSHI KREATS on 11/29/2017.
 */
@RestController
@RequestMapping("/foods")
@CrossOrigin
public class FoodController {
    @Autowired
    private FoodService foodService;

    @GetMapping
    public List<Food> allFood(){
        return foodService.getAll();
    }

    @DeleteMapping("/{id}")
    public String deleteFood(@PathVariable int id){
        foodService.deleteFood(foodService.getFoodById(id));
        return "Food has been deleted successfully";
    }

    @PutMapping("/{id}")
    public String updateFood(@RequestBody Food food,@PathVariable int id){
        System.out.println(food);
        foodService.updateFood(food, id);
        return "Food updated successfully!";
    }

    @GetMapping(value = "/{id}")
    public Food getFoodBydId(@PathVariable int id){
        return foodService.getFoodById(id);
    }

    @PostMapping
    public List<Food> addFoods(@RequestBody List<Food> foodList){
        return foodService.addFoodsToRestaurant(foodList);
    }
}
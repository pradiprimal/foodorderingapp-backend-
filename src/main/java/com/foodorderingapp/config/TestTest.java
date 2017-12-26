package com.foodorderingapp.config;

import java.util.*;

/**
 * Created by TOPSHI KREATS on 12/17/2017.
 */
public class TestTest {
    public static void main(String[] args) {
        List<String>  foodList = new ArrayList<String>();
        foodList.add("momo");
        foodList.add("momo");
        foodList.add("cake");
        foodList.add("chowmein");
        foodList.add("chowmein");
        foodList.add("chowmein");
        foodList.add("newariset");
        foodList.add("momo");
        foodList.add("momo");

        Map<String,Integer> foodQuantity = new HashMap<String, Integer>();

        for(String s : foodList){
            if(!foodQuantity.containsKey(s)){
                foodQuantity.put(s,1);
            }
            else
                foodQuantity.put(s, foodQuantity.get(s)+1);
        }

        System.out.println(foodQuantity);
        System.out.println("=======================");
        foodQuantity.put("egg roll",5);
        System.out.println(foodQuantity);
        for(Map.Entry<String,Integer> map : foodQuantity.entrySet()){
            int quan = map.getValue();
            String food = map.getKey();
            System.out.println(quan +" "+ food +"  is ordered");
        }
    }
/*
    private static void menu(){
        System.out.println("Food Ordering App");
        System.out.println("1.momo");
        System.out.println("2.chowmein");
        System.out.println("3.newari set");
        System.out.println("4.cake");
    }*/
}

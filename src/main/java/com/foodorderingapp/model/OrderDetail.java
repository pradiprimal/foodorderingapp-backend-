package com.foodorderingapp.model;

import com.foodorderingapp.dto.Food;

import javax.persistence.*;

@Entity
@Table(name="tbl_order_detail")
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_detail_id")
    private int orderDetailId;
    @Column(name="quantity")
    private int quantity;
    @Column(name="food_name")
    private String foodName;
    @Column(name="restaurant_name")
    private String restaurantName;
    @Column(name="food_price")
    private int foodPrice;



    @ManyToOne
    @JoinColumn(name="order_id")
    private Orders orders;


    public int getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }


    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }
}

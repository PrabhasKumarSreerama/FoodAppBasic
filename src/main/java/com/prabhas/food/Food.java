package com.prabhas.food;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Food {
    @Id
    private String foodName;
    private String description;
    private int price;

    public Food(){}

    public Food(String foodName, String desc, int price) {
        this.foodName = foodName;
        this.description = desc;
        this.price = price;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        this.description = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

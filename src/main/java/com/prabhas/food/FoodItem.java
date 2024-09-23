package com.prabhas.food;

public class FoodItem {
    private String foodName;
    private String desc;
    private int price;

    public FoodItem(String foodName, String desc, int price) {
        this.foodName = foodName;
        this.desc = desc;
        this.price = price;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

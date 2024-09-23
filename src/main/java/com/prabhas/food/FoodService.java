package com.prabhas.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class FoodService {
    @Autowired
    FoodRepository foodRepository;

    public void insertFoodItem(Food foodItem){
        foodRepository.save(foodItem);
    }

    public List<Food> getFoodItems(){
        return foodRepository.findAll();
    }

    public List<Food> filterFoodItems(int st, int en){
        return foodRepository.findAll().stream().filter(food -> food.getPrice()>=st&&food.getPrice()<=en).collect(Collectors.toUnmodifiableList());
    }
}

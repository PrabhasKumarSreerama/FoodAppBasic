package com.prabhas.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/food2")
public class FoodController2 {
    @Autowired
    FoodService foodService ;
    @PostMapping("/insert")
    public void insertFoodItem(@RequestBody Food foodItem){
        foodService.insertFoodItem(foodItem);
    }
    @GetMapping("/list")
    public List<Food> getFoodItems(){
        return foodService.getFoodItems();
    }
    @GetMapping ("/list/filter/{st}/{en}")
    public List<Food> filterFoodItems(@PathVariable int st, @PathVariable int en){
        return foodService.filterFoodItems(st, en);
    }
}

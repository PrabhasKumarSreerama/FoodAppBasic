package com.prabhas.food;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FoodConfig {
    @Bean
    public FoodService foodService(){
        return new FoodService();
    }
}

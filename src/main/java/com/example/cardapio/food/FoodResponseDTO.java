package com.example.cardapio.food;

import com.example.cardapio.category.Category;

public record FoodResponseDTO(Long id, String title, String image, Float price, Category category) {
    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice(), food.getCategory());
    }
}

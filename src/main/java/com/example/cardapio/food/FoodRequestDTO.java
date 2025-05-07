package com.example.cardapio.food;

import com.example.cardapio.category.Category;

public record FoodRequestDTO(String title, String image, Float price, Category category) {
}

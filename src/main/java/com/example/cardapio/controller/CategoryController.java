package com.example.cardapio.controller;

import com.example.cardapio.category.Category;
import com.example.cardapio.category.CategoryRepository;
import com.example.cardapio.category.CategoryRequestDTO;
import com.example.cardapio.category.CategoryResponseDTO;
import com.example.cardapio.exceptions.ResourceNotFoundException;
import com.example.cardapio.food.Food;
import com.example.cardapio.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryRepository repository;
    @Autowired
    private FoodRepository foodRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    private List<CategoryResponseDTO> getAll() {
        return repository.findAll().stream().map(CategoryResponseDTO::new).toList();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    private void saveCategory(@RequestBody CategoryRequestDTO data) {
        Category newCategory = new Category(data);
        repository.save(newCategory);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping(value = "/{id}")
    private Category deleteCategory(@PathVariable Long id) {
        Category category = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Category not found with ID: " + id));
        List<Food> foodsList = foodRepository.findByCategory_id(id);
        foodRepository.deleteAll(foodsList);
        repository.delete(category);
        return category;
    }
}

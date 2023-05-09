package com.resumetree.resumetree.controller;

import com.resumetree.resumetree.models.Category;
import com.resumetree.resumetree.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    CategoryRepository categoryRepo;

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/categories")
    public List<Category> getAllCategories()
    {
        return categoryRepo.findAll();
    }

    @PostMapping("/category")
    public Category addCategory(@RequestBody Category category)
    {
        return categoryRepo.save(category);
    }

}

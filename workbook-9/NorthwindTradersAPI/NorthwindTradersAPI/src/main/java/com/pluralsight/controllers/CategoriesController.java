package com.pluralsight.controllers;


import com.pluralsight.models.Category;
import com.pluralsight.models.Product;
import com.pluralsight.services.CategoriesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoriesController
{
    private CategoriesDao categoriesDao;

    @Autowired
    public CategoriesController(CategoriesDao categoriesDao)
    {
        this.categoriesDao = categoriesDao;
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories()
    {
        return categoriesDao.getAll();
    }

    @GetMapping("/categories/{id}")
    public Category getById(@PathVariable int id)
    {
        return categoriesDao.getById(id);
    }


    @PostMapping("/categories")
    public Category insert(@RequestBody Category category)
    {
        var newCategory = categoriesDao.insert(category);
        return newCategory;
    }
}

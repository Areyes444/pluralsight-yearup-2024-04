package com.pluralsight.controllers;


import com.pluralsight.models.Product;
import com.pluralsight.services.ProductsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductsController
{
    private ProductsDao productsDao;

    @Autowired
    public ProductsController(ProductsDao productsDao)
    {
        this.productsDao = productsDao;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts()
    {
        return productsDao.getAll();
    }

    @GetMapping("/products/{id}")
    public Product getById(@PathVariable int id)
    {
        return productsDao.getById(id);
    }

    @PostMapping("/products")
    public Product insert(@RequestBody Product product)
    {
        var newProduct = productsDao.insert(product);
        return newProduct;
    }
}

package com.pluralsight.models;

import com.pluralsight.models.products.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order implements Priceable
{
    private static int nextId = 1001;

    private int id;
    private String name;
    private List<Product> products = new ArrayList<Product>();

    public Order(String name, List<Product> products)
    {
        this.name = name;
        this.products = products;
        this.id = nextId++;
    }

    public static int getNextId()
    {
        return nextId;
    }

    public static void setNextId(int nextId)
    {
        Order.nextId = nextId;
    }

    public Order()
    {
        this.id = nextId++;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public List<Product> getProducts()
    {
        return products;
    }

    public void addProduct(Product product)
    {
        products.add(product);
    }

    @Override
    public BigDecimal getPrice()
    {
        BigDecimal price = BigDecimal.ZERO;

        for (Product product : products)
        {
            price = price.add(product.getPrice());
        }

        return price;
    }
}

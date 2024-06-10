package com.pluralsight.models.products;

import com.pluralsight.models.Priceable;

import java.math.BigDecimal;

public abstract class Product implements Priceable
{
    private String name;

    public Product(String name)
    {
        this.name = name;
    }

    public Product()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public abstract BigDecimal getPrice();
}

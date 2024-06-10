package com.pluralsight.models.products;

import java.math.BigDecimal;

public class Chips extends Product
{
    public Chips(String name)
    {
        super(name);
    }

    public Chips()
    {
    }

    @Override
    public BigDecimal getPrice()
    {
        return new BigDecimal("1.50");
    }
}

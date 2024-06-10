package com.pluralsight.models.products;

import com.pluralsight.models.Sizable;
import com.pluralsight.models.enumerations.Size;

import java.math.BigDecimal;

public class Drink extends Product implements Sizable
{
    private static final BigDecimal PRICE_SM = new BigDecimal("2.00");
    private static final BigDecimal PRICE_MD = new BigDecimal("2.50");
    private static final BigDecimal PRICE_LG = new BigDecimal("3.00") ;

    private String size = "Small";

    public Drink(String name)
    {
        super(name);
    }

    public Drink()
    {
    }

    @Override
    public String getSize()
    {
        return this.size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    @Override
    public BigDecimal getPrice()
    {
        return switch (this.size)
        {
            case "Small" -> PRICE_SM;
            case "Medium" -> PRICE_MD;
            default -> PRICE_LG;
        };
    }
}

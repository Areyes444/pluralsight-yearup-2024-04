package com.pluralsight.models.toppings;

import com.pluralsight.models.Sizable;
import com.pluralsight.models.enumerations.Size;

import java.math.BigDecimal;

public class Topping implements Sizable
{
    private String name;
    private String size;
    private boolean isExtra;

    public Topping(String name)
    {
        this.name = name;
    }

    public Topping()
    {
        isExtra = false;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
    }

    public boolean isExtra()
    {
        return isExtra;
    }

    public void setExtra(boolean extra)
    {
        isExtra = extra;
    }

    @Override
    public BigDecimal getPrice()
    {
        return BigDecimal.ZERO;
    }
}

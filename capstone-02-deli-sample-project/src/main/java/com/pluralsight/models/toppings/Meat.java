package com.pluralsight.models.toppings;

import com.pluralsight.models.enumerations.Size;

import java.math.BigDecimal;

public class Meat extends Topping
{
    private static final BigDecimal PRICE_SM = new BigDecimal("1.0");
    private static final BigDecimal PRICE_MD = new BigDecimal("2.0");
    private static final BigDecimal PRICE_LG = new BigDecimal("3.0") ;

    private static final BigDecimal PRICE_SM_EXTRA = new BigDecimal("0.5");
    private static final BigDecimal PRICE_MD_EXTRA = new BigDecimal("1.0");
    private static final BigDecimal PRICE_LG_EXTRA = new BigDecimal("1.5");

    public Meat(String name)
    {
        super(name);
    }

    public Meat()
    {
    }

    @Override
    public BigDecimal getPrice()
    {
        var size = this.getSize();

        switch (size)
        {
            case "Small" -> { return isExtra() ? PRICE_SM_EXTRA : PRICE_SM; }
            case "Medium" -> { return isExtra() ? PRICE_MD_EXTRA : PRICE_MD; }
            default -> { return isExtra() ? PRICE_LG_EXTRA : PRICE_LG; }
        }
    }
}

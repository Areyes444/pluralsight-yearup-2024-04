package com.pluralsight.models.data;

import java.math.BigDecimal;

public class SizeType extends TypeBase
{
    private BigDecimal price;
    private BigDecimal extraPrice;

    public SizeType(int id, int orderId, String category, String name, BigDecimal price, BigDecimal extraPrice)
    {
        super(id, orderId, category, name);

        this.price = price;
        this.extraPrice = extraPrice;
    }

    public SizeType()
    {
    }

    public BigDecimal getPrice()
    {
        return price;
    }

    public void setPrice(BigDecimal price)
    {
        this.price = price;
    }

    public BigDecimal getExtraPrice()
    {
        return extraPrice;
    }

    public void setExtraPrice(BigDecimal extraPrice)
    {
        this.extraPrice = extraPrice;
    }
}

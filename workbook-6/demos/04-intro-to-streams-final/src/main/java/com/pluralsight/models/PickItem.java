package com.pluralsight.models;

public class PickItem
{
    private int productId;
    private int quantity;

    public PickItem(int productId, int quantity)
    {
        this.productId = productId;
        this.quantity = quantity;
    }

    public PickItem()
    {
    }

    public int getProductId()
    {
        return productId;
    }

    public void setProductId(int productId)
    {
        this.productId = productId;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    @Override
    public String toString()
    {
        return productId + "\t" + quantity;
    }
}


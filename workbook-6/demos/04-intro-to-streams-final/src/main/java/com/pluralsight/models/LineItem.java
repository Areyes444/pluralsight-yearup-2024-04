package com.pluralsight.models;

public class LineItem // implements Comparable<LineItem>
{
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    public LineItem(int productId, String productName, double price, int quantity)
    {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public LineItem()
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

    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public double getLineTotal()
    {
        return price * quantity;
    }

    @Override
    public String toString()
    {
        return productId + "\t" + productName + "\t" + price + "\t" + quantity;
    }

//    @Override
//    public int compareTo(LineItem o)
//    {
//        return (this.getPrice() <= o.getPrice())
//                ? -1
//                : 1;
//    }
}



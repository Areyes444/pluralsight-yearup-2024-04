package com.pluralsight;

public class Order
{
    private String customerName;
    private String product;
    private double price;
    private int quantity;

    public Order(String customerName, String product, double price, int quantity)
    {
        this.customerName = customerName;
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    public String getCustomerName()
    {
        return customerName;
    }
    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getProduct()
    {
        return product;
    }
    public void setProduct(String product)
    {
        this.product = product;
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
}

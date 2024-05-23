package com.pluralsight.models;

public abstract class Shape
{
    private String name;
    private double dimension1;
    private double dimension2;

    public Shape(String name,double dimension1,double dimension2)
    {
        this.name = name;
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }
    public double getDimension1()
    {
        return dimension1;
    }
    public double getDimension2()
    {
        return dimension2;
    }

    public String getName()
    {
        return name;
    }

    public abstract double getArea();
}

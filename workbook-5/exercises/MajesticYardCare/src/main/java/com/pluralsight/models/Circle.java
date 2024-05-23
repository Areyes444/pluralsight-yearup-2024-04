package com.pluralsight.models;

public class Circle extends Shape
{
    private double radius;

    public Circle(double radius)
    {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return 0.0;
    }

    @Override
    public String toString()
    {
        return String.format("%s (radius: %d): %f", getName(), radius, getArea());
    }
}

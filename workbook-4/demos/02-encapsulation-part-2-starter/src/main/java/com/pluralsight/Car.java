package com.pluralsight;

public class Car
{
    private String make;
    private String model;
    private int speed;

    public Car(String make, String model)
    {
        this.make = make;
        this.model = model;
        this.speed = 0;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getSpeed()
    {
        return speed;
    }
}

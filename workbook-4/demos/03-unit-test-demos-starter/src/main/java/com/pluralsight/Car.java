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

    public String getModel()
    {
        return model;
    }

    public int getSpeed()
    {
        return speed;
    }

    public void accelerate(int increaseBy)
    {
        speed += increaseBy;
    }

    public void brake(int decreaseBy)
    {
        speed -= decreaseBy;
    }
}

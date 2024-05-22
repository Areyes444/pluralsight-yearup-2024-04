package com.pluralsight.models;

import com.pluralsight.models.interfaces.Drivable;

public abstract class Vehicle implements Drivable
{
    private String make;
    private String model;
    private boolean isOn;

    public Vehicle(String make, String model)
    {
        this.make = make;
        this.model = model;
        this.isOn = false;
    }

    @Override
    public String getMake()
    {
        return make;
    }

    @Override
    public String getModel()
    {
        return model;
    }


    @Override
    public void turnOn()
    {
        this.isOn = true;
        System.out.println("Turning on Vehicle");
    }

    @Override
    public void turnOff()
    {
        this.isOn = false;
        System.out.println("Turning off Vehicle");
    }
}

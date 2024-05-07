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


    public void accelerate(int finalSpeed)
    {
        try
        {
            while (speed < finalSpeed)
            {
                speed += 1;
                System.out.println(speed);
                Thread.sleep(5);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("There was an error accelerating");
        }
    }

    public void decelerate(int finalSpeed)
    {
        try
        {
            while (speed > finalSpeed)
            {
                speed -= 1;
                System.out.println(speed);
                Thread.sleep(5);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("There was an error decelerating");
        }
    }

    public void slamOnBrakes()
    {
        try
        {
            while (speed > 0)
            {
                speed -= 10;
                System.out.println(speed);
                Thread.sleep(5);
            }
            speed = 0;
        }
        catch (InterruptedException e)
        {
            System.out.println("There was an error braking - you've hit the wall");
        }
    }
}

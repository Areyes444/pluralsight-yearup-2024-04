package com.pluralsight.comparables;

public class CarApp
{
    public static void main(String[] args)
    {
        Car car1 = new Car("Ford", "F150", 2024);
        Car car2 = new Car("Chevy", "Silverado", 2024);

        int swapValue = car1.compareTo(car2);

        System.out.println(swapValue);

        if(swapValue > 0)
        {
            System.out.println("the cars are out of order");
        }
        else
        {
            System.out.println("the cars are in order");
        }
    }
}

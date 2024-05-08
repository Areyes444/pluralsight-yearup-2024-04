package com.pluralsight;

// test runner
public class MainTest
{
    public static void main(String[] args)
    {

        Car car = new Car("Ford", "Mustang");

        System.out.println(car.getSpeed());
        car.accelerate(20);
        System.out.println(car.getSpeed());
        car.accelerate(-20);
        System.out.println(car.getSpeed());
    }
}
package com.pluralsight;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        Car mustang = new Car("Ford", "Mustang");

        System.out.println();
        System.out.println("Start");
        mustang.accelerate(100);

        System.out.println();
        System.out.println("slowing down");
        mustang.decelerate(50);


        System.out.println();
        System.out.println("stopping");
        mustang.slamOnBrakes();
    }
}
package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        double price = 4135.13598;
        price = Math.round(price * 100) / 100.00;

        System.out.println(price);
        System.out.printf("%f \n",price);
        price *=2;
        System.out.printf("%f \n",price);
    }
}
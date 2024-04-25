package com.pluralsight;

public class Incrementors
{
    public static void main(String[] args)
    {
        int x = 5;
        if(x++ < 6) // compares 5 (x) to 6 AND THEN adds 1 to x
        {
            System.out.println(x);
            System.out.println("x is less than 6");
        }
        else
        {
            System.out.println("x is 6");
        }

        x = 10;
        System.out.println(x); // prints 10 because x is 10
        System.out.println(x++); // prints 10 AND THEN adds 1 to x
        System.out.println(x); // prints 11
        System.out.println(++x); // ADDS 1 to x AND THEN prints 12


        x = 10;
        int y = x++; // set y to 10 AND THEN increment x
        System.out.println("Y = " + y);
        System.out.println("X = " + x);

    }
}

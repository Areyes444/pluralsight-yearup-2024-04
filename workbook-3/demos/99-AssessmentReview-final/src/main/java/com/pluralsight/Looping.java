package com.pluralsight;

public class Looping
{
    public static void main(String[] args)
    {
        for (int i = 3; i < 20; i += 3)
        {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 3; i < 20; i += 3)
        {
            if(i % 5 == 0)
            {
                break; // break out of the loop at 15
            }
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 3; i < 20; i += 3)
        {
            if(i % 5 == 0)
            {
                continue; // skip 15
            }
            System.out.print(i + " ");
        }
    }
}

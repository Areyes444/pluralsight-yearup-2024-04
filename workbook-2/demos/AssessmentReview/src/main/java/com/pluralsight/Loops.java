package com.pluralsight;

public class Loops
{
    public static void main(String[] args)
    {
        sumTrick();
    }

    // add all numbers from 1 to 20
    public static void sumPattern()
    {
        int sum = 0; // make sure that the sum is initialized

        for(int i = 1; i < 21; i++)
        {
            sum += i;
        }

        System.out.println(sum);
    }

    public static void sumTrick()
    {
        for(int i = 0; i < 5; i++) {
            int sum = 0;
            sum += i;
            System.out.print(sum + " ");
        }
    }

}

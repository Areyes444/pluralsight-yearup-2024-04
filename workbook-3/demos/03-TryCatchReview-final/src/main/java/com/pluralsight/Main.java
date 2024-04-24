package com.pluralsight;

import java.util.Scanner;

public class Main
{
    private static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args)
    {

        try
        {
            divide();
        }
        catch(Exception ex)
        {
            System.out.println("Something went horribly wrong, I'm so sorry");
        }

    }

    public static void divide()
    {
        System.out.print("Enter a number: ");
        int numerator = userInput.nextInt();

        System.out.print("Enter another number: ");
        int denominator = userInput.nextInt();

        if (denominator == 0)
        {
            System.out.println("Sorry, we can't divide by 0");
        }
        else
        {
            int quotient = numerator / denominator;
            System.out.printf("%d / %d = %d \n", numerator, denominator, quotient);
        }
    }
}
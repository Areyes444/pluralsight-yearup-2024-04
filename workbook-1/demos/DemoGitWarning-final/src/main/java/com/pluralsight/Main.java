package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int cash;

        System.out.print("How much money do you have? ");
        cash = input.nextInt();

        boolean canEatOut = cash > 0;

        if(canEatOut)
        {
            System.out.println("You can go out to eat.");
        }
        else
        {
            System.out.println("I hope you brought a sandwich.");
        }

    }
}
package com.pluralsight.demos;

import java.util.Scanner;

public class LoopTypes
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
//        whileLoop();
//        doWhileLoop();
//        whileLoop10();
        forLoop();

    }

    public static void whileLoop()
    {
        System.out.print("Do you want to play? (y/n) ");
        String playAgain = userInput.nextLine().strip().toLowerCase();

        while(playAgain.equalsIgnoreCase("y"))
        {
            System.out.println();
            System.out.println("Welcome to my game");
            System.out.println("----------------------");

            System.out.println();
            System.out.print("Do you want to play again? (y/n) ");
            playAgain = userInput.nextLine().strip().toLowerCase();
        }

        System.out.println();
        System.out.println("Thanks for Playing! Come again");
    }

    public static void doWhileLoop()
    {
        String playAgain;

        do
        {
            System.out.println();
            System.out.println("Welcome to my game");
            System.out.println("----------------------");

            System.out.println();
            System.out.print("Do you want to play again? (y/n) ");
            playAgain = userInput.nextLine().strip().toLowerCase();
        } while(playAgain.equalsIgnoreCase("y"));

        System.out.println();
        System.out.println("Thanks for Playing! Come again");
    }

    public static void whileLoop10()
    {
        int counter = 0;

        while(counter < 10)
        {

            System.out.println(counter);

            counter++;
        }
    }

    public static void forLoop()
    {
        // for loops are commonly used with arrays or any other collection
        for(int counter = 0; counter < 10; counter++)
        {
            if(counter % 2 == 0) // check if the number is even
            {
                continue; // skips to the next loop iteration
            }

            if(counter == 7)
            {
                break; // breaks out of the loop completely
            }
            System.out.println(counter);
        }

    }
}

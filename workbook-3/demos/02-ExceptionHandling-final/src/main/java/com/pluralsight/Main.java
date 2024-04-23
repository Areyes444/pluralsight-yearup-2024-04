package com.pluralsight;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        try
        {
            System.out.print("Please enter your name: ");
            String name = userInput.nextLine();

            System.out.print("Please enter your age: ");
            String ageInput = userInput.nextLine();
            int age = Integer.parseInt(ageInput);

            System.out.printf("Welcome %s I see that you are %d years old.\n", name, age);

            String[] names = {"Anne", "Joe"};
            System.out.println(names[5]);
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Please enter a valid number for your age: \n" + ex.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println("An unknown error has occurred:");
            System.out.println(ex.toString());
        }
        finally
        {
            // clean up code - what we need to do after our code has completed
            // close an open file
            // disconnect from a database
        }
    }
}
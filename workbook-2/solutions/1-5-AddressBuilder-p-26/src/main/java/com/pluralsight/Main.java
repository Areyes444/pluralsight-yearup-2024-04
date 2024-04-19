package com.pluralsight;

import java.util.Scanner;

public class Main
{
    private static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        StringBuilder builder = new StringBuilder();

        System.out.println();
        builder.append(getUserInput("Full name: "));
        builder.append("\n\n");
        System.out.println();

        builder.append("Billing Address: \n");
        builder.append(getUserInput("Billing Street: "));
        builder.append("\n");
        builder.append(getUserInput("Billing City: ")).append(", ");
        builder.append(getUserInput("Billing State: ")).append(" ");
        builder.append(getUserInput("Billing Zip: "));
        builder.append("\n\n");
        System.out.println();

        builder.append("Shipping Address: \n");
        builder.append(getUserInput("Shipping Street: "));
        builder.append("\n");
        builder.append(getUserInput("Shipping City: ")).append(", ");
        builder.append(getUserInput("Shipping State: ")).append(" ");
        builder.append(getUserInput("Shipping Zip: "));

        System.out.println();
        System.out.println(builder.toString());
    }

    public static String getUserInput(String message)
    {
        System.out.print(message);
        return userInput.nextLine().strip();
    }
}
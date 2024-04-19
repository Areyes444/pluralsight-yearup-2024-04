package com.pluralsight;

import java.util.Scanner;

public class Main
{
    private static final double BASE_PRICE_REGULAR = 5.45;
    private static final double BASE_PRICE_LARGE = 8.95;
    private static final double DISCOUNT_STUDENT = .1;
    private static final double DISCOUNT_SENIOR = .2;

    private static final Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println();
        System.out.println("Welcome to the Sandwich Shop");

        double price;
        double discountPercent;
        double discount;
        double total;

        price = getSizeSelection();
        discountPercent = getDiscountPercent();
        discount = price * discountPercent;
        total = price - discount;

        System.out.println();
        System.out.printf("Base Price:  $ %5.2f \n", price);
        System.out.printf("Discount:    $ %5.2f \n", discount);
        System.out.printf("Amount Due:  $ %5.2f \n", total);


    }

    private static double getSizeSelection()
    {
        System.out.println();
        System.out.println("Sandwich Selections:");
        System.out.println("  1) Regular - $ " + BASE_PRICE_REGULAR);
        System.out.println("  2) Large   - $ " + BASE_PRICE_LARGE);
        System.out.print("Select a size: ");
        int selection = Integer.parseInt(userInput.nextLine().strip());

        if(selection == 1) return BASE_PRICE_REGULAR;
        else return BASE_PRICE_LARGE;
    }

    private static double getDiscountPercent()
    {
        System.out.println();
        System.out.println("Are you a...");
        System.out.println("  1) Student");
        System.out.println("  2) Senior");
        System.out.println("  3) Neither");
        System.out.print("Please enter your selection: ");
        int selection = Integer.parseInt(userInput.nextLine().strip());

        if(selection == 1)
        {
            return DISCOUNT_STUDENT;
        }
        else if(selection == 2)
        {
            return DISCOUNT_SENIOR;
        }
        else
        {
            return 0;
        }
    }
}
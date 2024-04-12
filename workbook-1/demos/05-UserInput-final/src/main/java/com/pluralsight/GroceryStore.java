package com.pluralsight;

import java.util.Scanner;

public class GroceryStore
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        // declare constants
        final String PRODUCT_CHOCOLATE = "Milka Aplenmilch";
        final double PRODUCT_CHOCOLATE_PRICE = 2.99;
        final String PRODUCT_CANDY = "Skittles";
        final double PRODUCT_CANDY_PRICE = 1.49;

        // input variables
        String customerName;
        int productId;
        int quantity;
        double cashReceived;

        // calculated
        double totalPrice;
        double changeReturned;


        // get user input
        System.out.print("Please enter your name: ");
        customerName = userInput.nextLine(); // waits for the user to enter their name

        System.out.println();
        System.out.printf("Welcome %s. Today's products are: \n", customerName);
        System.out.printf("1) %s - $ %.2f \n", PRODUCT_CHOCOLATE, PRODUCT_CHOCOLATE_PRICE);
        System.out.printf("2) %s - $ %.2f \n", PRODUCT_CANDY, PRODUCT_CANDY_PRICE);
        System.out.println();

        System.out.print("Please select a product: ");
        productId = userInput.nextInt();

        System.out.print("How many would you like to buy? ");
        quantity = userInput.nextInt();

        // calculations
        if(productId == 1)
        {
            // productId 1 is milka
            totalPrice = PRODUCT_CHOCOLATE_PRICE * quantity;
        }
        else if(productId == 2)
        {
            // productId 2 is skittles
            totalPrice = PRODUCT_CANDY_PRICE * quantity;
        }
        else
        {
            System.out.println("You have made a POOR selection");
            return;
        }

        System.out.printf("The total is %.2f \n", totalPrice);

        System.out.print("Please enter your cash amount: ");
        cashReceived = userInput.nextInt();

        changeReturned = cashReceived - totalPrice;

        // display the receipt
        System.out.println();
        System.out.printf("Welcome %s. \n", customerName);
        System.out.printf("Total:  $ %6.2f \n", totalPrice);
        System.out.printf("Cash:   $ %6.2f \n", cashReceived);
        System.out.printf("Change: $ %6.2f \n", changeReturned);
    }
}
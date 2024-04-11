package com.pluralsight;

// ask user for their name
// display the product & price
// ask for quantity
// calculate total and display
// ask for money
// give change back

import java.util.Scanner;

public class GroceryStore
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        // declare constants
        final String PRODUCT = "Milka Aplenmilch";
        final double PRICE = 2.99;

        // input variables
        String customerName;
        int quantity;
        double cashReceived;

        // calculated
        double totalPrice;
        double changeReturned;


        // get user input
        System.out.print("Please enter your name: ");
        customerName = userInput.nextLine(); // waits for the user to enter their name

        System.out.printf("The product of the day is %s for $ %.2f each. \n", PRODUCT, PRICE);
        System.out.println();

        System.out.print("How many would you like to buy? ");
        quantity = userInput.nextInt();

        // calculations
        totalPrice = PRICE * quantity;

        System.out.printf("The total is %.2f \n", totalPrice);

        System.out.print("Please enter your cash amount: ");
        cashReceived = userInput.nextInt();


        changeReturned = cashReceived - totalPrice;

        // display the receipt
        System.out.println();
// option 1 for formatting
//        String message = String.format("Total: $ %.2f", totalPrice);
//        System.out.println(message);

// option 2 for formatting
        System.out.printf("Welcome %s. \n", customerName);
        System.out.printf("Total:  $ %6.2f \n", totalPrice);
        System.out.printf("Cash:   $ %6.2f \n", cashReceived);
        System.out.printf("Change: $ %6.2f \n", changeReturned);
    }
}
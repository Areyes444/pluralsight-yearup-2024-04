package com.pluralsight;

import java.util.Scanner;

public class GroceryStoreFunctions
{
    private static Scanner userInput = new Scanner(System.in);

    // declare constants
    static final String PRODUCT_CHOCOLATE = "Milka Aplenmilch";
    static final double PRODUCT_CHOCOLATE_PRICE = 2.99;
    static final String PRODUCT_CANDY = "Skittles";
    static final double PRODUCT_CANDY_PRICE = 1.49;

    public static void main(String[] args)
    {
        // input variables
        String customerName;
        int productId;
        int quantity;
        double cashReceived;
        double totalPrice;
        double changeReturned;

        customerName = getName();
        displayProducts(customerName);
        productId = getSelectedProductId();
        quantity = getSelectedQuantity();

        // calculations
        if(productId == 1)
        {
            // productId 1 is milka
            totalPrice = calculateTotal(PRODUCT_CHOCOLATE_PRICE, quantity);
        }
        else if(productId == 2)
        {
            // productId 2 is skittles
            totalPrice = calculateTotal(PRODUCT_CANDY_PRICE, quantity);
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

    public static void displayProducts(String name)
    {
        System.out.println();
        System.out.printf("Welcome %s. Today's products are: \n", name);
        System.out.printf("1) %s - $ %.2f \n", PRODUCT_CHOCOLATE, PRODUCT_CHOCOLATE_PRICE);
        System.out.printf("2) %s - $ %.2f \n", PRODUCT_CANDY, PRODUCT_CANDY_PRICE);
        System.out.println();
    }

    public static String getName()
    {
        System.out.print("Please enter your name: ");
        return userInput.nextLine(); // waits for the user to enter their name
    }

    public static int getSelectedProductId()
    {
        System.out.print("Please select a product: ");
        return userInput.nextInt();
    }

    public static int getSelectedQuantity()
    {
        System.out.print("Please enter the quantity: ");
        return userInput.nextInt();
    }

    public static double calculateTotal(double price, int quantity)
    {
        return price * quantity;
    }
}
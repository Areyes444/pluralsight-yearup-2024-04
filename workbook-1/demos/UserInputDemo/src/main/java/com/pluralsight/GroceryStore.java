package com.pluralsight;

// ask user for their name
// display the product & price
// ask for quantity
// calculate total & display
// ask for money
// give change back

public class GroceryStore
{
    public static void main(String[] args)
    {
        // declare variables
        final String product = "Milka Aplenmilch";
       final double price = 2.99;

       //input variables
        String customerName;
        int quantity;
        double totalPrice;

        //calculated
        double cashReceived;
        double changeReturned;

        //get user input
        customerName = "Bob";
        quantity = 5;

        //calculations
        totalPrice = price * quantity;
        cashReceived = 20;
        changeReturned = cashReceived - totalPrice;

        //display the receipt
        
    }
}
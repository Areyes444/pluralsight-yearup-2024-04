package com.pluralsight;

public class ExerciseDemo
{
    public static void main(String[] args)
    {
        question1();
        question2();
    }

    public static void question1()
    {
        // calculate the amount of change given after buying chocolate
        // chocolate costs 2.99 per bar
        // I have $20
        //Buy 4 chocolate bars
        // how much change will I get back?

        // declare your Variables
         double balance = 20;
         double priceOfChocolate = 2.99;
         int quantityBought = 4;
         double totalCost;
         double changeGiven;

         //write the logic
        totalCost = priceOfChocolate * quantityBought;
        changeGiven = balance - totalCost;

        //display the output
        System.out.println();
        System.out.println("Chocolate Bar: $ " + priceOfChocolate);
        System.out.println("Quantity: " + quantityBought);
        System.out.println("-----------------");
        System.out.println("Total: " +totalCost);
        System.out.println("Paid: " + balance);
        System.out.println("Change: " + changeGiven);

    }

    public static void question2()
    {
        // calculate the radius of a circle
        // For a circle with a radius of 12

        // Variables
        double radius = 12;
        double perimeter;

        //Calculate
        perimeter = 2 * Math.PI * radius;

        //outPut
        System.out.println("The Perimeter of a circle with the Radius " + radius + " is " +perimeter);
    }

}


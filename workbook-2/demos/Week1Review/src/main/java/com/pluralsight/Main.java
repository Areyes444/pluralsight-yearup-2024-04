package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException
    {
        compareStrings();
        initializeVariables();
        readFile();
        calculateDiscount();
    }

    public static void calculateDiscount()
    {
        double price = 10.95;
        double discount = .25;

        double discountAmount = price * discount;
        double totalPrice = price - discountAmount;

        System.out.println("Original: " + price);
        System.out.println("You saved: " + discountAmount);
        System.out.println("Total Due: " + totalPrice);
    }

    public static void readFile() throws FileNotFoundException
    {
        String fileName = "names.txt";
        File file = new File(fileName);

        // this line of code opens the file and turns it into a stream
        Scanner fileScanner = new Scanner(file);

        while(fileScanner.hasNext())
        {
            String name = fileScanner.nextLine();
            System.out.println(name);
        }

        // names.txt is locked until I close the scanner
        fileScanner.close();



    }

    public static void initializeVariables()
    {
        double price = 0.00;
        int choice;

        System.out.println("Products");
        System.out.println("1) Chocolate: 2.99");
        System.out.println("2) Apple: .75");
        System.out.println("3) None");
        System.out.print("What do you want to buy? ");
        choice = userInput.nextInt();

        if(choice == 1)
        {
            price = 2.99;
        }
        else if(choice == 2)
        {
            price = 0.75;
        }

        System.out.println("Your total is $ " + price);
    }

    public static void compareStrings()
    {

        System.out.print("Did you eat breakfast today? (yes/no)");
        String answer = userInput.nextLine();

        if(answer.equalsIgnoreCase("yes"))
        {
            System.out.println("You must be ready for the week");
        }
        else
        {
            System.out.println("good luck");
        }


        System.out.print("Enter a number between 1 and 10: ");
        int number = userInput.nextInt();

        if(number >= 5)
        {
            System.out.println("You entered a HIGH number");
        }
        else
        {
            System.out.println("You entered a LOW number");
        }

    }
}
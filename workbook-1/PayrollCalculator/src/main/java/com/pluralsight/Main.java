package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
//Create scanner
        Scanner scanner = new Scanner(System.in);

        //Create name
System.out.print("What is your name ? ");
String name = scanner.nextLine();

        //Their hours worked
System.out.print("How many hours have you worked so far? ");
double hoursWorked = scanner.nextDouble();

        //pay rate(floating number) calculate their gross pay
        System.out.print("What is you're pay rate? ");
        float payRate = scanner.nextFloat();

        //Calculations
        double payTotal;
        payTotal = hoursWorked * payRate;


        //Employee's results
        System.out.printf("Hello %s. \n", name);
        System.out.printf("Total Gross pay is %.2f \n ", payTotal);

    }
}
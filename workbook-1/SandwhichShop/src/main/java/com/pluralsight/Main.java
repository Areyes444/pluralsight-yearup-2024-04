package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        //Create Scanner
        Scanner scanner = new Scanner(System.in);

        //Variables
        int regular = 1;
        int large = 2;
        double sandwich1R = 5.45;
        double sandwich2L = 8.95;

        //Asking what kind of sandwich customer wants

        System.out.print("Do you want Sandwich 1 or Sandwich 2? ");
        int size = scanner.nextInt();

        //Asking how old the customer is

        System.out.print("How old are you?");
        double age = scanner.nextDouble();

        //Calculating discount by age
        double discount;
        if (age <= 17) {
            discount = 0.10; //receives a 10% discount
        } else if (age >= 65) {
            discount = 0.20; //receives a 20% discount
        } else {
            discount = 0.0;
        }

        //Total price calculations with discount

        double totalPrice;
        if (size == regular) {
            totalPrice = sandwich1R - (sandwich1R * discount);
        } else if (size == large) {
            totalPrice = sandwich2L - (sandwich2L * discount);
        } else {
            System.out.print("Error, make a better selection");
            return;
        }

        //The total cost including discount or not
        System.out.println("Total cost: $ "+String.format("%.2f", totalPrice));



    }}
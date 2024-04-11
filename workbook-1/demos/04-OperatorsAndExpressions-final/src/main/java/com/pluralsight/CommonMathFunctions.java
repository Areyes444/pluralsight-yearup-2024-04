package com.pluralsight;

public class CommonMathFunctions
{
    public static void main(String[] args)
    {
        // Java has a Math class with common values and functions
        System.out.println();
        System.out.println("The value of pi: " + Math.PI);


        // rounding
        System.out.println();
        double doubleValue = 1234.5678;
        long roundedValue = Math.round(doubleValue);
        System.out.println(doubleValue + " rounded: " + roundedValue);


        // finding max and min values
        System.out.println();
        int firstValue = 31;
        int secondValue = 83;

        int maxValue = Math.max(firstValue, secondValue);
        System.out.println("The larger number between " + firstValue + " and " + secondValue + " is " + maxValue);

        int minValue = Math.min(firstValue, secondValue);
        System.out.println("The smaller number between " + firstValue + " and " + secondValue + " is " + minValue);


        // calculating a number raised to an exponent (5 squared)
        System.out.println();
        int baseNumber = 5;
        int exponent = 2;
        double squaredValue = Math.pow(baseNumber, exponent);
        System.out.println("5 squared: " + squaredValue);

        // calculating the squareroot of a value
        int squaredNumber = 81;
        double squareRootValue = Math.sqrt(squaredNumber);
        System.out.println("The square root of 81 is " + squareRootValue);
    }
}

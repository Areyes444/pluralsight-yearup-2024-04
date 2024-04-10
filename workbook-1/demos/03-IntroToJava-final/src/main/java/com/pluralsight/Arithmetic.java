package com.pluralsight;

public class Arithmetic
{
    public static void main(String[] args)
    {
        // Expression
        // An expression is a calculation that results in a single value
        // 5 + 4 => 9
        // 5 + 4 - 3 => 9 - 3 => 6

        // Statement
        // A statement is the whole action and contains one or more expressions
        // int sum = 5 + 4;

        // addition
        int sum = 5 + 4;
        System.out.println("The sum of 5 + 4 = " + sum);

        // division
        int quotientInt = 5/2; // NOT 2.5
        System.out.println("5 / 2 = " + quotientInt);

        // double
        double quotientDouble = 5.0/2;
        System.out.println("5 / 2 = " + quotientDouble);
    }
}

package com.pluralsight;

public class OrderOfOperations
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 6;
        int c = 7;

        // PEMDAS
        // Parenthesis get calculated first
        // Exponents 2nd
        // Multiplication and Division 3rd (left to right)
        // Addition and Subtraction last (left to right)
        int answer = a - b * c;
        // no parenthesis
        // Java does not have exponents
        // 5 - 6 * 7 // do multiplication
        // 5 - 42 // do subtraction
        // 37
        System.out.println(answer);
    }
}

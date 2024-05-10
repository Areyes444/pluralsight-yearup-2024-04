package com.pluralsight;

import java.util.Scanner;

public class Main
{
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Enter a number: ");
        int first = userInput.nextInt();
        System.out.print("Enter another number: ");
        int second = userInput.nextInt();

        int answer = add(first, second);
        System.out.printf("%d + %d = %d\n", first, second, answer);
    }

    public static int add(int a, int b)
    {
        return a + b;
    }
}
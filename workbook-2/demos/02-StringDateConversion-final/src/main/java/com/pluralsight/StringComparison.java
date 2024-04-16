package com.pluralsight;

import java.util.Scanner;

public class StringComparison
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter YES or NO: ");
        String a = input.nextLine().toUpperCase().strip();
        String b = "YES";
        String c = "YES";
        String d = new String("YES");

        boolean stringsABAreEqual = a.equals(b);
        boolean stringsBCAreEqual = b.equals(c);
        boolean stringsCDAreEqual = c.equals(d);

        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
        System.out.println("A & B are equal: " + stringsABAreEqual);
        System.out.println("B & C are equal: " + stringsBCAreEqual);
        System.out.println("C & D are equal: " + stringsCDAreEqual);
    }
}

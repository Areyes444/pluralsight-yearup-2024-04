package com.pluralsight;

public class StringComparison
{
    public static void main(String[] args)
    {
        String a = "test"; // address 123
        String b = "test"; // address 123
        String c = new String("test"); // address 456
        String d = new String("TEST");

        // with Strings == compares the memory address
        System.out.println(a == b); // 123 == 123 => true
        System.out.println(a == c); // 123 == 456 => false
        System.out.println(a.equals(c)); // (compare the values) test == test => true
        System.out.println(a.equalsIgnoreCase(d)); // can compare values regardless of case

        // comparing primitives ALWAYS compares the values
        int x = 5;
        int y = 5;
        System.out.println(x == y);

    }
}

package com.pluralsight;

public class BasicFloatingPointMathApp
{
    public static void main(String[] args)
    {
        float first = 10;
        float second = 3;
        float result;

        result = first + second;
        System.out.println(result);  // displays 13.0

        result = first - second;
        System.out.println(result);  // displays 7.0

        result = first * second;
        System.out.println(result);  // displays 30.0

        result = first / second;
        System.out.println(result);  // displays 3.3333333

        result = first % second;
        System.out.println(result);  // displays 1.0

        result = second - (first % second);
        System.out.println(result);  // displays 2.0
    }

}

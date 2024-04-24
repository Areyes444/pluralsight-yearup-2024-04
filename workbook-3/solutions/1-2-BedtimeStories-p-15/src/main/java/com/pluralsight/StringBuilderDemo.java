package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalTime;

public class StringBuilderDemo
{

    public static void main(String[] args)
    {

        System.out.println("Start String Append: " + LocalTime.now());

        String myString = "";
        for (int i = 0; i < 100000; i++)
        {
            myString += "another line of text";
        }
        System.out.println("End String Append: " + LocalTime.now());
        System.out.println("String length: " + myString.length());

        System.out.println();


        System.out.println("Start String Append: " + LocalTime.now());

        StringBuilder  builder = new StringBuilder();
        for (int i = 0; i < 100000; i++)
        {
            builder.append("another line of text");
        }
        System.out.println("End String Append: " + LocalTime.now());
        System.out.println("StringBuilder length: " + builder.length());
    }
}

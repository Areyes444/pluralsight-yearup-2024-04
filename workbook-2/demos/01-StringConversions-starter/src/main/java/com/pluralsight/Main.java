package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)
    {
    }

    public static void splittingStrings()
    {
        // we can break a sentence into words
    }

    public static void convertNumbers()
    {
        // string contains "id|description|quantity|price"
        String input = "111|Hot Chocolate (12-count)|21|4.99";

        String[] tokens = input.split(Pattern.quote("|"));
        int id = Integer.parseInt(tokens[0]);
        String name = tokens[1];
        int quantity = Integer.parseInt(tokens[2]);
        double price = Double.parseDouble(tokens[3]);
    }

    public static void convertDatesBasic()
    {
        String userInput = "2002-10-17";
        LocalDate birthDay = LocalDate.parse(userInput);
    }

    public static void convertDatesCustom()
    {
        String userInput;
        DateTimeFormatter formatter;

        userInput = "10/17/2022";
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate birthDay = LocalDate.parse(userInput, formatter);

        userInput = "7 Oct 2002";
        formatter = DateTimeFormatter.ofPattern("d MMM yyyy");
        birthDay = LocalDate.parse(userInput, formatter);
    }
}
package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter you age: ");
        String ageInput = userInput.nextLine();
        int age = Integer.parseInt(ageInput);

        if(age >= 18)
        {
            System.out.println("you can vote");
        }
        else
        {
            System.out.println("can't vote yet");
        }

    }

    public static void splittingStrings()
    {
        // we can break a sentence into words
        String sentence = "The quick brown fox jumped over the lazy dog.";
        String[] words = sentence.split(" ");

        System.out.println(words.length);
        System.out.println("The 4th word is: " + words[3]);
    }

    public static void convertNumbers()
    {
        // string contains "id|description|quantity|price"
        String input = "111|Hot Chocolate (12-count)|21|4.99";

        // this line breaks the product into 4 strings
        String[] tokens = input.split(Pattern.quote("|"));

        int id = Integer.parseInt(tokens[0]); // 111
        String name = tokens[1]; // Hot Chocolate (12-count)
        int quantity = Integer.parseInt(tokens[2]); // 21
        double price = Double.parseDouble(tokens[3]); // 4.99


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
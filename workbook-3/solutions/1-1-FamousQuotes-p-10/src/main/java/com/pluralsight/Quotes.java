package com.pluralsight;

import java.util.Scanner;

public class Quotes
{
    private static Scanner userInput = new Scanner(System.in);

    private static String[] quotes = {
            "\"The only limit to our realization of tomorrow will be our doubts of today.\" — Franklin D. Roosevelt",
            "\"It is never too late to be what you might have been.\" — George Eliot",
            "\"Do what you can, with what you have, where you are.\" — Theodore Roosevelt",
            "\"Success is not final, failure is not fatal: it is the courage to continue that counts.\" — Winston Churchill",
            "\"You miss 100% of the shots you don't take.\" — Wayne Gretzky",
            "\"Believe you can and you're halfway there.\" — Theodore Roosevelt",
            "\"I have not failed. I've just found 10,000 ways that won't work.\" — Thomas A. Edison",
            "\"What lies behind us and what lies before us are tiny matters compared to what lies within us.\" — Ralph Waldo Emerson",
            "\"The future belongs to those who believe in the beauty of their dreams.\" — Eleanor Roosevelt",
            "\"The only way to do great work is to love what you do.\" — Steve Jobs"
    };

    public static void main(String[] args)
    {
        boolean keepGoing = true;

        while(keepGoing)
        {
            int quoteId = getUserSelection();
            System.out.println();

            if (quoteId > 0)
            {
                printQuote(quoteId);
            }
            else if(quoteId == -1)
            {
                int id = (int)(Math.random() * 10 + 1);
                printQuote(id);
            }
            else
            {
                System.out.println("goodbye");
                keepGoing = false;
            }
        }
    }

    public static int getUserSelection()
    {
        try
        {
            System.out.println();
            System.out.println("Enter a number between 1-10 to get a quote");
            System.out.println(" * enter -1 to get a random quote");
            System.out.println(" * or enter 0 to exit ");
            System.out.print("Make yer choice: ");
            return userInput.nextInt();
        }
        catch(Exception ex)
        {
            System.out.println("You did not enter a valid number");
        }

        return 0;

    }

    public static void printQuote(int id)
    {
        try
        {
            id--;
            System.out.println(quotes[id]);
        }
        catch(Exception ex)
        {
            System.out.println("The number you entered is not between 1 and 10. ");
        }
    }
}

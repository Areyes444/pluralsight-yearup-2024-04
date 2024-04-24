package com.pluralsight;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        while(true)
        {
            String filePath = promptUserForStory();

            if(filePath.equalsIgnoreCase("exit"))
            {
                return;
            }

            String story = readStory(filePath);

            System.out.println(story);
        }
    }

    public static String promptUserForStory()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println();
        System.out.println("Available Stories:");
        System.out.println(" 1) Goldilocks");
        System.out.println(" 2) Hansel and Gretel");
        System.out.println(" 3) Mary had a Little Lamb");
        System.out.println(" 4) Exit");
        System.out.print("Enter a choice: ");
        int choice = userInput.nextInt();

        switch (choice)
        {
            case 1:
                return "files/goloilocks.txt";
            case 2:
                return "files/hansel_and_gretel.txt";
            case 3:
                return "files/mary_had_a_little_lamb.txt";
            default:
                return "Exit";
        }

    }

    public static String readStory(String fileName)
    {
        File file = new File(fileName);
        StringBuilder builder = new StringBuilder();

        try
        {
            // text stream
            FileInputStream fileStream = new FileInputStream(file);
            Scanner fileScanner = new Scanner(fileStream);

            while (fileScanner.hasNext())
            {
                String line = fileScanner.nextLine();
                builder.append(line + "\n");
            }
        }
        catch(FileNotFoundException ex)
        {

        }

        return builder.toString();
    }
}
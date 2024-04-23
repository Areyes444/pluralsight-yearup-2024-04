package com.pluralsight;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the name of the file: ");
        String fileName = userInput.nextLine();

        String filePath = "files/mary_had_a_little_lamb.txt";

        // 1. I need a File object that points to the text file
        File file = new File(filePath);

        // 2. I need a file reader to open the file (Scanner)
        try(Scanner fileScanner = new Scanner(file))
        {
            int wordCount = 0;

            // 3. read the contents of the file
            while(fileScanner.hasNext())
            {
                String line = fileScanner.nextLine();
                String[] words = line.split(" ");
                wordCount += words.length;

                System.out.println(line);
            }

            System.out.println();
            System.out.println("Word count: " + wordCount);
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("That was a bad file name");
        }
        // fileScanner.close() has already been called

    }
}
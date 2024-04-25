package com.pluralsight;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LoggerDemo
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        logMessage("Start application");

        while(true)
        {
            System.out.println();
            System.out.print("Enter a number to divide: ");
            int numerator = userInput.nextInt();
            System.out.print("Enter a number to divide by: ");
            int denominator = userInput.nextInt();

            try
            {
                int answer = numerator / denominator;

                if (answer == 15)
                {
                    System.out.println("You got the magic answer - game over");
                    logMessage("End application");
                    break;
                }
            }
            catch(Exception ex)
            {
                System.out.println("There was a problem, please try again.");
                logMessage("Error: " + ex.getMessage());
            }

        }
    }

    public static void logMessage(String message)
    {
        File file = new File("logs/application.log");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("kk:mm:ss");

        try(
            FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter writer = new PrintWriter(fileWriter)
        )
        {
            writer.printf("%s %s - %s\n", now.format(dateFormatter), now.format(timeFormatter), message);
        }
        catch (Exception ex)
        {

        }
    }
}

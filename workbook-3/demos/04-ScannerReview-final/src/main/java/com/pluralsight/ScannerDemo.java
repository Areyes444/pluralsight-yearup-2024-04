package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class ScannerDemo
{
    public static void main(String[] args)
    {
        File file = new File("files/employees.csv");

        try(
                FileInputStream fileStream = new FileInputStream(file);
                Scanner reader = new Scanner(fileStream);
        )
        {
            reader.useDelimiter("[|\\r]");
            // skip the header line
            reader.nextLine();

            while(reader.hasNextLine())
            {
                // read all the parts of the line, instead of reading the whole line
                String id = reader.next();
                String firstName = reader.next();
                String lastName = reader.next();
                double hoursWorked = reader.nextDouble();
                double payRate = reader.nextDouble();

                System.out.println(firstName + " makes " + payRate + " per hour.");

                if(reader.hasNextLine())
                {
                    reader.nextLine();
                }
            }


        }
        catch(IOException ex)
        {

        }
    }
}
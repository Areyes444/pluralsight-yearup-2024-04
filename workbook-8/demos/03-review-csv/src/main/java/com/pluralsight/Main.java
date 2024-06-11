package com.pluralsight;

import java.io.File;
import java.util.Scanner;

public class Main
{
    // display a list of city names
    public static void main(String[] args)
    {
        // 1. open the file
        File file = new File("files/cities.csv");

        try(Scanner scanner = new Scanner(file))
        {
            scanner.nextLine();
            // 2. loop through all lines
            while (scanner.hasNextLine())
            {
                String line = scanner.nextLine();
                String[] columns = line.split("\\|");

                int id = Integer.parseInt(columns[0]);
                String city = columns[1];
                String country = columns[2];
                String state = columns[3];
                int population = Integer.parseInt(columns[4]);

                System.out.printf("%4d: %-20s %3s %-15s %d  \n", id, city, country, state, population);
            }

        }
        catch(Exception e)
        {

        }
    }
}
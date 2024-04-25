package com.pluralsight;

import java.io.*;

public class BufferedReaderDemo
{
    public static void main(String[] args)
    {
        File file = new File("files/employees.csv");

        try(
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
        )
        {
            // skip the header line
            String line = reader.readLine();

            while((line = reader.readLine()) != null)
            {
                String[] columns = line.split("[|]");

                int id = Integer.parseInt(columns[0]);
                String name = columns[1];
                double hoursWorked = Double.parseDouble(columns[2]);
                double payRate = Double.parseDouble(columns[3]);

                System.out.println(name + " makes " + payRate + " per hour.");
            }


        }
        catch(IOException ex)
        {

        }
    }
}
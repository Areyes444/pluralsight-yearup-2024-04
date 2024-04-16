package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateConversion
{
    public static void main(String[] args)
    {
        convertDatesBasic();
        convertDatesCustom();
    }

    public static void convertDatesBasic()
    {
        String userInput = "2002-10-17";
        LocalDate birthDay = LocalDate.parse(userInput);

        System.out.println(birthDay.getMonth());
        System.out.println(birthDay.getMonthValue());
    }

    public static void convertDatesCustom()
    {
        String userInput;
        DateTimeFormatter formatter;

        userInput = "10/17/2022";
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate birthDay = LocalDate.parse(userInput, formatter);
        System.out.println(birthDay);

        userInput = "7 Oct 2002";
        formatter = DateTimeFormatter.ofPattern("d MMM yyyy");
        birthDay = LocalDate.parse(userInput, formatter);
        System.out.println(birthDay);
        System.out.println(birthDay.format(formatter));
    }
}

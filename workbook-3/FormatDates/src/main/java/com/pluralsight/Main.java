package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main
{
    public static void main(String[] args)
    {
        monthDayAndYear();
        YearMonthDay();
        MonthDayYear();
        NameofDayMonthDayYear();
        HourMinuteDayMonthYear();



    }

    public static void monthDayAndYear()
    {
        System.out.println("*".repeat(20));
        System.out.println("   Month/Day/Year    ");
        System.out.println("*".repeat(20));
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(today.format(formatter));
        System.out.println();


    }

    public static void YearMonthDay()
    {
        System.out.println("*".repeat(20));
        System.out.println("   Year/Month/Day    ");
        System.out.println("*".repeat(20));
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(today.format(formatter));
        System.out.println();
    }

    public static void MonthDayYear()
    {
        System.out.println("*".repeat(20));
        System.out.println("   Month/Day/Year    ");
        System.out.println("*".repeat(20));
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d,yyyy");
        System.out.println(today.format(formatter));
        System.out.println();

    }

    public static void NameofDayMonthDayYear()
    {
        System.out.println("*".repeat(40));
        System.out.println("   Day Of Week/Month/Day/Year    ");
        System.out.println("*".repeat(40));
        LocalDate today = LocalDate.now();
        ZonedDateTime gmtNow = ZonedDateTime.now(ZoneId.of("GMT"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE,MMM d,yyyy HH:mm");
        System.out.println(gmtNow.format(formatter));
        System.out.println();
    }

    public static void HourMinuteDayMonthYear()
    {
        System.out.println("*".repeat(40));
        System.out.println("  Hour Minutes Day Month Year    ");
        System.out.println("*".repeat(40));
        LocalDate today = LocalDate.now();
        ZonedDateTime dateTime = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm dd-MMM-yyyy");
        System.out.println(dateTime.format(formatter));
        System.out.println();
    }




}

//ZonedDateTime dateTime = ZonedDateTime.now();
        //System.out.println(dateTime);

        //for(String id : ZoneId.getAvailableZoneIds())
       // {
       // System.out.println(id);
       // }
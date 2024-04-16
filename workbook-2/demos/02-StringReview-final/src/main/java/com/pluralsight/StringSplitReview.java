package com.pluralsight;

import java.util.regex.Pattern;

public class StringSplitReview
{
    public static void main(String[] args)
    {
        String input = "Slytherin:Gryffindor|23:59";

//        String[] parts = input.split(Pattern.quote("|"));
//        String[] parts = input.split("\\|");
        String[] parts = input.split("[:|]");

        System.out.println(parts[0]);
        System.out.println(parts[1]);
        System.out.println(parts[2]);
        System.out.println(parts[3]);

        System.out.println("Hello\\nWorld");
    }
}

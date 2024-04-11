package com.pluralsight;

public class VariableLiterals
{
    public static void main(String[] args)
    {
        // using hardcoded literal values

        // whole numbers
        byte byteValue = 101; // whole numbers are treated as int by default, but will be converted to byte automatically as needed
        short shortValue = 101; // whole numbers are treated as int by default, but will be converted to short automatically as needed
        int intValue = 101; // whole numbers treated as int by default
        long longValue = 101; // whole numbers are treated as int by default, but will be converted to long automatically as needed
        longValue = 101L; //you can add L (or l) to explicitly treat a number as a long

        // floating point numbers
        double doubleValue = 7.25; // decimals are treated as double by default
        float floatValue = 7.25f; // must include F (or f) to treat as float because a decimal is double by default

        // others
        String stringValue = "Hi"; // double quotes must be used for strings
        char charValue = 'a'; // single quotes must be used for chars
        boolean booleanValue = true; // the keyword true or false must be used for booleans

    }
}

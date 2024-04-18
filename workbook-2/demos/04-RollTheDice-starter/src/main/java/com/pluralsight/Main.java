package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        Dice dice = new Dice();

        int roll1;

        for(int i = 0; i < 20; i++)
        {
            roll1 = dice.roll();

            System.out.println(roll1);
        }
    }
}
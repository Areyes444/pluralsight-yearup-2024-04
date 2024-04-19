package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        Dice dice = new Dice();

        int die1;
        int die2;
        int sum;

        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for(int i = 1; i <= 100; i++)
        {
            die1 = dice.roll();
            die2 = dice.roll();
            sum = die1 + die2;

            System.out.printf("Roll %d: %d - %d  Sum: %d\n", i, die1, die2, sum);

            if(sum == 2) twoCounter++;
            else if(sum== 4) fourCounter++;
            else if(sum== 6) sixCounter++;
            else if(sum== 7) sevenCounter++;
        }

        System.out.println("--------------------------");
        System.out.printf("Count 2: %d\n", twoCounter);
        System.out.printf("Count 4: %d\n", fourCounter);
        System.out.printf("Count 6: %d\n", sixCounter);
        System.out.printf("Count 7: %d\n", sevenCounter);

    }
}
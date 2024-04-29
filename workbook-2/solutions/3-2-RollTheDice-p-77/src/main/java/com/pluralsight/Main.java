package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        Die die = new Die();
        int numberOfRolls = 2500;

        int twoCount = 0;
        int threeCount = 0;
        int fourCount = 0;
        int fiveCount = 0;
        int sixCount = 0;
        int sevenCount = 0;
        int eightCount = 0;
        int nineCount = 0;
        int tenCount = 0;
        int elevenCount = 0;
        int twelveCount = 0;

        for (int i = 0; i < numberOfRolls; i++)
        {
            int die1 = die.roll();
            int die2 = die.roll();
            int rollScore = die1 + die2;

            switch (rollScore)
            {
                case 2:
                    twoCount++;
                    break;
                case 3:
                    threeCount++;
                    break;
                case 4:
                    fourCount++;
                    break;
                case 5:
                    fiveCount++;
                    break;
                case 6:
                    sixCount++;
                    break;
                case 7:
                    sevenCount++;
                    break;
                case 8:
                    eightCount++;
                    break;
                case 9:
                    nineCount++;
                    break;
                case 10:
                    tenCount++;
                    break;
                case 11:
                    elevenCount++;
                    break;
                case 12:
                default:
                    twelveCount++;
                    break;
            }

        }

        System.out.println("##  rolls  percent");
        System.out.println("--  -----  -------");

        printStat(2, twoCount, numberOfRolls);
        printStat(3, threeCount, numberOfRolls);
        printStat(4, fourCount, numberOfRolls);
        printStat(5, fiveCount, numberOfRolls);
        printStat(6, sixCount, numberOfRolls);
        printStat(7, sevenCount, numberOfRolls);
        printStat(8, eightCount, numberOfRolls);
        printStat(9, nineCount, numberOfRolls);
        printStat(10, tenCount, numberOfRolls);
        printStat(11, elevenCount, numberOfRolls);
        printStat(12, twelveCount, numberOfRolls);

    }

    public static void printStat(int number, int count, int numberOfRolls)
    {
        double percent = (count * 100.00 )/ numberOfRolls;
        System.out.printf("%2d  %5d  %5.0f %% \n", number, count, percent);
    }
}
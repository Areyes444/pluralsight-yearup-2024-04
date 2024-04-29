package com.pluralsight;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] scores = createScores(10);

        System.out.println();
        System.out.println("All scores");
        System.out.println("----------------------------------------------------");
        printAllScores(scores);

        Arrays.sort(scores);
        System.out.println();
        System.out.println("Sorted");
        System.out.println("----------------------------------------------------");
        printAllScores(scores);

        System.out.println();

        printAverageScore(scores);
        printHighScore(scores);
        printLowScore(scores);
        printMedianScore(scores);
    }

    private static void printAverageScore(int[] scores)
    {
        int sum = 0;
        for(int score : scores)
        {
            sum += score;
        }
        int average = sum / scores.length;

        System.out.println("Average: " + average);
    }

    private static void printHighScore(int[] scores)
    {
        int high = scores[0];
        for(int score: scores)
        {
            if(score > high)
                high = score;
        }

        System.out.println("High Score: " + high);
    }

    private static void printLowScore(int[] scores)
    {
        int low = scores[0];
        for(int score: scores)
        {
            if(score < low)
                low = score;
        }

        System.out.println("Low score: " + low);
    }

    private static void printAllScores(int[] scores)
    {
        for(int score : scores)
        {
            System.out.print(score + " ");
        }
        System.out.println();
    }

    private static int[] createScores(int length)
    {
        int[] scores = new int[length];
        for (int i = 0; i < scores.length; i++)
        {
            scores[i] = (int)(Math.random() * 25 + 75);
        }

        return scores;
    }

    private static void printMedianScore(int[] scores)
    {
        // array must be sorted
        int middle = scores.length / 2;
        int median;
        if(scores.length % 2 == 0)
        {
            // if the array has an even # get the average of the 2 middle numbers
            median = (scores[middle - 1] + scores[middle])/2;
        }
        else
        {
            // if the array has an odd # get the middle number
            median = scores[middle];
        }

        System.out.println("Median: " + median);
    }
}

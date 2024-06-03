package com.pluralsight;

import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        findMinOld();
        findMinWithStream();
    }

    /******************************
     * BEGIN loop version
     *****************************/
    public static void findMinOld()
    {
        List<Integer> numbers = Arrays.asList(new Integer[]{59,18,2,97,45,23,-6,15,-87,45,198});

        int lowest = numbers.getFirst();
        for(int number : numbers)
        {
            lowest = min(lowest, number);
        }

        System.out.println("the lowest number is: " + lowest);
    }

    public static int min(int currentLowest, int currentNumber)
    {
        return (currentLowest < currentNumber) ? currentLowest : currentNumber;
    }
    /******************************
     * END loop version
     *****************************/


    /******************************
     * BEGIN stream version
     *****************************/
    public static void findMinWithStream()
    {
        List<Integer> numbers = Arrays.asList(new Integer[]{59,18,2,97,45,23,-6,15,-87,45,198});

        int lowest = numbers.stream()
                            .reduce(
                                    numbers.getFirst(),
                                    (currentLowest, currentNumber) -> (currentLowest < currentNumber) ? currentLowest : currentNumber
                            );

        System.out.println("the lowest number is: " + lowest);
    }
    /******************************
     * END stream version
     *****************************/
}
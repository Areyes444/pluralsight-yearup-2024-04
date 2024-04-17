package com.pluralsight;

public class MathApp
{
    public static void main(String[] args)
    {
        // find all 7 questions in your workbook on page 
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();

    }

    // write ONLY code for QUESTION 1 in this function
    public static void question1()
    {
        // Question 1:
        // declare variables here


        // code the logic to the problem here


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 2 in this function
    public static void question2()
    {
        // Question 2:
        // declare variables here


        // code the logic to the problem here


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 3 in this function
    public static void question3()
    {
        // Question 3:
        // declare variables here


        // code the logic to the problem here


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 4 in this function
    public static void question4()
    {
        // Question 4:
        // declare variables here


        // code the logic to the problem here


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 5 in this function
    public static void question5()
    {
        // Question 5:
        // declare variables here


        // code the logic to the problem here


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);

    }


    // write ONLY code for QUESTION 6 in this function
    public static void question6()
    {
        // Question 6:
        // declare variables here


        // code the logic to the problem here


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 7 in this function
    public static void question7()
    {
        // Question 7: create a random number between 10 and 20
        // declare variables here
        int lowEdge = 75;
        int highEdge = 150;
        int highEdgeTemp = highEdge - lowEdge;
        double seedValue = Math.random(); // the number between 0-1
        int random = (int)((seedValue * highEdgeTemp) + lowEdge);

        // code the logic to the problem here


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Random number: " + random);
    }
}
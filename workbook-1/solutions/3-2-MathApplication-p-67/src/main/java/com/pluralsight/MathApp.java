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
        double bobSalary = 50000.0;
        double garySalary = 75000.0;
        double highestSalary;

        // code the logic to the problem here
        highestSalary = Math.max(bobSalary, garySalary);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println();
        System.out.println("Question 1");
        System.out.println("The highest salary is: " + highestSalary);
    }


    // write ONLY code for QUESTION 2 in this function
    public static void question2()
    {
        // Question 2:
        // declare variables here
        double carPrice = 19250;
        double truckPrice = 45189;
        double lowestPrice;

        // code the logic to the problem here
        lowestPrice = Math.min(carPrice, truckPrice);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println();
        System.out.println("Question 2");
        System.out.println("The lowest vehicle price is: " + lowestPrice);
    }


    // write ONLY code for QUESTION 3 in this function
    public static void question3()
    {
        // Question 3:
        // declare variables here
        double radius = 7.25;
        double area;


        // code the logic to the problem here
        area = Math.PI * Math.pow(radius, 2);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println();
        System.out.println("Question 3");
        System.out.println("The area of a circle with a radius of 7.25 is: " + area);
    }


    // write ONLY code for QUESTION 4 in this function
    public static void question4()
    {
        // Question 4:
        // declare variables here
        double squaredVariable = 5.0;
        double root;


        // code the logic to the problem here
        root = Math.sqrt(squaredVariable);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println();
        System.out.println("Question 4");
        System.out.println("The square root of 5.0 is: " + root);

    }


    // write ONLY code for QUESTION 5 in this function
    public static void question5()
    {
        // Question 5:
        // declare variables here
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;

        int width, height;
        double a2, b2, c2; // pythagorean theorem a2 + b2 = c2
        double distance;

        // code the logic to the problem here
        width = x2 - x1;
        height = y2 - y1;
        a2 = Math.pow(width, 2);
        b2 = Math.pow(height, 2);
        c2 = a2 + b2;
        distance = Math.sqrt(c2);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println();
        System.out.println("Question 5");
        System.out.println("The distance between (5,10) and (85,50) is: " + distance);

    }


    // write ONLY code for QUESTION 6 in this function
    public static void question6()
    {
        // Question 6:
        // declare variables here
        double negativeValue = -3.8;

        // code the logic to the problem here
        double absoluteValue = Math.abs(negativeValue);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println();
        System.out.println("Question 6");
        System.out.println("The absolute value of -3.8 is: " + absoluteValue);
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
        System.out.println();
        System.out.println("Question 7");
        System.out.println("A random number between 75 and 150 is: " + random);
    }
}
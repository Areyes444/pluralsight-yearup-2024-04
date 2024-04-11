package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
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
    public static void question1() {
        // Question 1:
        // declare variables here
        int bobSalary = 15000;
        int garySalary = 29000;
        int highestSalary;


        // code the logic to the problem here
        highestSalary = Math.max(garySalary, bobSalary);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The Highest Salary: Gary " + highestSalary);
    }


    // write ONLY code for QUESTION 2 in this function
    public static void question2() {
        // Question 2:
        // declare variables here
        double carPrice = 9985.65;
        double truckPrice = 59658.52;
        double smallestVariable;

        // code the logic to the problem here
        smallestVariable = Math.min(carPrice, truckPrice);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The Smallest Variable: Truck " + smallestVariable);
    }


    // write ONLY code for QUESTION 3 in this function
    public static void question3() {
        // Question 3:
        // declare variables here
        double circleArea;
        double circleRadius = 7.25;

        // code the logic to the problem here
        circleArea = Math.PI * Math.pow(circleRadius, 2);

        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The Area of a circle with the radius 7.25 is " + circleArea);
    }


    // write ONLY code for QUESTION 4 in this function
    public static void question4() {
        // Question 4:
        // declare variables here
        double x = 5;
        double squareRoot = Math.sqrt(x);
        double VariableSquared;


        // code the logic to the problem here
        VariableSquared = Math.sqrt(x);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The square root of 5 is " + VariableSquared);
    }


    // write ONLY code for QUESTION 5 in this function
    public static void question5() {
        // Question 5:
        // declare variables here
        int PointX1 = 5;
        int PointY1 = 10;

        int PointX2 = 85;
        int PointY2 = 50;


        // code the logic to the problem here
        double coordinates1 = Math.pow((PointX1 - PointX2), 2);
        double coordinates2 = Math.pow((PointY1 - PointY2), 2);
        double finalCoordinates = Math.sqrt(coordinates1 + coordinates2);
        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The Distance between points is " + finalCoordinates);
    }


    // write ONLY code for QUESTION 6 in this function
    public static void question6() {
        // Question 6:
        // declare variables here
        float positiveVariable;
        float negativeVariable = -3.8f;


        // code the logic to the problem here
        positiveVariable = Math.abs(negativeVariable);


        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The positive value is " + positiveVariable);
    }


    // write ONLY code for QUESTION 7 in this function
    public static void question7() {
        // Question 7:
        // declare variables here
        double randomNumber = Math.random();


        // code the logic to the problem here



        // use System.out.println() to display results
        // ex: System.out.println("The answer is " + answer);
        System.out.println("Random number between 0 and 1: " + randomNumber);
    }
}
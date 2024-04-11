package com.pluralsight;

public class AssignmentOperators
{
    public static void main(String[] args)
    {
        // counting is a common task
        int counter = 0;

        // the following 3 lines of code all increase the value by 1
        counter = counter + 1; // add 1 to the current value and change the counter variable
        counter += 1; // adds 1 to the counter variable (shorthand for the line above)
        counter++; // increment the counter variable by 1 (only possible to increment by 1)
        System.out.println("counter started at 0, and incremented 3 times: " + counter);

        // countdown
        int countDown = 10;
        countDown = countDown - 1;
        countDown -= 1;
        countDown--;
        System.out.println("countDown started at 10, and decremented 3 times: " + counter);


        // other assignment operators
        int numberOfStudents;

        // adding
        numberOfStudents = 15;
        numberOfStudents += 5;
        System.out.println("Number of students: 15 + 5 = " + numberOfStudents);

        // subtracting
        numberOfStudents = 15;
        numberOfStudents -= 5;
        System.out.println("Number of students: 15 - 5 = " + numberOfStudents);

        // multiplying
        numberOfStudents = 15;
        numberOfStudents *= 2;
        System.out.println("Number of students: 15 * 2 = " + numberOfStudents);

        // dividing
        numberOfStudents = 15;
        numberOfStudents /= 2; // remember integer division has no decimal places
        System.out.println("Number of students: 15 / 2 = " + numberOfStudents);

        // modulus (remainder division)
        numberOfStudents = 15;
        numberOfStudents %= 2; // remainder of 15 / 2
        System.out.println("Remainder of the number of students: 15 % 2 = " + numberOfStudents);

        System.out.println();

        // Pre and Post incrementing
        // x++ vs ++x -> what is the difference?

        // x++ executes the line logic first, and then increments by 1
        int value = 10;
        System.out.println("value = " + value);
        System.out.println("println( value++ ) = " + value++);
        System.out.println("value = " + value);
        System.out.println();


        // ++x increments the value by 1 first and then executes the line
        value = 10;
        System.out.println("value = " + value);
        System.out.println("println( ++value ) = " + ++value);
        System.out.println("value = " + value);
        System.out.println();
    }
}

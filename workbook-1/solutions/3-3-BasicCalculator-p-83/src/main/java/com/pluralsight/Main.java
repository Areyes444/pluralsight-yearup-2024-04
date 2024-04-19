package com.pluralsight;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        int leftOperand;
        int rightOperand;
        String operation;
        int answer;
        String selection;

        System.out.print("Enter the first number: ");
        leftOperand = userInput.nextInt();
        userInput.nextLine();
        System.out.print("Enter the first number: ");
        rightOperand = userInput.nextInt();
        userInput.nextLine();

        System.out.println("Possible calculations:");
        System.out.println("  (A)dd");
        System.out.println("  (S)ubtract");
        System.out.println("  (M)ultiply");
        System.out.println("  (D)ivide");
        System.out.print("Please select an option: ");
        selection = userInput.nextLine().strip().toUpperCase();

        switch (selection)
        {
            case "D":
                operation = "/";
                answer = leftOperand / rightOperand;
                break;
            case "M":
                operation = "*";
                answer = leftOperand * rightOperand;
                break;
            case "S":
                operation = "-";
                answer = leftOperand - rightOperand;
                break;
            case "A":
            default:
                operation = "+";
                answer = leftOperand + rightOperand;
                break;
        }

        System.out.printf("%d %s %d = %d", leftOperand, operation, rightOperand, answer);


    }
}
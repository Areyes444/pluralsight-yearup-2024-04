package com.pluralsight.views;

import com.pluralsight.models.Actor;

import java.util.Scanner;

public class ActorAddView
{
    public Actor getNewActor()
    {
        Scanner in = new Scanner(System.in);

        System.out.println();
        System.out.println("Add new actor");
        System.out.println("-".repeat(40));
        System.out.print("Enter the first name: ");
        String firstName = in.nextLine().strip();
        System.out.print("Enter the last name: ");
        String lastName = in.nextLine().strip();

        return new Actor(0, firstName, lastName);
    }
}

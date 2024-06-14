package com.pluralsight.views.actors;

import com.pluralsight.views.ViewBase;

public class ActorsHomeView extends ViewBase
{
    public int getUserSelection()
    {
        System.out.println();
        System.out.println("Actors Home");
        System.out.println("-".repeat(40));
        System.out.println("1) List All Actors");
        System.out.println("2) Search Actors");
        System.out.println("3) Add New Actor");
        System.out.println("4) Update Actor Information");
        System.out.println("5) Delete Actor");

        System.out.println("0) Home Screen");
        System.out.println();
        System.out.print("Please select an option: ");

        return Integer.parseInt(in.nextLine());
    }
}

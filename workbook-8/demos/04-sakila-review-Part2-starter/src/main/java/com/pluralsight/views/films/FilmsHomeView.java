package com.pluralsight.views.films;

import com.pluralsight.views.ViewBase;

public class FilmsHomeView extends ViewBase
{
    public int getUserSelection()
    {
        System.out.println();
        System.out.println("Films");
        System.out.println("-".repeat(40));
        System.out.println("1) Search Films by Title");
        System.out.println("2) Search Films by Actor Id");
        System.out.println("3) Add New Film");
        System.out.println("4) Update Film");
        System.out.println("5) Delete Film");
        System.out.println("6) Add Actor to Film");
        System.out.println("7) Remove Actor from Film");

        System.out.println("0) Home Screen");
        System.out.println();
        System.out.print("Please select an option: ");

        return Integer.parseInt(in.nextLine());
    }
}

package com.pluralsight.views.films;

import com.pluralsight.views.ViewBase;

public class FilmSearchByActorView extends ViewBase
{
    public int getActorId()
    {
        System.out.println();
        System.out.println("Search by Actor Id");
        System.out.println("-".repeat(40));

        System.out.print("Enter Actor Id: ");
        int actorId = Integer.parseInt(in.nextLine().strip());

        return actorId;
    }
}

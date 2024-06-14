package com.pluralsight.views.actors;

import com.pluralsight.models.Actor;
import com.pluralsight.views.ViewBase;

public class ActorSearchByIdView extends ViewBase
{
    public int getActorId()
    {
        System.out.println();
        System.out.println("Search for Actor");
        System.out.println("-".repeat(40));
        System.out.print("Enter the id: ");

        return Integer.parseInt(in.nextLine());
    }
}

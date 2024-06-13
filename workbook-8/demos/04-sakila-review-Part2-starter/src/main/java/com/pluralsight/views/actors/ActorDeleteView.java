package com.pluralsight.views.actors;

import com.pluralsight.views.ViewBase;

public class ActorDeleteView extends ViewBase
{
    public int getActorInformation()
    {

        System.out.println();
        System.out.println("Delete actor");
        System.out.println("-".repeat(40));

        System.out.print("Enter the id of the actor to delete: ");

        return Integer.parseInt(in.nextLine().strip());
    }
}

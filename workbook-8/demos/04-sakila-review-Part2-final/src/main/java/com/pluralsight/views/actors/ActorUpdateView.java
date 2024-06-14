package com.pluralsight.views.actors;

import com.pluralsight.models.Actor;
import com.pluralsight.views.ViewBase;

public class ActorUpdateView extends ViewBase
{
    public Actor getActorInformation()
    {
        System.out.println();
        System.out.println("Update actor");
        System.out.println("-".repeat(40));

        System.out.print("Enter the id: ");
        int id = Integer.parseInt(in.nextLine().strip());

        System.out.print("Enter the first name: ");
        String firstName = in.nextLine().strip();

        System.out.print("Enter the last name: ");
        String lastName = in.nextLine().strip();

        return new Actor(id, firstName, lastName);
    }
}

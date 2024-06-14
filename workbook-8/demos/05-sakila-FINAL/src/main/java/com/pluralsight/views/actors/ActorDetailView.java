package com.pluralsight.views.actors;

import com.pluralsight.models.Actor;
import com.pluralsight.views.ViewBase;

public class ActorDetailView extends ViewBase
{
    public void displayActor(Actor actor)
    {
        System.out.println("Actor Details");
        System.out.println("-".repeat(40));

        if(actor == null)
        {
            System.out.println("The actor could not be found");
            return;
        }

        System.out.println("ID:         " + actor.getActorId());
        System.out.println("First Name: " + actor.getFirstName());
        System.out.println("Last Name:  " + actor.getLastName());
    }
}

package com.pluralsight.views.actors;

import com.pluralsight.models.Actor;
import com.pluralsight.views.ViewBase;

import java.util.List;

public class ActorDetailView extends ViewBase
{
    public void displayActors(Actor actor)
    {
        System.out.println("Actor Details");
        System.out.println("-".repeat(40));

        System.out.println("ID:         " + actor.getActorId());
        System.out.println("First Name: " + actor.getFirstName());
        System.out.println("Last Name:  " + actor.getLastName());
    }
}

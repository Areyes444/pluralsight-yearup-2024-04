package com.pluralsight.views;

import com.pluralsight.models.Actor;

import java.util.List;

public class ActorListView
{
    public void displayActors(List<Actor> actors)
    {
        System.out.println("Actors");
        System.out.println("-".repeat(40));
        actors.forEach( actor -> {
            System.out.printf("%-4d %-15s %s\n", actor.getActorId(), actor.getFirstName(), actor.getLastName());
        });
    }
}

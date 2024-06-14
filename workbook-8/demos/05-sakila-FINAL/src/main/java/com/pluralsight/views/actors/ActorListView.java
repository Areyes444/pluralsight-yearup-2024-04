package com.pluralsight.views.actors;

import com.pluralsight.models.Actor;
import com.pluralsight.views.ViewBase;

import java.util.List;

public class ActorListView extends ViewBase
{
    public void displayActors(List<Actor> actors)
    {
        System.out.println();
        System.out.println("Actors");
        System.out.println("-".repeat(40));
        actors.forEach( actor -> {
            System.out.printf("%-4d %-15s %s\n", actor.getActorId(), actor.getFirstName(), actor.getLastName());
        });
    }
}

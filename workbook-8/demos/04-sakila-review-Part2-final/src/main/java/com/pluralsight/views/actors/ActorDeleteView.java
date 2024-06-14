package com.pluralsight.views.actors;

import com.pluralsight.models.Actor;
import com.pluralsight.views.ViewBase;

public class ActorDeleteView extends ViewBase
{
    public boolean getUserDeleteResponse(Actor actor)
    {

        System.out.print("You are about to delete " + actor.getFirstName());
        System.out.println("Do you want to continue? (y/n) ");

        String answer = in.nextLine().strip();

        return answer.equalsIgnoreCase("y");
    }
}

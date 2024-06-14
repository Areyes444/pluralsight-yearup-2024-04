package com.pluralsight.views.films;

import com.pluralsight.models.FilmActor;
import com.pluralsight.views.ViewBase;

public class FilmActorAddView extends ViewBase
{
    public FilmActor getFilmActor()
    {
        System.out.println();
        System.out.println("Add Actor to Film");
        System.out.println("-".repeat(40));

        System.out.print("Enter Actor Id (0 to cancel): ");
        int actorId = Integer.parseInt(in.nextLine().strip());
        if(actorId == 0) return null;

        System.out.print("Enter Film Id (0 to cancel): ");
        int filmId = Integer.parseInt(in.nextLine().strip());
        if(filmId == 0) return null;

        return new FilmActor(actorId, filmId);
    }
}

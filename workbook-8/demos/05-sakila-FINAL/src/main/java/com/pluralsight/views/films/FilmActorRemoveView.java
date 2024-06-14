package com.pluralsight.views.films;

import com.pluralsight.models.FilmActor;
import com.pluralsight.views.ViewBase;

public class FilmActorRemoveView extends ViewBase
{
    public FilmActor getFilmActor()
    {
        System.out.println();
        System.out.println("Remove Actor from Film");
        System.out.println("-".repeat(40));

        System.out.print("Enter Actor Id: ");
        int actorId = Integer.parseInt(in.nextLine().strip());
        if(actorId == 0) return null;

        System.out.print("Enter Film Id: ");
        int filmId = Integer.parseInt(in.nextLine().strip());
        if(filmId == 0) return null;

        return new FilmActor(actorId, filmId);
    }
}

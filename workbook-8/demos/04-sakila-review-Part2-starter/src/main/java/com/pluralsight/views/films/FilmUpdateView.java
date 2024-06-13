package com.pluralsight.views.films;

import com.pluralsight.models.Film;
import com.pluralsight.views.ViewBase;

public class FilmUpdateView extends ViewBase
{
    public Film getUpdatedFilm()
    {
        System.out.println();
        System.out.println("Update Film");
        System.out.println("-".repeat(40));

        // prompt user for all film information (id, title, description, releaseYear, length)

        return new Film();
    }
}

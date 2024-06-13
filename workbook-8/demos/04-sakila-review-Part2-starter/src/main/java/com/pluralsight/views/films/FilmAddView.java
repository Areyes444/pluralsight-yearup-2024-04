package com.pluralsight.views.films;

import com.pluralsight.models.Film;
import com.pluralsight.views.ViewBase;

public class FilmAddView extends ViewBase
{
    public Film getNewFilm()
    {
        System.out.println();
        System.out.println("Add new Film");
        System.out.println("-".repeat(40));

        // prompt user for new film information

        return new Film();
    }
}

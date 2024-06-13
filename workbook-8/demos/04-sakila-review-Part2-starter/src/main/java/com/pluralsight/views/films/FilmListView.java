package com.pluralsight.views.films;

import com.pluralsight.models.Film;
import com.pluralsight.views.ViewBase;

import java.util.List;

public class FilmListView extends ViewBase
{
    public void displayFilms(List<Film> films)
    {
        System.out.println("Film Search Results");
        System.out.println("-".repeat(40));

        // display list of films
    }
}

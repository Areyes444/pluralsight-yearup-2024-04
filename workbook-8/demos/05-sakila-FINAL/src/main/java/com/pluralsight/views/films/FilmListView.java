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

        System.out.printf("%-4s %-30s %-6s %s\n", "Id","Title","Year","Length");
        System.out.printf("%-4s %-30s %-6s %s\n", "----","-".repeat(30),"------","------");
        films.forEach(film -> {
            System.out.printf("%-4d %-30s %-6d %d\n", film.getFilmId(), film.getTitle(), film.getReleaseYear(), film.getLength());
        });
    }
}

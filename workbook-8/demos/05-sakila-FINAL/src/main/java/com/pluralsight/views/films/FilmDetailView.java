package com.pluralsight.views.films;

import com.pluralsight.models.Film;
import com.pluralsight.views.ViewBase;

import java.util.List;

public class FilmDetailView extends ViewBase
{
    public void displayFilmDetails(Film film)
    {
        System.out.println("Film Details");
        System.out.println("-".repeat(40));

        if(film == null)
        {
            System.out.println("The film could not be found");
            return;
        }

        System.out.println("ID:           " + film.getFilmId());
        System.out.println("Title:        " + film.getTitle());
        System.out.println("Description:  " + film.getDescription());
        System.out.println("Length:       " + film.getLength());
        System.out.println("Release Year: " + film.getReleaseYear());
    }
}

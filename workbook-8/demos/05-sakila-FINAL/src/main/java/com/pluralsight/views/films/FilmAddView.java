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

        System.out.print("Enter Film Title: ");
        String title = in.nextLine().strip();

        System.out.print("Enter Description: ");
        String description = in.nextLine().strip();

        System.out.print("Enter release year (yyyy): ");
        int year = Integer.parseInt(in.nextLine().strip());

        System.out.print("Enter film length: ");
        int length = Integer.parseInt(in.nextLine().strip());

        return new Film(){{
            setTitle(title);
            setDescription(description);
            setReleaseYear(year);
            setLength(length);
        }};
    }
}

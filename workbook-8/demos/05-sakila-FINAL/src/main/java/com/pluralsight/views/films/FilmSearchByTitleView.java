package com.pluralsight.views.films;

import com.pluralsight.views.ViewBase;

public class FilmSearchByTitleView extends ViewBase
{
    public String getFilmTitle()
    {
        System.out.println();
        System.out.println("Search by Title");
        System.out.println("-".repeat(40));

        System.out.print("Enter Film Title: ");
        String title = in.nextLine().strip();

        return title;
    }
}

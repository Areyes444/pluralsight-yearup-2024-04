package com.pluralsight.views.films;

import com.pluralsight.views.ViewBase;

public class FilmSearchByIdView extends ViewBase
{
    public int getFilmId()
    {
        System.out.println();
        System.out.println("Search by Film Id");
        System.out.println("-".repeat(40));

        System.out.print("Enter the Film Id:");

        return Integer.parseInt(in.nextLine());
    }
}

package com.pluralsight.views.films;

import com.pluralsight.models.Film;
import com.pluralsight.views.ViewBase;

public class FilmDeleteView extends ViewBase
{
    public boolean getUserDeleteResponse(Film film)
    {
        System.out.println();
        System.out.println("You are about to delete film " + film.getTitle());
        System.out.print("Do you want to continue? (y/n) ");

        String answer = in.nextLine().strip();
        
        return answer.equalsIgnoreCase("y");
    }
}

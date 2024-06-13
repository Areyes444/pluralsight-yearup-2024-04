package com.pluralsight.services;

import com.pluralsight.models.Film;

import java.util.List;

public interface FilmsDao
{
    List<Film> getFilmByActorId(int id); //the parameter returns from that id
}

package com.pluralsight.services;

import com.pluralsight.models.Film;

import java.util.List;

public interface FilmsDao
{
    List<Film> searchByTitle(String title);
    List<Film> searchByActor(int actorId);

    Film findFilmById(int id);
    Film addFilm(Film film);
    void updateFilm(Film film);
    void deleteFilm(int filmId);

    void addActorToFilm(int actorId, int filmId);
    void removeActorFromFilm(int actorId, int filmId);
}

package com.pluralsight.controllers;

import com.pluralsight.models.Film;
import com.pluralsight.models.FilmActor;
import com.pluralsight.services.FilmsDao;

import java.util.List;

public class FilmsController
{
    private FilmsDao filmsDao;

    public FilmsController(FilmsDao filmsDao)
    {
        this.filmsDao = filmsDao;
    }

    public List<Film> searchByTitle(String title)
    {
        return filmsDao.searchByTitle(title);
    }

    public List<Film> searchByActor(int actorId)
    {
        return filmsDao.searchByActor(actorId);
    }

    public Film findFilmById(int id)
    {
        return filmsDao.findFilmById(id);
    }

    public Film addFilm(Film film)
    {
        return filmsDao.addFilm(film);
    }
    public void updateFilm(Film film)
    {
        filmsDao.updateFilm(film);
    }

    public void deleteFilm(int filmId)
    {
        filmsDao.deleteFilm(filmId);
    }

    public void addActorToFilm(FilmActor filmActor)
    {
        filmsDao.addActorToFilm(filmActor.getActorId(), filmActor.getFilmId());
    }

    public void removeActorFromFilm(FilmActor filmActor)
    {
        filmsDao.removeActorFromFilm(filmActor.getActorId(), filmActor.getFilmId());
    }

}

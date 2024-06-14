package com.pluralsight.models;

public class FilmActor
{
    private int actorId;
    private int filmId;

    public FilmActor(int actorId, int filmId)
    {
        this.actorId = actorId;
        this.filmId = filmId;
    }

    public FilmActor()
    {
    }

    public int getActorId()
    {
        return actorId;
    }

    public void setActorId(int actorId)
    {
        this.actorId = actorId;
    }

    public int getFilmId()
    {
        return filmId;
    }

    public void setFilmId(int filmId)
    {
        this.filmId = filmId;
    }
}

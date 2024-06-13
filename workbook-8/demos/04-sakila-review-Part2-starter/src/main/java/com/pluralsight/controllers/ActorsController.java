package com.pluralsight.controllers;

import com.pluralsight.models.Actor;
import com.pluralsight.services.ActorsDao;

import java.util.List;

public class ActorsController
{
    private ActorsDao actorsDao;

    public ActorsController(ActorsDao actorsDao)
    {
        this.actorsDao = actorsDao;
    }

    public List<Actor> findAllActors()
    {
        var actors = actorsDao.getAll();

        return actors;
    }

    public void addNewActor(Actor actor)
    {
        actorsDao.addActor(actor);
    }
}

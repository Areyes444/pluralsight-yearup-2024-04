package com.pluralsight.services;

import com.pluralsight.models.Actor;

import java.util.List;

public interface ActorsDao
{
    // define all CRUD
    List<Actor> getAll();
    void addActor(Actor actor);
}

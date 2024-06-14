package com.pluralsight.application;

import com.pluralsight.models.Actor;

import java.util.List;

public class SakilaMoviesApplication
{
    private ApplicationConfiguration config;

    public SakilaMoviesApplication(ApplicationConfiguration config)
    {
        this.config = config;
    }


    public void run()
    {
        while(true)
        {
            int selection = config.homeView.getUserSelection();

            switch (selection)
            {
                case 1 -> actorsMenu();
                case 2 -> filmsMenu();
                case 0 -> System.exit(0);
            }
        }
    }

    private void actorsMenu()
    {
        while(true)
        {
            int selection = config.actorsHomeView.getUserSelection();

            switch (selection)
            {
                case 1 -> displayActorList();
                case 2 -> searchActors();
                case 3 -> addActor();
                case 4 -> updateActor();
                case 5 -> deleteActor();
                case 0 -> { return; }
            }
        }
    }

    private void displayActorList()
    {
        // go to the Actors controller and get a list of actors
        List<Actor> actors = config.actorsController.findAllActors();

        // call the ActorListView and pass in the returned list
        config.actorListView.displayActors(actors);
    }

    private void searchActors()
    {
    }

    private void addActor()
    {
        Actor actor = config.actorAddView.getNewActor();

        Actor newActor = config.actorsController.addNewActor(actor);
        config.actorDetailView.displayActor(newActor);
    }

    private void updateActor()
    {
        // find and display the actors current info
        int searchId = config.actorSearchByIdView.getActorId();
        Actor actor = config.actorsController.searchById(searchId);
        config.actorDetailView.displayActor(actor);

        // get the updated info
        Actor actorToUpdate = config.actorUpdateView.getActorInformation();
        // save the actor info
        config.actorsController.updateActor(actorToUpdate);

    }

    private void deleteActor()
    {
        // find and display the actors current info
        int searchId = config.actorSearchByIdView.getActorId();
        Actor actor = config.actorsController.searchById(searchId);
        config.actorDetailView.displayActor(actor);

        boolean okToDelete = config.actorDeleteView.getUserDeleteResponse(actor);

        if(okToDelete)
        {
            config.actorsController.deleteActor(actor.getActorId());
        }

    }



    private void filmsMenu()
    {
        while(true)
        {
            int selection = config.filmsHomeView.getUserSelection();

            switch (selection)
            {
                case 1 -> displayFilmsList();
                case 0 -> { return; }
            }
        }
    }

    private void displayFilmsList()
    {
    }
}

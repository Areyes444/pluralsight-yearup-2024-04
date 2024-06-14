package com.pluralsight.application;

import com.pluralsight.models.Actor;
import com.pluralsight.models.Film;
import com.pluralsight.models.FilmActor;

import java.util.List;

public class SakilaMoviesApplication
{
    private final ApplicationConfiguration config;

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
        Actor searchActor = config.actorSearchView.getSearchedActor();

        List<Actor> actors = config.actorsController.searchByName(searchActor.getFirstName(), searchActor.getLastName());
        config.actorListView.displayActors(actors);
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
        actorToUpdate.setActorId(actor.getActorId());
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
                case 1 -> searchFilmsByTitle();
                case 2 -> searchFilmsByActor();
                case 3 -> addFilm();
                case 4 -> updateFilm();
                case 5 -> deleteFilm();
                case 6 -> addActorToFilm();
                case 7 -> removeActorFromFilm();
                case 0 -> { return; }
            }
        }
    }

    private void searchFilmsByTitle()
    {
        String title = config.filmSearchByTitleView.getFilmTitle();
        List<Film> films = config.filmsController.searchByTitle(title);
        config.filmListView.displayFilms(films);
    }

    private void searchFilmsByActor()
    {
        int actorId = config.filmSearchByActorView.getActorId();
        List<Film> films = config.filmsController.searchByActor(actorId);
        config.filmListView.displayFilms(films);
    }

    private void addFilm()
    {
        Film film = config.filmAddView.getNewFilm();
        Film newFilm = config.filmsController.addFilm(film);
        config.filmDetailView.displayFilmDetails(newFilm);
    }

    private void updateFilm()
    {
        int filmId = config.filmSearchByIdView.getFilmId();
        Film film = config.filmsController.findFilmById(filmId);
        config.filmDetailView.displayFilmDetails(film);

        if(film != null)
        {
            Film filmToUpdate = config.filmUpdateView.getUpdatedFilm();
            filmToUpdate.setFilmId(film.getFilmId());
        }
    }

    private void deleteFilm()
    {
        int filmId = config.filmSearchByIdView.getFilmId();
        Film film = config.filmsController.findFilmById(filmId);
        config.filmDetailView.displayFilmDetails(film);
        config.filmDeleteView.getUserDeleteResponse(film);
        config.filmsController.deleteFilm(film.getFilmId());
    }

    private void addActorToFilm()
    {
        FilmActor filmActor = config.filmActorAddView.getFilmActor();
        if(filmActor == null) return;

        config.filmsController.addActorToFilm(filmActor);
    }

    private void removeActorFromFilm()
    {
        FilmActor filmActor = config.filmActorRemoveView.getFilmActor();
        if(filmActor == null) return;

        config.filmsController.removeActorFromFilm(filmActor);
    }
}

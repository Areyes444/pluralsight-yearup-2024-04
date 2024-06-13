package com.pluralsight.application;

import com.pluralsight.models.Actor;
import com.pluralsight.models.Film;
import com.pluralsight.services.ActorsDao;
import com.pluralsight.services.FilmsDao;
import com.pluralsight.services.MySqlActorsDao;
import com.pluralsight.services.MySqlFilmsDao;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;


public class SakilaMoviesApp
{
    Scanner in = new Scanner(System.in);
//creating the variables
    DataSource dataSource;
    ActorsDao actorsDao;
    FilmsDao filmsDao;



    public SakilaMoviesApp()
    {
        //initializing DAO
        this.dataSource = buildDataSource();
        actorsDao = new MySqlActorsDao(dataSource);
        filmsDao = new MySqlFilmsDao(dataSource);
    }

    private DataSource buildDataSource()
    {
        try(FileInputStream stream = new FileInputStream("src/main/resources/config.properties"))
        {
            //will be getting the variables from map(config.properties)
            Properties properties = new Properties();
            properties.load(stream);

            String connectionString = properties.getProperty("db.connectionString");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            //building the BasicDataSource object
            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setUrl(connectionString);
            dataSource.setUsername(username);
            dataSource.setPassword(password);

            return dataSource;

        } catch (IOException e) {

        }
        return null;
    }

    public void run()
    {

        System.out.println("---------------- Sakila Movies ----------------");
        String input = "";
        int choice = 2;
        while(choice != 0)
        {
            try{
                System.out.println();
                System.out.println("What would you like to today? ");
                System.out.println("1) Search Actors by Name ");
                System.out.println("2) Display what Films the Actor was in with their Actor's ID ");
                System.out.println("0) Exit ");
                System.out.print("Select an Option: ");
                input = in.nextLine().strip().replace(" ", "");
                choice = Integer.parseInt(input);
                switch (choice)
                {
                    case 1:
                        searchActorsByFirstOrLastName();
                        break;
                    case 2:
                        findFilmsWithActorsId();
                        break;
                    case 0:
                        System.out.println();
                        System.out.println("GoodBye");
                        break;
                    default:
                        System.out.println();
                        System.out.println("Invalid Input");
                }

            }
            catch (InputMismatchException e)
            {
                in.nextLine();
                System.out.println();
                System.out.println("Invalid input");
            }
            catch (NumberFormatException e)
            {
                System.out.println();
                System.out.println("Invalid input please enter a number");
            }
            catch (Exception e)
            {
                System.out.println();
                System.out.println("Something went wrong, try again");
            }
        }

    }

    private void searchActorsByFirstOrLastName()
    {
        System.out.print("Enter a Actor's First or Last Name: ");
        String ActorName = in.nextLine();

        List<Actor> actors = actorsDao.getActorByName(ActorName);

        System.out.println();
        actors.forEach(actor -> displayActor(actor));

    }

    private void displayActor(Actor actor)
    {
        System.out.println("Actor ID---Actor's First Name---Actor's Last Name-----");
        System.out.printf("%-10s  %-20s %-20s\n", actor.getId(), actor.getFirstName(), actor.getLastName());
    }


    private void findFilmsWithActorsId()
    {
        System.out.print("Enter Actor's ID: ");
        Integer id = Integer.valueOf(in.nextLine());

        List<Film> films = filmsDao.getFilmByActorId(id);

        System.out.println();

        for (Film film: films)
        {
            displayFilm(film);
        }


    }

    private void displayFilm(Film film)
    {
        System.out.println("Film ID--------Film Title---------Description----------------------------------------------------------------------------Release Year-------Film Length-----");
        System.out.printf("%-10s %-20s %-40s %-15s %-10d\n", film.getId(), film.getTitle(),film.getDescription(), film.getReleaseYear(), film.getLength());
    }




}

package com.pluralsight.services.mysql;

import com.pluralsight.models.Film;
import com.pluralsight.services.FilmsDao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySqlFilmsDao implements FilmsDao
{
    private DataSource dataSource;

    public MySqlFilmsDao(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }

    @Override
    public List<Film> searchByTitle(String title)
    {
        var films = new ArrayList<Film>();

        try(Connection connection = dataSource.getConnection())
        {
            // search logic here
        }
        catch (SQLException e)
        {
        }

        return films;
    }

    @Override
    public List<Film> searchByActor(int actorId)
    {
        var films = new ArrayList<Film>();

        try(Connection connection = dataSource.getConnection())
        {
            // search logic here
        }
        catch (SQLException e)
        {
        }

        return films;
    }

    @Override
    public void addFilm(Film film)
    {

        try(Connection connection = dataSource.getConnection())
        {
            // add logic here
        }
        catch (SQLException e)
        {
        }
    }

    @Override
    public void updateFilm(Film film)
    {

        try(Connection connection = dataSource.getConnection())
        {
            // update logic here
        }
        catch (SQLException e)
        {
        }
    }

    @Override
    public void deleteFilm(int filmId)
    {

        try(Connection connection = dataSource.getConnection())
        {
            // delete logic here
        }
        catch (SQLException e)
        {
        }
    }

    // these methods deal with the film_actor table
    @Override
    public void addActorToFilm(int actorId, int filmId)
    {

        try(Connection connection = dataSource.getConnection())
        {
            // insert logic here
        }
        catch (SQLException e)
        {
        }
    }

    @Override
    public void removeActorFromFilm(int actorId, int filmId)
    {

        try(Connection connection = dataSource.getConnection())
        {
            // delete logic here
        }
        catch (SQLException e)
        {
        }
    }
}

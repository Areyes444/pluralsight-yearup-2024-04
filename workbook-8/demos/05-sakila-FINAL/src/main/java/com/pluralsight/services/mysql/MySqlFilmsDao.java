package com.pluralsight.services.mysql;

import com.mysql.cj.xdevapi.SqlResult;
import com.pluralsight.models.Film;
import com.pluralsight.services.FilmsDao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        title = "%" + title + "%";
        var films = new ArrayList<Film>();

        try(Connection connection = dataSource.getConnection())
        {
            String sql = """
                        SELECT film_id
                            , title
                            , description
                            , release_year
                            , length
                        FROM film
                        WHERE title LIKE ?;
                    """;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, title);
            ResultSet row = preparedStatement.executeQuery();

            while (row.next())
            {
                Film film = mapRowToFilm(row);
                films.add(film);
            }
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
            String sql = """
                        SELECT f.film_id
                            , title
                            , description
                            , release_year
                            , length
                        FROM film AS f 
                        INNER JOIN film_actor AS fa
                            ON fa.film_id = f.film_id
                        WHERE fa.actor_id = ?;
                    """;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, actorId);
            ResultSet row = preparedStatement.executeQuery();

            while (row.next())
            {
                Film film = mapRowToFilm(row);
                films.add(film);
            }
        }
        catch (SQLException e)
        {
        }

        return films;
    }

    @Override
    public Film findFilmById(int id)
    {

        try(Connection connection = dataSource.getConnection())
        {
            String sql = """
                        SELECT film_id
                            , title
                            , description
                            , release_year
                            , length
                        FROM film
                        WHERE film_id = ?;
                    """;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet row = preparedStatement.executeQuery();

            if (row.next())
            {
                return mapRowToFilm(row);
            }
        }
        catch (SQLException e)
        {
        }
        return null;
    }

    @Override
    public Film addFilm(Film film)
    {

        try(Connection connection = dataSource.getConnection())
        {
            String sql = """
                    INSERT INTO film (title, description, release_year, length)
                    VALUES (?, ?, ?, ?);
                    """;
            PreparedStatement preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, film.getTitle());
            preparedStatement.setString(2, film.getDescription());
            preparedStatement.setInt(3, film.getReleaseYear());
            preparedStatement.setInt(4, film.getLength());

            preparedStatement.executeUpdate();

            ResultSet key = preparedStatement.getGeneratedKeys();
            key.next();
            int filmId = key.getInt(1);

            return findFilmById(filmId);
        }
        catch (SQLException e)
        {
        }

        return new Film();
    }

    @Override
    public void updateFilm(Film film)
    {

        try(Connection connection = dataSource.getConnection())
        {
            String sql = """
                    UPDATE film 
                    SET title = ?
                      , description = ?
                      , release_year = ?
                      , length = ?
                    WHERE film_id = ?;
                    """;
            PreparedStatement preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, film.getTitle());
            preparedStatement.setString(2, film.getDescription());
            preparedStatement.setInt(3, film.getReleaseYear());
            preparedStatement.setInt(4, film.getLength());
            preparedStatement.setInt(5, film.getFilmId());

            preparedStatement.executeUpdate();
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
            String sql = """
                    DELETE FROM film
                    WHERE film_id = ?;
                    """;
            PreparedStatement preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, filmId);

            preparedStatement.executeUpdate();
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
            String sql = """
                    INSERT INTO film_actor (film_id, actor_id)
                    VALUES (?, ?);
                    """;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, filmId);
            statement.setInt(2, actorId);
            statement.executeUpdate();
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
            String sql = """
                    DELETE FROM film_actor
                    WHERE film_id = ?
                      AND actor_id = ?;
                    """;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, filmId);
            statement.setInt(2, actorId);
            statement.executeUpdate();
        }
        catch (SQLException e)
        {
        }
    }

    private Film mapRowToFilm(ResultSet row) throws SQLException
    {
        int filmId = row.getInt("film_id");
        String filmTitle = row.getString("title");
        String description = row.getString("description");
        int releaseYear = row.getInt("release_year");
        int length = row.getInt("length");

        return new Film(filmId, filmTitle, description, releaseYear, length);
    }
}

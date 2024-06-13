package com.pluralsight.services;

import com.pluralsight.models.Actor;
import com.pluralsight.models.Film;

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
    public List<Film> getFilmByActorId(int id)
    {
        List<Film> films = new ArrayList<>();
        try(Connection connection = dataSource.getConnection())
        {
            String sql = """
                    select f.film_id as filmId,
                           f.title,
                           f.description,
                           f.release_year as releaseYear,
                           f.language_id as languageId,
                           f.original_language_id as originalLanguageId,
                           f.rental_duration as rentalDuration,
                           f.rental_rate as rentalRate,
                           f.length,
                           f.replacement_cost as replacementCost,
                           f.rating,
                           f.special_features as specialFeatures,
                           f.last_update as lastUpdate
                    from film AS f
                    inner join film_actor as fa on f.film_id = fa.film_id
                    where fa.actor_id = ?
                    """;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);

            ResultSet row = statement.executeQuery();

            if(row.next())
            {
                int filmId = row.getInt("filmId");
                String title = row.getString("title");
                String description = row.getString("description");
                String releaseYear = row.getString("releaseYear");
                int languageId = row.getInt("languageId");
                int originalLanguageId = row.getInt("originalLanguageId");
                int rentalDuration = row.getInt("rentalDuration");
                int rentalRate = row.getInt("rentalRate");
                int length = row.getInt("length");
                double replacementCost = row.getDouble("replacementCost");
                String rating = row.getString("rating");
                String specialFeatures = row.getString("specialFeatures");
                String lastUpdate = row.getString("lastUpdate");

                Film film = new Film(filmId, title, description, releaseYear, languageId, originalLanguageId, rentalDuration, rentalRate, length, replacementCost, rating, specialFeatures, lastUpdate);
                 films.add(film);
            }
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return films;
    }

}

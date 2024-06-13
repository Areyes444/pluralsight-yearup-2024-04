package com.pluralsight.services;

import com.pluralsight.models.Actor;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySqlActorsDao implements ActorsDao
{
    private DataSource dataSource;

    public MySqlActorsDao(DataSource dataSource)
    {
        this.dataSource = dataSource;
    }

    @Override
    public List<Actor> getActorByName(String ActorName)
    {
        List<Actor> actors = new ArrayList<>();
        try(Connection connection = dataSource.getConnection())
        {
            //cant us an alias name in the where clause
            String sql = """
                    select actor_id as id
                    , first_name as firstName
                    , last_name as lastName
                     , last_update as lastUpdate
                    from actor
                    where first_name = ? or last_name = ?
                    """;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, ActorName);
            statement.setString(2, ActorName);
            ResultSet row = statement.executeQuery();
            while ((row.next())) //keep looping as long as there is more
            {
                int id = row.getInt("id");
                String firstName = row.getString("firstName");
                String lastName = row.getString("lastName");
                String lastUpdate = row.getString("lastUpdate");

                Actor actor = new Actor(id, firstName,lastName, lastUpdate);
                actors.add(actor);
            }
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return actors;

    }

}

package com.pluralsight.services.mysql;

import com.pluralsight.models.Actor;
import com.pluralsight.services.ActorsDao;

import javax.sql.DataSource;
import java.sql.*;
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
    public List<Actor> getAll()
    {
        List<Actor> actors = new ArrayList<>();

        try(Connection connection = dataSource.getConnection())
        {
            String sql = """
                        SELECT actor_id
                            , first_name
                            , last_name
                        FROM actor;
                    """;

            Statement statement = connection.createStatement();
            ResultSet row = statement.executeQuery(sql);

            while(row.next())
            {
                int actorId = row.getInt("actor_id");
                String firstName = row.getString("first_name");
                String lastName = row.getString("last_name");

                actors.add(new Actor(actorId, firstName, lastName));
            }
        }
        catch(Exception e)
        {

        }
        return actors;
    }

    @Override
    public List<Actor> searchByName(String firstName, String lastName)
    {
        var actors = new ArrayList<Actor>();

        try(Connection connection = dataSource.getConnection())
        {
            // search logic here
        }
        catch (SQLException e)
        {
        }

        return actors;
    }

    @Override
    public void addActor(Actor actor)
    {
        try(Connection connection = dataSource.getConnection())
        {
            String sql = "INSERT INTO actor (first_name, last_name) VALUES (?,?);";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, actor.getFirstName());
            statement.setString(2, actor.getLastName());

            statement.executeUpdate();
        }
        catch (Exception e){}
    }

    @Override
    public void updateActor(Actor actor)
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
    public void deleteActor(int actorId)
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

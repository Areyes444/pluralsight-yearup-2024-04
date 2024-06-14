package com.pluralsight.application;

import com.pluralsight.controllers.ActorsController;
import com.pluralsight.services.ActorsDao;
import com.pluralsight.services.FilmsDao;
import com.pluralsight.services.mysql.MySqlActorsDao;
import com.pluralsight.services.mysql.MySqlFilmsDao;
import com.pluralsight.views.HomeView;
import com.pluralsight.views.actors.*;
import com.pluralsight.views.films.FilmsHomeView;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ApplicationConfiguration
{
    // datasources
    public final DataSource dataSource = buildDataSource();

    private static DataSource buildDataSource()
    {
        try (FileInputStream stream = new FileInputStream("src/main/resources/config.properties"))
        {
            // first get the variables from the properties file
            Properties properties = new Properties();
            properties.load(stream);

            String connectionString = properties.getProperty("db.connectionString");
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            // build a BasicDataSource object
            BasicDataSource dataSource = new BasicDataSource();
            dataSource.setUrl(connectionString);
            dataSource.setUsername(username);
            dataSource.setPassword(password);

            return dataSource;

        }
        catch (IOException e)
        {
        }

        return null;
    }

    // daos
    public ActorsDao actorsDao = new MySqlActorsDao(dataSource);
    public FilmsDao filmsDao = new MySqlFilmsDao(dataSource);

    // controllers
    public ActorsController actorsController = new ActorsController(actorsDao);

    // views
    public HomeView homeView = new HomeView();

    public ActorsHomeView actorsHomeView = new ActorsHomeView();
    public ActorSearchView actorSearchView = new ActorSearchView();
    public ActorSearchByIdView actorSearchByIdView = new ActorSearchByIdView();
    public ActorDetailView actorDetailView = new ActorDetailView();
    public ActorListView actorListView = new ActorListView();
    public ActorAddView actorAddView = new ActorAddView();
    public ActorDeleteView actorDeleteView = new ActorDeleteView();
    public ActorUpdateView actorUpdateView = new ActorUpdateView();

    public FilmsHomeView filmsHomeView = new FilmsHomeView();

}

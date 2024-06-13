package com.pluralsight;

import com.pluralsight.application.SakilaMoviesApplication;
import com.pluralsight.controllers.ActorsController;
import com.pluralsight.services.ActorsDao;
import com.pluralsight.services.csv.CsvActorsDao;
import com.pluralsight.services.mysql.MySqlActorsDao;
import com.pluralsight.views.ActorAddView;
import com.pluralsight.views.ActorListView;
import com.pluralsight.views.HomeView;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main
{
    public static void main(String[] args)
    {
        DataSource dataSource = buildDataSource();
        // MySqlActorsDao needs a datasource
        ActorsDao actorsDao = new MySqlActorsDao(dataSource);
//        ActorsDao actorsDao = new CsvActorsDao();
        // ActorsController needs an ActorsDao
        ActorsController actorsController = new ActorsController(actorsDao);

        HomeView homeView = new HomeView();
        ActorListView actorListView = new ActorListView();
        ActorAddView actorAddView = new ActorAddView();

        // the Application needs controllers and views
        SakilaMoviesApplication app = new SakilaMoviesApplication(actorsController, homeView, actorListView, actorAddView);
        app.run();

    }



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
}
package com.pluralsight.services.csv;

import com.pluralsight.models.Actor;
import com.pluralsight.services.ActorsDao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CsvActorsDao implements ActorsDao
{

    @Override
    public List<Actor> getAll()
    {
        var actors = new ArrayList<Actor>();

        File file = new File("files/actors.csv");

        try(Scanner scanner = new Scanner(file))
        {
          scanner.nextLine();

          while (scanner.hasNextLine())
          {
              var line = scanner.nextLine();
              var columns = line.split("\\|");

              Actor actor = new Actor(Integer.parseInt(columns[0]), columns[1], columns[2]);
              actors.add(actor);
          }
        }
        catch (Exception e)
        {}

        return actors;
    }

    @Override
    public void addActor(Actor actor)
    {

    }
}

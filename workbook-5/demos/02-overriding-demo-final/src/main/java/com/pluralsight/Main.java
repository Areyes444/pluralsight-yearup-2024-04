package com.pluralsight;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(1, "Sarah"));
        people.add(new Child(2, "Jack"));
        people.add(new Violinist(3, "Zoe"));
        people.add(new SoftballPlayer(4, "Linda"));
        people.add(new Gamer(5, "Guy"));
        people.add(new Gamer(6, "Dana"));

        for(Person person : people)
        {
            play(person);
        }

    }

    public static void play(Person person)
    {
        String message = person.play();

        // what type of person is this
        if(person instanceof Violinist)
        {
            Violinist violinist = (Violinist) person;
            System.out.println(violinist.tune());
        }
        else if(person instanceof SoftballPlayer)
        {
            SoftballPlayer softballPlayer = (SoftballPlayer) person;
            System.out.println(softballPlayer.warmup());
        }

        System.out.println(message);
        for(int i = 0; i < 20; i++)
        {
            int repeat = i % 5;
            System.out.print(".".repeat(repeat) + "\r");
            try
            {
                Thread.sleep(10);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
        System.out.println();


        // what type of person is this
        if(person instanceof Child)
        {
            Child child = (Child) person;
            System.out.println(child.cry());
        }
        else if(person instanceof Gamer)
        {
            Gamer gamer = (Gamer) person;
            System.out.println(gamer.rageQuit());
        }
    }
}
package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        Person person = new Person(1, "Sarah");
        play(person);

    }

    public static void play(Person p)
    {
        String message = p.play();

        System.out.println(message);
        for(int i = 0; i < 20; i++)
        {
            int repeat = i % 5;
            System.out.print(".".repeat(repeat) + "\r");
            try
            {
                Thread.sleep(250);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }
}
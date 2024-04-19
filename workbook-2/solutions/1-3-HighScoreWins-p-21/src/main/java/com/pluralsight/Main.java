package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        findWinner("Home:Visitor|21:9");
        findWinner("Slytherin:Gryffindor|23:59");
        findWinner("Warriors:Nuggets|112:123");
    }

    public static void findWinner(String gameResult)
    {
        String[] words = gameResult.split("[:|]");
        String team1 = words[0];
        String team2 = words[1];
        int score1 = Integer.parseInt(words[2]);
        int score2 = Integer.parseInt(words[3]);

        System.out.println();
        System.out.println(gameResult);
        if(score1 == score2)
        {
            System.out.println("Winner: Tie");
        }
        else if(score1 > score2)
        {
            System.out.println("Winner: " + team1);
        }
        else
        {
            System.out.println("Winner: " + team2);
        }
    }
}
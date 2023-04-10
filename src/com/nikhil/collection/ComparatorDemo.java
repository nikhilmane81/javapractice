package com.nikhil.collection;


import java.util.Arrays;
import java.util.Comparator;

class Checker implements Comparator<Player>
{
    public int compare(Player p1, Player p2)
    {
        if(p1.score==p2.score)
            return p1.name.compareTo(p2.name);
        else
            return Integer.compare(p2.score, p1.score);
    }
}

class Player
{
    String name;
    int score;
    Player(String name, int score)
    {
        this.name =name;
        this.score=score;
    }
}

public class ComparatorDemo
{

    public static void main(String[] args) {
            Player p1 = new Player("Nikhil", 89);
            Player p2 = new Player("Sonam", 45);
            Player p3 = new Player("Nisur", 56);
            Player p4 = new Player("Aish", 89);
            Player p5 = new Player("Aron", 56);
            Player[] arr = {p1,p2,p3,p4,p5};
            Checker checker = new Checker();

            Arrays.sort(arr,checker);
        for (Player player : arr) {
            System.out.println(player.name+" "+ player.score);
        }


    }

}

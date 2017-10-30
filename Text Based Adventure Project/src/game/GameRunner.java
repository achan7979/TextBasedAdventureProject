package game;

import items.Item;
import rooms.*;
import people.Person;

import java.util.Scanner;
import java.util.Scanner;
public class GameRunner 
{
    public static void main (String[] args)
    {
        Room[][] map = new Room[5][5];
        for (int j = 0; j<map.length; j++)
        {
        	Room[] row = map[j];
            for (int i = 0; i<row.length;i++)
            {
                boolean[] doors = {true,true,true,true};
                Person[] people = {};
                Item[] items = {};

                row[i] = new Hallway(doors, people, items, i, j);
            }

        }

        School tech = new School(map);

        Scanner x = new Scanner(System.in);
        boolean gameOn = true;
        System.out.println("Please enter your first and last name, gender and date of birth in this specific order. Be sure to hit the enter key"
        		+ " after every new input.");
        Person player1 = new Person(x.next(), x.next(), x.next(), x.next());
        System.out.println("Welcome to the Halls of Tech, " + player1.getFirstName());
    	Scanner in = new Scanner(System.in);
        while(gameOn)
        {
            map[0][0].addOccupant(player1);
            tech.printMap();
            player1.printRoom();
    		System.out.println("Where would you like to move, " + player1.firstName + "?");
            String response = in.next();
            System.out.println(player1.chooseMove(response.toString()));
            
            //Utilities.movePlayer(tech, player1,move);
            //gameOn = false;
            







        }
		in.close();
    }

}




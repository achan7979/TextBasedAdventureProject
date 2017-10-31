package game;

import items.Item;
import rooms.*;
import people.Person;

import java.util.Scanner;

import board.Board;

import java.util.Scanner;
public class GameRunner 
{
	public String[] nCnames = {"Stick","Crowbar","Note","Smart Phone","Bookbag"};
	public String[] Cnames = {"Chocolate Bar","Energy Drink","Apple","Orange","Baguette"};
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

        Board factory = new Board(map);

        Scanner x = new Scanner(System.in);
        boolean gameOn = true;
        System.out.println("Please enter your first and last name, gender and date of birth in this SPECIFIC ORDER. BE SURE TO HIT THE ENTER KEY"
        		+ " AFTER EVERY NEW INPUT.");
        Person player1 = new Person(x.next(), x.next(), x.next(), x.next());
        System.out.println("The old abandoned factory only known as 'The Bunker' stands before you.\nYou've heard only bad rumors about it but"
        		+ " you have come to confirm them.\nIts old, rusty and gives off an ominous feel. Regardless, you head in.\n" + 
        		player1.firstName + " " + player1.lastName + ", " + player1.gender + ", " + player1.age + ". Heading in with no regrets.");
    	Scanner in = new Scanner(System.in);
        while(gameOn)
        {
            factory.printMap();
            player1.printRoom();
    		System.out.println("Where would you like to move, " + player1.firstName + "?");
            String response = in.next();
            System.out.println(player1.chooseMove(factory,response.toString()));
            
            //Utilities.movePlayer(tech, player1,move);
            //gameOn = false;
            
            
            
            
            
            
            
            
        }
		in.close();
    }

}




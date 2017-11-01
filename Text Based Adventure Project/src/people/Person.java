package people;
import java.util.Scanner;

import board.Board;
import rooms.Room;
import game.GameRunner;
public class Person 
{
	public String firstName;
	public String lastName;
	public String gender;
	public String age;
	public int xPos = 1;
	public int yPos = 1;
	
	public Person(String firstName, String lastName, String gender, String age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
	}
	
	public String chooseMove(Board factory, String move) 
	{
		if(move.equals("n") || move.equals("N") || move.equals("north") || move.equals("North"))
		{
			if(yPos == 1)
				return "As you try to move, you bump into a wall. Its rough and dusty. The way you came in from"
						+ "is blocked off by rubble.";
			else
			{
				yPos = yPos - 1;
				return "You move to the north.";
			}
		}
		else if(move.equals("s") || move.equals("S") || move.equals("south") || move.equals("South"))
		{
			if(yPos == 5)
				return "You attempt to continue moving, however you run into a wall. Its wet and smells of iron.";
			else
			{
				yPos = yPos + 1;
				return "You move to the south.";
			}
		}
		else if(move.equals("e") || move.equals("E") || move.equals("east") || move.equals("East"))
		{
			if(xPos == 5)
				return "You try to move, but encounter a wall of what seems like is made of metal. "
						+ "It may be a large loading bay door, but you are uncertain.";
			else
			{
				xPos = xPos + 1;
				return "You move to the east.";
			}
		}
		else if(move.equals("w") || move.equals("W") || move.equals("west") || move.equals("West"))
		{
			if(xPos == 1)
				return "You run into shipping containers that block off the exit.";
			else
			{
				xPos = xPos - 1;
				return "You move to the west.";
			}
		}
		else
		{
			return "Please enter a valid direction.";
		}
	}

	public void setRoom(Room room) 
	{
		
	}

	public String print() 
	{
		return "";
	}

	public void printRoom() 
	{
		
		
	}


}
